@file:JvmName(name = "Main")

package api.cornell

import com.google.gson.Gson

/**
 * The main entry point.
 */
fun main(args: Array<String>) {
    if (args.isEmpty()) {
        println("""
            Usage: java -jar cornell-api-lib-kotlin.jar [arg]
            Possible args:
            print-all-courses: prints the JSON of a list of all courses in all semesters
        """.trimIndent())
        return
    }
    if (args[0] == "print-all-courses") {
        Gson().toJson(ClassesApiClient.getAllCourses(doPrintDebuggingInfo = true), System.out)
    }
}
