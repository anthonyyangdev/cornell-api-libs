package api.cornell.data.classes;

import com.google.common.base.MoreObjects;
import com.google.gson.annotations.SerializedName;
import org.jetbrains.annotations.NotNull;

import java.util.Collections;
import java.util.List;

/**
 * {@code Meeting} contains all the information about class meetings.
 */
public final class Meeting {
    
    /**
     * Number of meeting.
     */
    @SerializedName(value = "classMtgNbr")
    private final int meetingNumber;
    /**
     * Description of meeting topic.
     */
    @NotNull
    private final String meetingTopicDescription;
    /**
     * Pattern of the meeting. e.g. MWF, TR, etc.
     */
    @NotNull
    private final String pattern;
    /**
     * Building description.
     */
    @NotNull
    @SerializedName(value = "bldgDescr")
    private final String buildingDescription;
    /**
     * Facility description.
     */
    @NotNull
    @SerializedName(value = "facilityDescr")
    private final String facilityDescription;
    /**
     * The start date of the meeting.
     */
    @NotNull
    @SerializedName(value = "startDt")
    private final String startDate;
    /**
     * The end date of the meeting.
     */
    @NotNull
    @SerializedName(value = "endDt")
    private final String endDate;
    /**
     * The start time of the meeting.
     */
    @NotNull
    private final String timeStart;
    /**
     * The end time of the meeting.
     */
    @NotNull
    private final String timeEnd;
    /**
     * A list of instructors.
     */
    @NotNull
    private final List<Instructor> instructors;
    
    /**
     * Constructor for GSON.
     */
    private Meeting() {
        meetingNumber = 0;
        meetingTopicDescription = "";
        pattern = "";
        buildingDescription = facilityDescription = "";
        startDate = endDate = timeStart = timeEnd = "";
        instructors = Collections.emptyList();
    }
    
    /**
     * Obtain number of meeting.
     *
     * @return number of meeting.
     */
    public int getMeetingNumber() {
        return meetingNumber;
    }
    
    /**
     * Obtain description of meeting topic.
     *
     * @return description of meeting topic.
     */
    @NotNull
    public String getMeetingTopicDescription() {
        return meetingTopicDescription;
    }
    
    /**
     * Obtain pattern of the meeting. e.g. MWF, TR, etc.
     *
     * @return pattern of the meeting. e.g. MWF, TR, etc.
     */
    @NotNull
    public String getPattern() {
        return pattern;
    }
    
    /**
     * Obtain building description.
     *
     * @return building description.
     */
    @NotNull
    public String getBuildingDescription() {
        return buildingDescription;
    }
    
    /**
     * Obtain facility description.
     *
     * @return facility description.
     */
    @NotNull
    public String getFacilityDescription() {
        return facilityDescription;
    }
    
    /**
     * Obtain the start date of the meeting.
     *
     * @return the start date of the meeting.
     */
    @NotNull
    public String getStartDate() {
        return startDate;
    }
    
    /**
     * Obtain the end date of the meeting.
     *
     * @return the end date of the meeting.
     */
    @NotNull
    public String getEndDate() {
        return endDate;
    }
    
    /**
     * Obtain the start time of the meeting.
     *
     * @return the start time of the meeting.
     */
    @NotNull
    public String getTimeStart() {
        return timeStart;
    }
    
    /**
     * Obtain the end time of the meeting.
     *
     * @return the end time of the meeting.
     */
    @NotNull
    public String getTimeEnd() {
        return timeEnd;
    }
    
    /**
     * Obtain a list of instructors.
     *
     * @return a list of instructors.
     */
    @NotNull
    public List<Instructor> getInstructors() {
        return instructors;
    }
    
    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("meetingNumber", meetingNumber)
                .add("meetingTopicDescription", meetingTopicDescription)
                .add("pattern", pattern)
                .add("buildingDescription", buildingDescription)
                .add("facilityDescription", facilityDescription)
                .add("startDate", startDate)
                .add("endDate", endDate)
                .add("timeStart", timeStart)
                .add("timeEnd", timeEnd)
                .add("instructors", instructors)
                .toString();
    }
}
