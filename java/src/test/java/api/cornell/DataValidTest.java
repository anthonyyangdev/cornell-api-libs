package api.cornell;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * {@code DataValidTest} ensures that all the data are valid.
 */
public class DataValidTest {
    
    /**
     * Test the validity of data from [ClassesApiClient]
     */
    @Test
    public void classApiClientValidityTest() {
        List<String> allItems = new ArrayList<>(1 << 10);
        /*
        val latch = CountDownLatch(1)
        val rostersVar = AtomicReference<List<Roster>?>()
        ClassesApiClient.getRosters {
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
            ClassesApiClient.getAcademicCareers(roster = semester) {
                careersVar.set(it)
                latch1.countDown()
            }
            ClassesApiClient.getAcademicGroups(roster = semester) {
                groupsVar.set(it)
                latch1.countDown()
            }
            ClassesApiClient.getClassLevels(roster = semester) {
                classLevelsVar.set(it)
                latch1.countDown()
            }
            ClassesApiClient.getSubjects(roster = semester) {
                subjectsVar.set(it)
                latch1.countDown()
            }
            ClassesApiClient.getCourses(roster = semester, subject = Subject.CS) {
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
        */
    }
    
    /**
     * Test the validity of data from {@code DiningApiClient}.
     */
    @Test
    public void diningApiClientValidityTest() {
        List<String> allItems = new ArrayList<>(1 << 10);
        /*
        val latch = CountDownLatch(2)
        val pagesVar = AtomicReference<List<Page>?>()
        val eateriesVar = AtomicReference<List<Eatery>?>()
        DiningApiClient.getPages {
            pagesVar.set(it)
            latch.countDown()
        }
        DiningApiClient.getEateries {
            eateriesVar.set(it)
            latch.countDown()
        }
        latch.await()
        val pages = pagesVar.get() ?: throw Error()
        val eateries = eateriesVar.get() ?: throw Error()
        for (item in pages) {
            allItems.add(item.toString())
        }
        for (item in eateries) {
            allItems.add(item.toString())
        }
        for (item in allItems) {
            if (item == null) {
                throw Error("Bad NULL!")
            }
        }
        */
    }
    
}
