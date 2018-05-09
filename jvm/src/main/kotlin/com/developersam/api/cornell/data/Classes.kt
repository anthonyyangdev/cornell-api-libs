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
 * [Course] contains all the useful information about classes.
 */
class Course private constructor() {

    /**
     * Code of the semester.
     */
    @SerializedName(value = "strm")
    val semesterCode: Int = 0

    /**
     * ID of the course.
     */
    @SerializedName(value = "crseId")
    val courseId: Int = 0

    /**
     * The offer number of the course.
     */
    @SerializedName(value = "crseOfferNbr")
    val courseOfferNumber: Int = 0

    /**
     * Subject of the course.
     */
    lateinit var subject: SubjectValue
        private set

    /**
     * Number of the course.
     */
    @SerializedName(value = "catalogNbr")
    lateinit var catalogNumber: String
        private set

    /**
     * Short title of the course.
     */
    @SerializedName(value = "titleShort")
    lateinit var shortTitle: String
        private set

    /**
     * Long title of the course.
     */
    @SerializedName(value = "titleLong")
    lateinit var longTitle: String
        private set

    /**
     * Description of the course.
     */
    lateinit var description: String
        private set

    /**
     * Breath of the course.
     */
    lateinit var catalogBreadth: String
        private set

    /**
     * Distribution of the course.
     */
    @SerializedName(value = "catalogDistr")
    lateinit var catalogDistribution: String
        private set

    /**
     * Language catalog.
     */
    @SerializedName(value = "catalogLang")
    lateinit var catalogLanguage: String
        private set

    /**
     * Some forbidden overlaps of the course.
     */
    lateinit var catalogForbiddenOverlaps: String
        private set

    /**
     * When is the class offered.
     */
    lateinit var catalogWhenOffered: String
        private set

    /**
     * Comments about the course catalog.
     */
    lateinit var catalogComments: String
        private set

    /**
     * Some prerequisites and corequisites of the course.
     */
    @SerializedName(value = "catalogPrereqCoreq")
    lateinit var catalogPrerequisitesAndCorequisites: String
        private set

    /**
     * Course fee.
     */
    lateinit var catalogFee: String
        private set

    /**
     * What requisite does this class satisfy.
     */
    @SerializedName(value = "catalogSatisfiesReq")
    lateinit var catalogSatisfiesRequisite: String
        private set

    /**
     * Permission to take the course.
     */
    lateinit var catalogPermission: String
        private set

    /**
     * Course sub-fields.
     */
    lateinit var catalogCourseSubfield: String
        private set

    /**
     * The academic career of the course.
     */
    @SerializedName(value = "acadCareer")
    lateinit var academicCareer: AcademicCareerValue
        private set

    /**
     * The academic group of the course.
     */
    @SerializedName(value = "acadGroup")
    lateinit var academicGroup: AcademicGroupValue
        private set

    /**
     * A list of all enroll groups.
     */
    lateinit var enrollGroups: List<EnrollGroup>
        private set

    /**
     * [EnrollGroup] contains all the information about an enroll group.
     */
    class EnrollGroup private constructor() {

        /**
         * A list of class sections.
         */
        lateinit var classSections: List<String>
            private set

        /**
         * Minimum units.
         */
        val unitsMinimum: Int = 0

        /**
         * Maximum units.
         */
        val unitsMaximum: Int = 0

        /**
         * A list of required components.
         */
        lateinit var componentsRequired: List<ClassComponent>
            private set

        /**
         * A list of optional components.
         */
        lateinit var componentsOptional: List<ClassComponent>
            private set

        /**
         * Basis of grading.
         */
        lateinit var gradingBasis: GradingBasis
            private set

        /**
         * Short description of basis of grading.
         */
        lateinit var gradingBasisShort: String
            private set

        /**
         * Long description of basis of grading.
         */
        lateinit var gradingBasisLong: String
            private set

        /**
         * A list of simple combinations.
         */
        lateinit var simpleCombinations: List<String>
            private set

        /**
         * The code for session.
         */
        lateinit var sessionCode: String
            private set

        /**
         * The begin date of session.
         */
        @SerializedName(value = "sessionBeginDt")
        lateinit var sessionBeginDate: String
            private set

        /**
         * The end date of session.
         */
        @SerializedName(value = "sessionEndDt")
        lateinit var sessionEndDate: String
            private set

        /**
         * The long description of session.
         */
        lateinit var sessionLong: String
            private set

