package com.developersam.api.cornell

import com.developersam.api.cornell.data.AcademicCareer
import com.developersam.api.cornell.data.AcademicGroup
import com.developersam.api.cornell.data.ClassLevel
import com.developersam.api.cornell.data.Course
import com.developersam.api.cornell.data.Roster
import com.developersam.api.cornell.data.Subject
import com.developersam.api.cornell.data.SubjectValue
import org.junit.*
import java.util.concurrent.CountDownLatch
import java.util.concurrent.atomic.AtomicReference

/**
 * [DataValidTest] ensures that all the data are valid.
 */
class DataValidTest {

    @Test
    fun validityTest() {
        val allItems = ArrayList<String?>(1 shl 10)
        val latch = CountDownLatch(1)
        val rostersVar = AtomicReference<List<Roster>?>()
        ApiClient.getRosters {
            rostersVar.set(it)
            latch.countDown()
        }
        latch.await()
        val rosters = rostersVar.get() ?: throw Error()
        for (roster in rosters) {
            allItems.add(roster.toString())
            val semester = roster.semester
            if (!semester.contains("FA") && !semester.contains("SP")) {
                continue
            }
            val latch1 = CountDownLatch(5)
            val careersVar = AtomicReference<List<AcademicCareer>?>()
            val groupsVar = AtomicReference<List<AcademicGroup>?>()
            val classLevelsVar = AtomicReference<List<ClassLevel>?>()
            val subjectsVar = AtomicReference<List<Subject>?>()
            val coursesVar = AtomicReference<List<Course>?>()
            ApiClient.getAcademicCareers(roster = semester) {
                careersVar.set(it)
                latch1.countDown()
            }
            ApiClient.getAcademicGroups(roster = semester) {
                groupsVar.set(it)
                latch1.countDown()
            }
            ApiClient.getClassLevels(roster = semester) {
                classLevelsVar.set(it)
                latch1.countDown()
            }
            ApiClient.getSubjects(roster = semester) {
                subjectsVar.set(it)
                latch1.countDown()
            }
            ApiClient.getCourses(roster = semester, subject = SubjectValue.CS) {
                coursesVar.set(it)
                latch1.countDown()
            }
            latch1.await()
            val careers = careersVar.get() ?: throw Error()
            val groups = groupsVar.get() ?: throw Error()
            val classLevels = classLevelsVar.get() ?: throw Error()
            val subjects = subjectsVar.get() ?: throw Error()
            val courses = coursesVar.get() ?: throw Error()
            for (item in careers) {
                allItems.add(item.toString())
            }
            for (item in groups) {
                allItems.add(item.toString())
            }
            for (item in classLevels) {
                allItems.add(item.toString())
            }
            for (item in subjects) {
                allItems.add(item.toString())
            }
            for (item in courses) {
                allItems.add(item.toString())
            }
        }
        for (item in allItems) {
            if (item == null) {
                throw Error("Bad NULL!")
            }
        }
    }

}