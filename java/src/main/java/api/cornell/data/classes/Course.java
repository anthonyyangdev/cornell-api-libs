package api.cornell.data.classes;

import com.google.gson.annotations.SerializedName;
import org.jetbrains.annotations.NotNull;

import java.util.Collections;
import java.util.List;

/**
 * {@code Course} contains all the useful information about classes.
 */
public final class Course {
    
    /**
     * Code of the semester.
     */
    @SerializedName(value = "strm")
    private final int semesterCode;
    /**
     * ID of the course.
     */
    @SerializedName(value = "crseId")
    private final int courseId;
    /**
     * The offer number of the course.
     */
    @SerializedName(value = "crseOfferNbr")
    private final int courseOfferNumber;
    /**
     * Subject of the course.
     */
    @NotNull
    private final Subject subject;
    /**
     * Number of the course.
     */
    @NotNull
    @SerializedName(value = "catalogNbr")
    private final String catalogNumber;
    /**
     * Short title of the course.
     */
    @NotNull
    @SerializedName(value = "titleShort")
    private final String shortTitle;
    /**
     * Long title of the course.
     */
    @NotNull
    @SerializedName(value = "titleLong")
    private final String longTitle;
    /**
     * Description of the course.
     */
    @NotNull
    private final String description;
    /**
     * Breath of the course.
     */
    @NotNull
    private final String catalogBreadth;
    /**
     * Distribution of the course.
     */
    @NotNull
    @SerializedName(value = "catalogDistr")
    private final String catalogDistribution;
    /**
     * Language catalog.
     */
    @NotNull
    @SerializedName(value = "catalogLang")
    private final String catalogLanguage;
    /**
     * Some forbidden overlaps of the course.
     */
    @NotNull
    private final String catalogForbiddenOverlaps;
    /**
     * When is the class offered.
     */
    @NotNull
    private final String catalogWhenOffered;
    /**
     * Comments about the course catalog.
     */
    @NotNull
    private final String catalogComments;
    /**
     * Some prerequisites and corequisites of the course.
     */
    @NotNull
    @SerializedName(value = "catalogPrereqCoreq")
    private final String catalogPrerequisitesCorequisites;
    /**
     * Course fee.
     */
    @NotNull
    private final String catalogFee;
    /**
     * What requisites does this class satisfy.
     */
    @NotNull
    @SerializedName(value = "catalogSatisfiesReq")
    private final String catalogSatisfiesRequisite;
    /**
     * Permission to take the course.
     */
    @NotNull
    private final String catalogPermission;
    /**
     * Course sub-fields.
     */
    @NotNull
    private final String catalogCourseSubfield;
    /**
     * The academic career of the course.
     */
    @NotNull
    @SerializedName(value = "acadCareer")
    private final AcademicCareer academicCareer;
    /**
     * The academic group of the course.
     */
    @NotNull
    @SerializedName(value = "acadGroup")
    private final AcademicGroup academicGroup;
    /**
     * A list of all enroll groups.
     */
    @NotNull
    private final List<EnrollGroup> enrollGroups;
    
    /**
     * Constructor for GSON.
     */
    private Course() {
        semesterCode = 0;
        courseId = 0;
        courseOfferNumber = 0;
        subject = Subject.CS;
        catalogNumber = "";
        shortTitle = "";
        longTitle = "";
        description = "";
        catalogBreadth = catalogDistribution = "";
        catalogLanguage = "";
        catalogForbiddenOverlaps = "";
        catalogWhenOffered = "";
        catalogComments = "";
        catalogPrerequisitesCorequisites = "";
        catalogFee = "";
        catalogSatisfiesRequisite = "";
        catalogPermission = "";
        catalogCourseSubfield = "";
        academicCareer = AcademicCareer.UG;
        academicGroup = AcademicGroup.GR;
        enrollGroups = Collections.emptyList();
    }
    
    /**
     * Obtain the code of the semester.
     *
     * @return the code of the semester.
     */
    public int getSemesterCode() {
        return semesterCode;
    }
    
    /**
     * Obtain ID of the course.
     *
     * @return ID of the course.
     */
    public int getCourseId() {
        return courseId;
    }
    
    /**
     * Obtain the offer number of the course.
     *
     * @return the offer number of the course.
     */
    public int getCourseOfferNumber() {
        return courseOfferNumber;
    }
    
