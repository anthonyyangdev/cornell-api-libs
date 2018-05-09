package api.cornell.response.classes

import api.cornell.data.classes.ClassLevel

/**
 * [ClassLevelsResponse] is the response of a Class Levels request.
 */
internal class ClassLevelsResponse private constructor() {

    /**
     * Main data of response.
     */
    private val data: Data? = null
    /**
     * Obtain the class levels information.
     */
    val classLevels: List<ClassLevel>?
        get() = data?.classLevels

    /**
     * [Data] is an uninteresting class that just holds an array of [ClassLevel].
     */
    private inner class Data private constructor() {
        val classLevels: List<ClassLevel>? = null
    }

}