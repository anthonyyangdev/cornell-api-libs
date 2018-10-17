package api.cornell.data.classes

import com.google.gson.annotations.SerializedName

/**
 * [EnrollGroup] contains all the information about an enroll group.
 *
 * @param classSections a list of class sections.
 * @param unitsMinimum minimum units.
 * @param unitsMaximum maximum units.
 * @param componentsRequired a list of required components.
 * @param componentsOptional a list of optional components.
 * @param gradingBasis basis of grading.
 * @param sessionCode the code for session.
 * @param sessionBeginDate the begin date of session.
 * @param sessionEndDate the end date of session.
 * @param sessionLong the long description of session.
 */
data class EnrollGroup(
        val classSections: List<ClassSection>,
        val unitsMinimum: Double,
        val unitsMaximum: Double,
        val componentsRequired: List<ClassComponent>,
        val componentsOptional: List<ClassComponent>,
        val gradingBasis: GradingBasis,
        val sessionCode: String,
        @SerializedName(value = "sessionBeginDt") val sessionBeginDate: String,
        @SerializedName(value = "sessionEndDt") val sessionEndDate: String,
        val sessionLong: String
)