        /**
         * [ClassSection] contains all the useful information of a class section.
         */
        class ClassSection private constructor() {

            /**
             * Whether to add consent.
             */
            lateinit var addConsent: Bool
                private set

            /**
             * Description of adding consent.
             */
            @SerializedName(value = "addConsentDescr")
            lateinit var addConsentDescription: String
                private set

            /**
             * The campus of instruction.
             */
            lateinit var campus: Campus
                private set

            /**
             * The campus description of instruction.
             */
            @SerializedName(value = "campusDescr")
            lateinit var campusDescription: String
                private set

            /**
             * The class number.
             */
            @SerializedName(value = "classNbr")
            val classNumber: Int = 0

            /**
             * The start date of the section.
             */
            @SerializedName(value = "startDt")
            lateinit var startDate: String
                private set

            /**
             * The end date of the section.
             */
            @SerializedName(value = "endDt")
            lateinit var endDate: String
                private set

            /**
             * The instruction mode.
             */
            val instructionMode: InstructionMode? = null

            /**
             * The description of instruction mode.
             */
            @SerializedName(value = "instrModeDescr")
            val instructionModeDescription: String? = null

            /**
             * The short description of instruction mode.
             */
            @SerializedName(value = "instrModeDescrshort")
            val instructionModeShortDescription: String? = null

            /**
             * Whether the component is graded.
             */
            val isComponentGraded: Boolean = false

            /**
             * Location of campus.
             */
            lateinit var location: CampusLocation
                private set

            /**
             * Description of location of campus.
             */
            @SerializedName(value = "locationDescr")
            lateinit var locationDescription: String
                private set

            /**
             * Section of the class.
             */
            lateinit var section: String
                private set

            /**
             * Component of the class.
             */
            @SerializedName(value = "ssrComponent")
            lateinit var component: ClassComponent
                private set

            /**
             * Long description of the class component.
             */
            @SerializedName(value = "ssrComponentLong")
            lateinit var longComponentDescription: String
                private set

            /**
             * Topic description of the class.
             */
            lateinit var topicDescription: String
                private set

            /**
             * A list of all class meetings.
             */
            lateinit var meetings: List<Meeting>
                private set

            /**
             * [Meeting] contains all the information about class meetings.
             */
            class Meeting private constructor() {

                /**
                 * Number of meeting.
                 */
                @SerializedName(value = "classMtgNbr")
                val meetingNumber: Int = 0

                /**
                 * Description of meeting topic.
                 */
                lateinit var meetingTopicDescription: String
                    private set

                /**
                 * Pattern of the meeting. e.g. MWF, TR, etc.
                 */
                lateinit var pattern: String
                    private set

                /**
                 * Building description.
                 */
                @SerializedName(value = "bldgDescr")
                lateinit var buildingDescription: String
                    private set

                /**
                 * Facility description.
                 */
                @SerializedName(value = "facilityDescr")
                lateinit var facilityDescription: String
                    private set

                /**
                 * Short description of the facility.
                 */
                @SerializedName(value = "facilityDescrshort")
                lateinit var facilityShortDescription: String
                    private set

                /**
                 * The start date of the meeting.
                 */
                @SerializedName(value = "startDt")
                lateinit var startDate: String
                    private set

                /**
                 * The end date of the meeting.
                 */
                @SerializedName(value = "endDt")
                lateinit var endDate: String
                    private set

                /**
                 * Start time of the meeting.
                 */
                lateinit var timeStart: String
                    private set

                /**
                 * End time of the meeting.
                 */
                lateinit var timeEnd: String
                    private set

                /**
                 * A list of instructors.
                 */
                lateinit var instructors: List<Instructor>
                    private set

                /**
                 * [Instructor] contains all the information about class instructors..
                 */
                class Instructor private constructor() {
                    /**
                     * First name of the instructor.
                     */
                    lateinit var firstName: String
                        private set

                    /**
                     * Middle name of the instructor.
                     */
                    lateinit var middleName: String
                        private set

                    /**
                     * Last name of the instructor.
                     */
                    lateinit var lastName: String
                        private set

                    /**
                     * NetID of the instructor.
                     */
                    @SerializedName(value = "netid")
                    lateinit var netId: String
                        private set

                    /**
                     * Assign sequence of the instructor.
                     */
                    @SerializedName(value = "instrAssignSeq")
                    val assignSequence: Int = 0

                }

            }

        }

    }
}