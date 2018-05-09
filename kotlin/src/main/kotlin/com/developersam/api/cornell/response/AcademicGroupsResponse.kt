package com.developersam.api.cornell.response

import com.developersam.api.cornell.data.AcademicGroup
import com.google.gson.annotations.SerializedName

/**
 * [AcademicGroupsResponse] is the response of a Academic Groups request.
 */
internal class AcademicGroupsResponse private constructor() {

    /**
     * Main data of response.
     */
    private val data: Data? = null
    /**
     * Obtain the academic groups information.
     */
    val academicGroups: List<AcademicGroup>?
        get() = data?.academicGroups

    /**
     * [Data] is an uninteresting class that just holds an array of [AcademicGroup].
     */
    private inner class Data private constructor() {
        @SerializedName(value = "acadGroups")
        val academicGroups: List<AcademicGroup>? = null
    }

}


