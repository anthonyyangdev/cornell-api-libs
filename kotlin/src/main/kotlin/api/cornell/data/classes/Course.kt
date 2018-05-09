package api.cornell.data.classes

import com.google.gson.annotations.SerializedName

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
