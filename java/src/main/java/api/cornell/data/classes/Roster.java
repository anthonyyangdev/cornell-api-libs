package api.cornell.data.classes;

import com.google.common.base.MoreObjects;
import com.google.gson.annotations.SerializedName;
import org.jetbrains.annotations.NotNull;

/**
 * {@code Roster} contains all the useful information about Cornell Roster.
 */
public final class Roster {
    
    /**
     * Semester of the roster.
     */
    @NotNull
    @SerializedName(value = "slug")
    private final String semester;
    /**
     * Whether the roster is the default one.
     */
    @NotNull
    private final Bool isDefaultRoster;
    /**
     * Code of the semester.
     */
    @NotNull
    @SerializedName(value = "strm")
    private final String semesterCode;
    /**
     * A description of the semester.
     */
    @NotNull
    @SerializedName(value = "descr")
    private final String description;
    /**
     * A short description of the semester.
     */
    @NotNull
    @SerializedName(value = "descrshort")
    private final String shortDescription;
    /**
     * The default session code.
     */
    @NotNull
    private final String defaultSessionCode;
    /**
     * The default campus.
     */
    @NotNull
    private final Campus defaultCampus;
    /**
     * The default location.
     */
    @NotNull
    private final CampusLocation defaultLocation;
    /**
     * Whether you can share.
     */
    @NotNull
    private final Bool sharing;
    /**
     * Whether the semester's info is in archive mode.
     */
    @NotNull
    @SerializedName(value = "archiveMode")
    private final Bool isInArchiveMode;
    /**
     * The datetime stamp of the last modified date time.
     */
    @NotNull
    @SerializedName(value = "lastModifiedDttm")
    private final String lastModifiedDatetime;
    
    /**
     * Constructor for GSON.
     */
    private Roster() {
        semester = "";
        isDefaultRoster = Bool.N;
        semesterCode = "";
        description = shortDescription = "";
        defaultSessionCode = "";
        defaultCampus = Campus.MAIN;
        defaultLocation = CampusLocation.ITH;
        sharing = Bool.N;
        isInArchiveMode = Bool.N;
        lastModifiedDatetime = "";
    }
    
    /**
     * Obtain semester of the roster.
     *
     * @return semester of the roster.
     */
    @NotNull
    public String getSemester() {
        return semester;
    }
    
    /**
     * Report whether the roster is the default one.
     *
     * @return whether the roster is the default one.
     */
    @NotNull
    public Bool getIsDefaultRoster() {
        return isDefaultRoster;
    }
    
    /**
     * Obtain code of the semester.
     *
     * @return code of the semester.
     */
    @NotNull
    public String getSemesterCode() {
        return semesterCode;
    }
    
    /**
     * Obtain a description of the semester.
     *
     * @return a description of the semester.
     */
    @NotNull
    public String getDescription() {
        return description;
    }
    
    /**
     * Obtain a short description of the semester.
     *
     * @return a short description of the semester.
     */
    @NotNull
    public String getShortDescription() {
        return shortDescription;
    }
    
    /**
     * Obtain the default session code.
     *
     * @return the default session code.
     */
    @NotNull
    public String getDefaultSessionCode() {
        return defaultSessionCode;
    }
    
    /**
     * Obtain the default campus.
     *
     * @return the default campus.
     */
    @NotNull
    public Campus getDefaultCampus() {
        return defaultCampus;
    }
    
    /**
     * Obtain the default location.
     *
     * @return the default location.
     */
    @NotNull
    public CampusLocation getDefaultLocation() {
        return defaultLocation;
    }
    
    /**
     * Report whether you can share.
     *
     * @return whether you can share.
     */
    @NotNull
    public Bool getSharing() {
        return sharing;
    }
    
    /**
     * Report whether the semester's info is in archive mode.
     *
     * @return whether the semester's info is in archive mode.
     */
    @NotNull
    public Bool getIsInArchiveMode() {
        return isInArchiveMode;
    }
    
    /**
     * Obtain a datetime stamp of the last modified date time.
     *
     * @return a datetime stamp of the last modified date time.
     */
    @NotNull
    public String getLastModifiedDatetime() {
        return lastModifiedDatetime;
    }
    
    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("semester", semester)
                .add("isDefaultRoster", isDefaultRoster)
                .add("semesterCode", semesterCode)
                .add("description", description)
                .add("shortDescription", shortDescription)
                .add("defaultSessionCode", defaultSessionCode)
                .add("defaultCampus", defaultCampus)
                .add("defaultLocation", defaultLocation)
                .add("sharing", sharing)
                .add("isInArchiveMode", isInArchiveMode)
                .add("lastModifiedDatetime", lastModifiedDatetime)
                .toString();
    }
}
