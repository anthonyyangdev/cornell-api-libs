package api.cornell.data.classes

import com.google.gson.annotations.SerializedName

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