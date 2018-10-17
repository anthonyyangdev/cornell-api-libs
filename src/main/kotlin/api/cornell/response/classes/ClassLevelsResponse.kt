package api.cornell.response.classes

import api.cornell.data.classes.ClassLevel

/**
 * [ClassLevelsResponse] is the response of a Class Levels request.
 */
internal class ClassLevelsResponse private constructor() {

    /**
     * Main data of response.
     */
    private val data: Data = Data()
    /**
     * Obtain the class levels information.
     */
    val classLevels: List<ClassLevel> get() = data.classLevels

    /**
     * [Data] is an uninteresting class that just holds an array of [ClassLevel].
     */
    private inner class Data internal constructor() {
        val classLevels: List<ClassLevel> = emptyList()
    }

}