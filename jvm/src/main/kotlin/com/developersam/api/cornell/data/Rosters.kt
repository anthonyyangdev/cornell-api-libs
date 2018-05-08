package com.developersam.api.cornell.data

import com.google.gson.annotations.SerializedName

/**
 * [RostersResponse] is the response of a Rosters request.
 */
internal class RostersResponse private constructor() {

    /**
     * Main data of response.
     */
    private lateinit var data: Data
    /**
     * Obtain the rosters information.
     */
    val rosters: List<Roster>
        get() = data.rosters

    /**
     * [Data] is an uninteresting class that just holds an array of [Roster].
     */
    private inner class Data private constructor() {
        lateinit var rosters: List<Roster>
    }

}

/**
 * [Roster] contains all the useful information about Cornell Roster.
 */
class Roster private constructor() {

    /**
     * Semester of the roster.
     */
    @SerializedName(value = "slug")
    lateinit var semester: String
        private set

    /**
     * Whether the roster is the default one.
     */
    val isDefaultRoster: Bool = Bool.N

    /**
     * Code of the semester.
     */
    @SerializedName(value = "strm")
    lateinit var semesterCode: String
        private set

    /**
     * A description of the semester.
     */
    @SerializedName(value = "descr")
    lateinit var description: String
        private set

    /**
     * A short description of the semester.
     */
    @SerializedName(value = "descrshort")
    lateinit var shortDescription: String
        private set

    /**
     * The default session code.
     */
    lateinit var defaultSessionCode: String
        private set

    /**
     * The default campus.
     */
    lateinit var defaultCampus: String
        private set

    /**
     * The default location.
     */
    lateinit var defaultLocation: String
        private set

    /**
     * The default instruction mode.
     */
    lateinit var defaultInstructionMode: String
        private set

    /**
     * Whether you can share
     */
    val sharing: Bool = Bool.N

    /**
     * Whether the semester's info is in archieve move.
     */
    @SerializedName(value = "archiveMode")
    val isInArchiveMode: Bool = Bool.N

    /**
     * A datetime stamp of the last modified date.
     */
    lateinit var lastModifiedDttm: String
        private set
}
