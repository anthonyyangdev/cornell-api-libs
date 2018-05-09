package com.developersam.api.cornell.data

import com.google.gson.annotations.SerializedName

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

/**
 * [ClassLevel] contains all the useful information about class levels.
 *
 * @param value value of the academic group.
 */
data class ClassLevel(@SerializedName(value = "descr") val value: Int = 0)
