package api.cornell.response.classes

import api.cornell.data.classes.Subject

/**
 * [SubjectsResponse] is the response of a Subjects request.
 */
internal class SubjectsResponse private constructor() {

    /**
     * Main data of response.
     */
    private val data: Data = Data()
    /**
     * Obtain the class levels information.
     */
    val subjects: List<Subject> get() = data.subjects

    /**
     * [Data] is an uninteresting class that just holds an array of [Subject].
     */
    private inner class Data internal constructor() {
        val subjects: List<Subject> = emptyList()
    }

}


