@file:JvmName(name = "Main")

package api.cornell

import com.google.gson.GsonBuilder

/**
 * Print the help message.
 */
private fun printHelp() {
    println("""
            Usage: java -jar cornell-api-lib-kotlin.jar [arg]
            Possible args:
            print-all-courses: prints the JSON of a list of all courses in all semesters
            print-all-courses-in [sem]: prints the JSON of a list of the all courses in semester [sem].
            print-all-cs-recent: prints the JSON of a list of all CS courses in recent semesters.
        """.trimIndent())
}

/**
 * The main entry point.
 */
fun main(args: Array<String>) {
    if (args.isEmpty()) {
        printHelp()
        return
    }
    val gson = GsonBuilder().setPrettyPrinting().create()
    when (args[0]) {
        "print-all-courses" ->
            gson.toJson(
                    ClassesApiClient.getAllCourses(doPrintDebuggingInfo = true),
                    System.out
            )
        "print-all-courses-in" ->
            gson.toJson(
                    ClassesApiClient.getAllCoursesInSemester(
                            semester = args[1], doPrintDebuggingInfo = true
                    ),
                    System.out
            )
        "print-all-cs-recent" ->
            gson.toJson(
                    ClassesApiClient.getAllRecentCSCourses(doPrintDebuggingInfo = true),
                    System.out
            )
    }
}
