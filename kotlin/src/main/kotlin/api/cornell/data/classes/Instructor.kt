package api.cornell.data.classes

import com.google.gson.annotations.SerializedName

/**
 * [Instructor] contains all the information about class instructors.
 *
 * @param firstName first name of the instructor.
 * @param middleName middle name of the instructor.
 * @param lastName last name of the instructor.
 * @param netId NetID of the instructor.
 * @param assignSequence assign sequence of the instructor.
 */
data class Instructor(
        val firstName: String, val middleName: String, val lastName: String,
        @SerializedName(value = "netid") val netId: String,
        @SerializedName(value = "instrAssignSeq") val assignSequence: Int
)