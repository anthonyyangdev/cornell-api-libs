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
     *
     */
    @SerializedName(value = "strm")
    private final int semesterCode;
    /**
     *
     */
    @SerializedName(value = "crseId")
    private final int courseId;
    /**
     *
     */
    @SerializedName(value = "crseOfferNbr")
    private final int courseOfferNumber;
    /**
     *
     */
    @NotNull
    private final Subject subject;
    /**
     *
     */
    @NotNull
    @SerializedName(value = "catalogNbr")
    private final String catalogNumber;
    /**
     *
     */
    @NotNull
    @SerializedName(value = "titleShort")
    private final String shortTitle;
    /**
     *
     */
    @NotNull
    @SerializedName(value = "titleLong")
    private final String longTitle;
    /**
     *
     */
    @NotNull
    private final String description;
    /**
     *
     */
    @NotNull
    private final String catalogBreadth;
    /**
     *
     */
    @NotNull
    @SerializedName(value = "catalogDistr")
    private final String catalogDistribution;
    /**
     *
     */
    @NotNull
    @SerializedName(value = "catalogLang")
    private final String catalogLanguage;
    /**
     *
     */
    @NotNull
    private final String catalogForbiddenOverlaps;
    /**
     *
     */
    @NotNull
    private final String catalogWhenOffered;
    /**
     *
     */
    @NotNull
    private final String catalogComments;
    /**
     *
     */
    @NotNull
    @SerializedName(value = "catalogPrereqCoreq")
    private final String catalogPrerequisitesCorequisites;
    /**
     *
     */
    @NotNull
    private final String catalogFee;
    /**
     *
     */
    @NotNull
    @SerializedName(value = "catalogSatisfiesReq")
    private final String catalogSatisfiesRequisite;
    /**
     *
     */
    @NotNull
    private final String catalogPermission;
    /**
     *
     */
    @NotNull
    private final String catalogCourseSubfield;
    /**
     *
     */
    @NotNull
    @SerializedName(value = "acadCareer")
    private final AcademicCareer academicCareer;
    /**
     *
     */
    @NotNull
    @SerializedName(value = "acadGroup")
    private final AcademicGroup academicGroup;
    /**
     *
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
    
    public int getSemesterCode() {
        return semesterCode;
    }
    
    public int getCourseId() {
        return courseId;
    }
    
    public int getCourseOfferNumber() {
        return courseOfferNumber;
    }
    
    @NotNull
    public Subject getSubject() {
        return subject;
    }
    
    @NotNull
    public String getCatalogNumber() {
        return catalogNumber;
    }
    
    @NotNull
    public String getShortTitle() {
        return shortTitle;
    }
    
    @NotNull
    public String getLongTitle() {
        return longTitle;
    }
    
    @NotNull
    public String getDescription() {
        return description;
    }
    
    @NotNull
    public String getCatalogBreadth() {
        return catalogBreadth;
    }
    
    @NotNull
    public String getCatalogDistribution() {
        return catalogDistribution;
    }
    
    @NotNull
    public String getCatalogLanguage() {
        return catalogLanguage;
    }
    
    @NotNull
    public String getCatalogForbiddenOverlaps() {
        return catalogForbiddenOverlaps;
    }
    
    @NotNull
    public String getCatalogWhenOffered() {
        return catalogWhenOffered;
    }
    
    @NotNull
    public String getCatalogComments() {
        return catalogComments;
    }
    
    @NotNull
    public String getCatalogPrerequisitesCorequisites() {
        return catalogPrerequisitesCorequisites;
    }
    
    @NotNull
    public String getCatalogFee() {
        return catalogFee;
    }
    
    @NotNull
    public String getCatalogSatisfiesRequisite() {
        return catalogSatisfiesRequisite;
    }
    
    @NotNull
    public String getCatalogPermission() {
        return catalogPermission;
    }
    
    @NotNull
    public String getCatalogCourseSubfield() {
        return catalogCourseSubfield;
    }
    
    @NotNull
    public AcademicCareer getAcademicCareer() {
        return academicCareer;
    }
    
    @NotNull
    public AcademicGroup getAcademicGroup() {
        return academicGroup;
    }
    
    @NotNull
    public List<EnrollGroup> getEnrollGroups() {
        return enrollGroups;
    }
    
    @Override
    public String toString() {
        return super.toString();
    }
}
