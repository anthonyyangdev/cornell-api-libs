package api.cornell.response

import api.cornell.data.Subject

/**
 * [SubjectsResponse] is the response of a Subjects request.
 */
internal class SubjectsResponse private constructor() {

    /**
     * Main data of response.
     */
    private val data: Data? = null
    /**
     * Obtain the class levels information.
     */
    val subjects: List<Subject>?
        get() = data?.subjects

    /**
     * [Data] is an uninteresting class that just holds an array of [ClassLevel].
     */
    private inner class Data private constructor() {
        val subjects: List<Subject>? = null
    }

}