    /**
     * Obtain subject of the course.
     *
     * @return subject of the course.
     */
    @NotNull
    public Subject getSubject() {
        return subject;
    }
    
    /**
     * Obtain number of the course.
     *
     * @return number of the course.
     */
    @NotNull
    public String getCatalogNumber() {
        return catalogNumber;
    }
    
    /**
     * Obtain short title of the course.
     *
     * @return short title of the course.
     */
    @NotNull
    public String getShortTitle() {
        return shortTitle;
    }
    
    /**
     * Obtain long title of the course.
     *
     * @return long title of the course.
     */
    @NotNull
    public String getLongTitle() {
        return longTitle;
    }
    
    /**
     * Obtain description of the course.
     *
     * @return description of the course.
     */
    @NotNull
    public String getDescription() {
        return description;
    }
    
    /**
     * Obtain breath of the course.
     *
     * @return breath of the course.
     */
    @NotNull
    public String getCatalogBreadth() {
        return catalogBreadth;
    }
    
    /**
     * Obtain distribution of the course.
     *
     * @return distribution of the course.
     */
    @NotNull
    public String getCatalogDistribution() {
        return catalogDistribution;
    }
    
    /**
     * Obtain language catalog.
     *
     * @return language catalog.
     */
    @NotNull
    public String getCatalogLanguage() {
        return catalogLanguage;
    }
    
    /**
     * Obtain some forbidden overlaps of the course.
     *
     * @return some forbidden overlaps of the course.
     */
    @NotNull
    public String getCatalogForbiddenOverlaps() {
        return catalogForbiddenOverlaps;
    }
    
    /**
     * Obtain when is the class offered.
     *
     * @return when is the class offered.
     */
    @NotNull
    public String getCatalogWhenOffered() {
        return catalogWhenOffered;
    }
    
    /**
     * Obtain comments about the course catalog.
     *
     * @return comments about the course catalog.
     */
    @NotNull
    public String getCatalogComments() {
        return catalogComments;
    }
    
    /**
     * Obtain some prerequisites and corequisites of the course.
     *
     * @return some prerequisites and corequisites of the course.
     */
    @NotNull
    public String getCatalogPrerequisitesCorequisites() {
        return catalogPrerequisitesCorequisites;
    }
    
    /**
     * Obtain course fee.
     *
     * @return course fee.
     */
    @NotNull
    public String getCatalogFee() {
        return catalogFee;
    }
    
    /**
     * Obtain what requisites does this class satisfy.
     *
     * @return what requisites does this class satisfy.
     */
    @NotNull
    public String getCatalogSatisfiesRequisite() {
        return catalogSatisfiesRequisite;
    }
    
    /**
     * Obtain permission to take the course.
     *
     * @return permission to take the course.
     */
    @NotNull
    public String getCatalogPermission() {
        return catalogPermission;
    }
    
    /**
     * Obtain course sub-fields.
     *
     * @return course sub-fields.
     */
    @NotNull
    public String getCatalogCourseSubfield() {
        return catalogCourseSubfield;
    }
    
    /**
     * Obtain the academic career of the course.
     *
     * @return the academic career of the course.
     */
    @NotNull
    public AcademicCareer getAcademicCareer() {
        return academicCareer;
    }
    
    /**
     * Obtain the academic group of the course.
     *
     * @return the academic group of the course.
     */
    @NotNull
    public AcademicGroup getAcademicGroup() {
        return academicGroup;
    }
    
    /**
     * Obtain a list of all enroll groups.
     *
     * @return a list of all enroll groups.
     */
    @NotNull
    public List<EnrollGroup> getEnrollGroups() {
        return enrollGroups;
    }
    
    @Override
    public String toString() {
        /*
         * semesterCode
         * courseId
         * courseOfferNumber
         * subject
         * catalogNumber
         * shortTitle
         * longTitle
         * description
         * catalogBreadth
         * catalogDistribution
         * catalogLanguage
         * catalogForbiddenOverlaps
         * catalogWhenOffered
         * catalogComments
         * catalogPrerequisitesCorequisites
         * catalogFee
         * catalogSatisfiesRequisite
         * catalogPermission
         * catalogCourseSubfield
         * academicCareer
         * academicGroup
         * enrollGroups
         */
        return super.toString();
    }
}
