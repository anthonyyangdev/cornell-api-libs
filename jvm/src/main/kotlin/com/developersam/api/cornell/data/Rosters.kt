package com.developersam.api.cornell.data

import com.google.gson.annotations.SerializedName

/**
 * [RostersResponse] is the response of a Rosters request.
 */
internal class RostersResponse private constructor(private val data: Data) {

    /**
     * Obtain the rosters information.
     */
    val rosters: List<Roster>
        get() = data.rosters

    /**
     * [Data] is an uninteresting class that just holds an array of [Roster].
     */
    private inner class Data private constructor(val rosters: List<Roster>)

}

private fun yesNoToBoolean(yesNo: String) = when (yesNo) {
    "Y" -> true
    "N" -> false
    else -> throw RuntimeException("Illegal value!")
}

/**
 * [Roster] contains all the useful information about Cornell Roster.
 */
class Roster private constructor(
        @SerializedName(value = "slug")
        val semester: String,
        val isDefaultRoster: Bool,
        @SerializedName(value = "strm")
        val semesterCode: String,
        @SerializedName(value = "descr")
        val description: String,
        @SerializedName(value = "descrshort")
        val shortDescription: String,
        val defaultSessionCode: String,
        val defaultCampus: String,
        val defaultLocation: String,
        val defaultInstructionMode: String,
        val sharing: Bool,
        @SerializedName(value = "archiveMode")
        val inArchiveMode: Bool,
        val lastModifiedDttm: String
)
