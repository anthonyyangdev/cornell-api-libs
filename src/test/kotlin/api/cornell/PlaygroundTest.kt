package api.cornell

import org.junit.Ignore
import org.junit.Test

/**
 * [PlaygroundTest] contains many example code that can also be used as tests.
 */
@Ignore
class PlaygroundTest {

    /**
     * This test obtains the most recent information of all existing classes found on Roster.
     */
    @Test
    fun getAllClassWithMostRecentInfoTest() {
        ClassesApiClient.getAllCourses(doPrintDebuggingInfo = true)
    }

}

