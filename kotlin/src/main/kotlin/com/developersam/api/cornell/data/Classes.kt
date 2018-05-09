package com.developersam.api.cornell.data

import com.google.gson.annotations.SerializedName

/**
 * [ClassesResponse] is the response of a Classes request.
 */
internal class ClassesResponse private constructor() {

    /**
     * Main data of response.
     */
    private val data: Data? = null
    /**
     * Obtain the academic groups information.
     */
    val courses: List<Course>?
        get() = data?.courses

    /**
     * [Data] is an uninteresting class that just holds an array of [Course].
     */
    private inner class Data private constructor() {
        val courses: List<Course>? = null
    }

}

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

/**
 * [Meeting] contains all the information about class meetings.
 *
 * @param meetingNumber id number of meeting.
 * @param meetingTopicDescription description of meeting topic.
 * @param pattern pattern of the meeting. e.g. MWF, TR, etc.
 * @param buildingDescription building description.
 * @param facilityDescription facility description.
 * @param startDate the start date of the meeting.
 * @param endDate the end date of the meeting.
 * @param timeStart the start time of the meeting.
 * @param timeEnd the end time of the meeting.
 * @param instructors a list of instructors.
 */
data class Meeting(
        @SerializedName(value = "classMtgNbr") val meetingNumber: Int,
        val meetingTopicDescription: String,
        val pattern: String,
        @SerializedName(value = "bldgDescr") val buildingDescription: String,
        @SerializedName(value = "facilityDescr") val facilityDescription: String,
        @SerializedName(value = "startDt") val startDate: String,
        @SerializedName(value = "endDt") val endDate: String,
        val timeStart: String,
        val timeEnd: String,
        val instructors: List<Instructor>
)

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

/**
 * [EnrollGroup] contains all the information about an enroll group.
 *
 * @param classSections a list of class sections.
 * @param unitsMinimum minimum units.
 * @param unitsMaximum maximum units.
 * @param componentsRequired a list of required components.
 * @param componentsOptional a list of optional components.
 * @param gradingBasis basis of grading.
 * @param simpleCombinations a list of simple combinations.
 * @param sessionCode the code for session.
 * @param sessionBeginDate the begin date of session.
 * @param sessionEndDate the end date of session.
 * @param sessionLong the long description of session.
 */
data class EnrollGroup(
        val classSections: List<String>,
        val unitsMinimum: Int,
        val unitsMaximum: Int,
        val componentsRequired: List<ClassComponent>,
        val componentsOptional: List<ClassComponent>,
        val gradingBasis: GradingBasis,
        val simpleCombinations: List<String>,
        val sessionCode: String,
        @SerializedName(value = "sessionBeginDt") val sessionBeginDate: String,
        @SerializedName(value = "sessionEndDt") val sessionEndDate: String,
        val sessionLong: String
)

/**
 * [Course] contains all the useful information about classes.
 *
 * @param semesterCode code of the semester.
 * @param courseId ID of the course.
 * @param courseOfferNumber the offer number of the course.
 * @param subject subject of the course.
 * @param catalogNumber number of the course.
 * @param shortTitle short title of the course.
 * @param longTitle long title of the course.
 * @param description description of the course.
 * @param catalogBreadth breath of the course.
 * @param catalogDistribution distribution of the course.
 * @param catalogLanguage language catalog.
 * @param catalogForbiddenOverlaps some forbidden overlaps of the course.
 * @param catalogWhenOffered when is the class offered.
 * @param catalogComments comments about the course catalog.
 * @param catalogPrerequisitesCorequisites some prerequisites and corequisites of the course.
 * @param catalogFee course fee.
 * @param catalogSatisfiesRequisite what requisites does this class satisfy.
 * @param catalogPermission permission to take the course.
 * @param catalogCourseSubfield course sub-fields.
 * @param academicCareer the academic career of the course.
 * @param academicGroup the academic group of the course.
 * @param enrollGroups a list of all enroll groups.
 */
data class Course(
        @SerializedName(value = "strm") val semesterCode: Int,
        @SerializedName(value = "crseId") val courseId: Int,
        @SerializedName(value = "crseOfferNbr") val courseOfferNumber: Int,
        val subject: SubjectValue,
        @SerializedName(value = "catalogNbr") val catalogNumber: String,
        @SerializedName(value = "titleShort") val shortTitle: String,
        @SerializedName(value = "titleLong") val longTitle: String,
        val description: String,
        val catalogBreadth: String,
        @SerializedName(value = "catalogDistr") val catalogDistribution: String,
        @SerializedName(value = "catalogLang") val catalogLanguage: String,
        val catalogForbiddenOverlaps: String,
        val catalogWhenOffered: String,
        val catalogComments: String,
        @SerializedName(value = "catalogPrereqCoreq") val catalogPrerequisitesCorequisites: String,
        val catalogFee: String,
        @SerializedName(value = "catalogSatisfiesReq") val catalogSatisfiesRequisite: String,
        val catalogPermission: String,
        val catalogCourseSubfield: String,
        @SerializedName(value = "acadCareer") val academicCareer: AcademicCareerValue,
        @SerializedName(value = "acadGroup") val academicGroup: AcademicGroupValue,
        val enrollGroups: List<EnrollGroup>
)
