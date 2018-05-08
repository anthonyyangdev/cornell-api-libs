package com.developersam.api.cornell.data

import com.google.gson.annotations.SerializedName
/**
 * [AcademicGroupsResponse] is the response of a Academic Groups request.
 */
internal class AcademicGroupsResponse private constructor() {

    /**
     * Main data of response.
     */
    private lateinit var data: Data
    /**
     * Obtain the academic groups information.
     */
    val academicGroups: List<AcademicGroup>
        get() = data.academicGroups

    /**
     * [Data] is an uninteresting class that just holds an array of [AcademicGroup].
     */
    private inner class Data private constructor() {
        lateinit var academicGroups: List<AcademicGroup>
    }

}

/**
 * [AcademicGroup] contains all the useful information about academic groups.
 */
class AcademicGroup private constructor() {

    /**
     * Value of the academic group.
     */
    lateinit var value: AcademicGroupValue
        private set

    /**
     * Text description of the value.
     */
    @SerializedName(value = "descr")
    lateinit var description: String
        private set

}
