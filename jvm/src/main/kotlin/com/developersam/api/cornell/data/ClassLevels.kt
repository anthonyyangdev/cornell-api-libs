package com.developersam.api.cornell.data

import com.google.gson.annotations.SerializedName

/**
 * [ClassLevelsResponse] is the response of a Class Levels request.
 */
internal class ClassLevelsResponse private constructor() {

    /**
     * Main data of response.
     */
    private lateinit var data: Data
    /**
     * Obtain the class levels information.
     */
    val classLevels: List<ClassLevel>
        get() = data.classLevels

    /**
     * [Data] is an uninteresting class that just holds an array of [ClassLevel].
     */
    private inner class Data private constructor() {
        lateinit var classLevels: List<ClassLevel>
    }

}

/**
 * [ClassLevel] contains all the useful information about class levels.
 */
class ClassLevel private constructor() {

    /**
     * Text description of the value.
     */
    @SerializedName(value = "value")
    lateinit var description: String
        private set

    /**
     * Value of the academic group.
     */
    @SerializedName(value = "descr")
    val value: Int = 0

}
