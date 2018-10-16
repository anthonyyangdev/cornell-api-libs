package api.cornell.response.classes

import api.cornell.data.classes.AcademicGroup
import com.google.gson.annotations.SerializedName

/**
 * [AcademicGroupsResponse] is the response of a Academic Groups request.
 */
internal class AcademicGroupsResponse private constructor() {

    /**
     * Main data of response.
     */
    private val data: Data = Data()
    /**
     * Obtain the academic groups information.
     */
    val academicGroups: List<AcademicGroup> get() = data.academicGroups

    /**
     * [Data] is an uninteresting class that just holds an array of [AcademicGroup].
     */
    private inner class Data internal constructor() {
        @SerializedName(value = "acadGroups")
        val academicGroups: List<AcademicGroup> = emptyList()
    }

}


