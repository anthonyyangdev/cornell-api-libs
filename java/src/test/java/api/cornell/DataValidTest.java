package api.cornell;

import api.cornell.data.eatery.Eatery;
import api.cornell.data.eatery.Page;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;

import static junit.framework.TestCase.fail;

/**
 * {@code DataValidTest} ensures that all the data are valid.
 */
public class DataValidTest {
    
    /**
     * Test the validity of data from [ClassesApiClient]
     */
    @Test
    public void classApiClientValidityTest() throws InterruptedException {
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
    public void diningApiClientValidityTest() throws InterruptedException {
        List<String> allItems = new ArrayList<>(1 << 10);
        CountDownLatch latch = new CountDownLatch(2);
        AtomicReference<List<Page>> pagesVar = new AtomicReference<>();
        AtomicReference<List<Eatery>> eateriesVar = new AtomicReference<>();
        DiningApiClient client = DiningApiClient.getInstance();
        client.getPages(it -> {
            pagesVar.set(it);
            latch.countDown();
        });
        client.getEateries(it -> {
            eateriesVar.set(it);
            latch.countDown();
        });
        latch.await();
        List<Page> pages = pagesVar.get();
        if (pages == null) {
            fail();
            return;
        }
        List<Eatery> eateries = eateriesVar.get();
        if (eateries == null) {
            fail();
            return;
        }
        for (Page page : pages) {
            allItems.add(page.toString());
        }
        for (Eatery eatery : eateries) {
            allItems.add(eatery.toString());
        }
        for (String item : allItems) {
            if (item == null) {
                fail("Bad NULL!");
            }
        }
    }
    
}
