package api.cornell.data

import com.google.gson.annotations.SerializedName

/**
 * [ClassSection] contains all the useful information of a class section.
 *
 * @param addConsent whether to add consent.
 * @param addConsentDescription description of adding consent.
 * @param campus the campus of instruction.
 * @param classNumber the class number.
 * @param startDate the start date of the section.
 * @param endDate the end date of the section.
 * @param instructionMode the instruction mode.
 * @param isComponentGraded whether the component is graded.
 * @param location location of campus.
 * @param locationDescription description of location of campus.
 * @param section section of the class.
 * @param component component of the class.
 * @param longComponentDescription long description of the class component.
 * @param topicDescription topic description of the class.
 * @param meetings a list of all class meetings.
 */
data class ClassSection(
        val addConsent: Bool,
        @SerializedName(value = "addConsentDescr") val addConsentDescription: String,
        val campus: Campus,
        @SerializedName(value = "classNbr") val classNumber: Int,
        @SerializedName(value = "startDt") val startDate: String,
        @SerializedName(value = "endDt") val endDate: String,
        val instructionMode: InstructionMode?,
        val isComponentGraded: Boolean,
        val location: CampusLocation,
        @SerializedName(value = "locationDescr") val locationDescription: String,
        val section: String,
        @SerializedName(value = "ssrComponent") val component: ClassComponent,
        @SerializedName(value = "ssrComponentLong") val longComponentDescription: String,
        val topicDescription: String,
        val meetings: List<Meeting>
)