package com.developersam.api.cornell.data

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
        val academicGroups: List<AcademicGroup>? = null
    }

}

/**
 * [AcademicGroup] contains all the useful information about academic groups.
 *
 * @param value value of the academic group.
 */
data class AcademicGroup(val value: AcademicGroupValue)
