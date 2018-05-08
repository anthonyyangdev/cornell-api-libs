package com.developersam.api.cornell.data

import com.google.gson.annotations.SerializedName

/**
 * [SubjectsResponse] is the response of a Subjects request.
 */
internal class SubjectsResponse private constructor() {

    /**
     * Main data of response.
     */
    private lateinit var data: Data
    /**
     * Obtain the class levels information.
     */
    val subjects: List<Subject>
        get() = data.subjects

    /**
     * [Data] is an uninteresting class that just holds an array of [ClassLevel].
     */
    private inner class Data private constructor() {
        lateinit var subjects: List<Subject>
    }

}

/**
 * [Subject] contains all the useful information about subjects.
 */
class Subject private constructor() {

    /**
     * Value of the academic group.
     */
    lateinit var value: SubjectValue
        private set

    /**
     * Text description of the value.
     */
    @SerializedName(value = "descr")
    lateinit var description: String
        private set

    /**
     * Formal Text description of the value.
     */
    @SerializedName(value = "descrformal")
    lateinit var formalDescription: String
        private set

}
