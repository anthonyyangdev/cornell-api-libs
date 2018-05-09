package api.cornell;

import api.cornell.data.classes.AcademicCareer;
import api.cornell.data.classes.AcademicGroup;
import api.cornell.data.classes.ClassLevel;
import api.cornell.data.classes.Course;
import api.cornell.data.classes.Roster;
import api.cornell.data.classes.Subject;
import api.cornell.data.eatery.Eatery;
import api.cornell.data.eatery.Page;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;

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
        CountDownLatch latch = new CountDownLatch(1);
        AtomicReference<List<Roster>> rostersVar = new AtomicReference<>();
        ClassesApiClient client = ClassesApiClient.getInstance();
        client.getRosters(it -> {
            rostersVar.set(it);
            latch.countDown();
        });
        latch.await();
        List<Roster> rosters = rostersVar.get();
        if (rosters == null) {
            fail();
            return;
        }
        for (Roster roster : rosters) {
            allItems.add(roster.toString());
            String semester = roster.getSemester();
            if (!semester.contains("FA") && !semester.contains("SP")) {
                continue;
            }
            CountDownLatch latch1 = new CountDownLatch(5);
            AtomicReference<List<AcademicCareer>> careersVar = new AtomicReference<>();
            AtomicReference<List<AcademicGroup>> groupsVar = new AtomicReference<>();
            AtomicReference<List<ClassLevel>> classLevelsVar = new AtomicReference<>();
            AtomicReference<List<Subject>> subjectsVar = new AtomicReference<>();
            AtomicReference<List<Course>> coursesVar = new AtomicReference<>();
            client.getAcademicCareers(semester, it -> {
                careersVar.set(it);
                latch1.countDown();
            });
            client.getAcademicGroups(semester, it -> {
                groupsVar.set(it);
                latch1.countDown();
            });
            client.getClassLevels(semester, it -> {
                classLevelsVar.set(it);
                latch1.countDown();
            });
            client.getSubjects(semester, it -> {
                subjectsVar.set(it);
                latch1.countDown();
            });
            client.getCourses(semester, Subject.CS, it -> {
                coursesVar.set(it);
                latch1.countDown();
            });
            latch1.await();
            List<AcademicCareer> careers = careersVar.get();
            List<AcademicGroup> groups = groupsVar.get();
            List<ClassLevel> classLevels = classLevelsVar.get();
            List<Subject> subjects = subjectsVar.get();
            List<Course> courses = coursesVar.get();
            if (careers == null) {
                fail();
                return;
            }
            if (groups == null) {
                fail();
                return;
            }
            if (classLevels == null) {
                fail();
                return;
            }
            if (subjects == null) {
                fail();
                return;
            }
            if (courses == null) {
                fail();
                return;
            }
            Consumer<Object> c = it -> allItems.add(it.toString());
            careers.forEach(c);
            groups.forEach(c);
            classLevels.forEach(c);
            subjects.forEach(c);
            courses.forEach(c);
        }
        for (String item : allItems) {
            if (item == null) {
                fail("Bad NULL!");
            }
        }
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
