package api.cornell.response.classes

import api.cornell.data.classes.Roster

/**
 * [RostersResponse] is the response of a Rosters request.
 */
internal class RostersResponse private constructor() {

    /**
     * Main data of response.
     */
    private val data: Data? = null
    /**
     * Obtain the rosters information.
     */
    val rosters: List<Roster>?
        get() = data?.rosters

    /**
     * [Data] is an uninteresting class that just holds an array of [Roster].
     */
    private inner class Data private constructor() {
        val rosters: List<Roster>? = null
    }

}


