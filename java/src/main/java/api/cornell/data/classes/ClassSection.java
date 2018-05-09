package api.cornell.data.classes;

import com.google.common.base.MoreObjects;
import com.google.gson.annotations.SerializedName;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.Collections;
import java.util.List;

/**
 * {@code ClassSection} contains all the useful information of a class section.
 */
public final class ClassSection {
    
    /**
     * Whether to add consent.
     */
    private final boolean addConsent;
    /**
     * Description of adding consent.
     */
    @NotNull
    @SerializedName(value = "addConsentDescr")
    private final String addConsentDescription;
    /**
     * The campus of instruction.
     */
    @NotNull
    private final Campus campus;
    /**
     * Class number.
     */
    @SerializedName(value = "classNbr")
    private final int classNumber;
    /**
     * The start date of the section.
     */
    @NotNull
    @SerializedName(value = "startDt")
    private final String startDate;
    /**
     * The end date of the section.
     */
    @NotNull
    @SerializedName(value = "endDt")
    private final String endDate;
    /**
     * The instruction mode.
     */
    @Nullable
    private final InstructionMode instructionMode;
    /**
     * Whether the component is graded.
     */
    private final boolean isComponentGraded;
    /**
     * Location of campus.
     */
    @NotNull
    private final CampusLocation location;
    /**
     * Description of location of campus.
     */
    @NotNull
    @SerializedName(value = "locationDescr")
    private final String locationDescription;
    /**
     * Section of the class.
     */
    @NotNull
    private final String section;
    /**
     * Component of the class.
     */
    @NotNull
    @SerializedName(value = "ssrComponent")
    private final ClassComponent component;
    /**
     * Long description of the class component.
     */
    @NotNull
    @SerializedName(value = "ssrComponentLong")
    private final String longComponentDescription;
    /**
     * Topic description of the class.
     */
    @NotNull
    private final String topicDescription;
    
    /**
     * A list of all class meetings.
     */
    @NotNull
    private final List<Meeting> meetings;
    
    /**
     * Constructor for GSON.
     */
    private ClassSection() {
        addConsent = false;
        addConsentDescription = "";
        campus = Campus.MAIN;
        classNumber = 0;
        startDate = endDate = "";
        instructionMode = InstructionMode.P;
        isComponentGraded = true;
        location = CampusLocation.ITH;
        locationDescription = "";
        section = "";
        component = ClassComponent.LEC;
        longComponentDescription = "";
        topicDescription = "";
        meetings = Collections.emptyList();
    }
    
    /**
     * Report whether to add consent.
     *
     * @return whether to add consent.
     */
    public boolean isAddConsent() {
        return addConsent;
    }
    
    /**
     * Obtain description of adding consent.
     *
     * @return description of adding consent.
     */
    @NotNull
    public String getAddConsentDescription() {
        return addConsentDescription;
    }
    
    /**
     * Obtain the campus of instruction.
     *
     * @return the campus of instruction.
     */
    @NotNull
    public Campus getCampus() {
        return campus;
    }
    
    /**
     * Obtain the class number.
     *
     * @return the class number.
     */
    public int getClassNumber() {
        return classNumber;
    }
    
    /**
     * Obtain the start date of the section.
     *
     * @return the start date of the section.
     */
    @NotNull
    public String getStartDate() {
        return startDate;
    }
    
    /**
     * Obtain the end date of the section.
     *
     * @return the end date of the section.
     */
    @NotNull
    public String getEndDate() {
        return endDate;
    }
    
    /**
     * Obtain the instruction mode.
     *
     * @return the instruction mode.
     */
    @Nullable
    public InstructionMode getInstructionMode() {
        return instructionMode;
    }
    
    /**
     * Report whether the component is graded.
     *
     * @return whether the component is graded.
     */
    public boolean isComponentGraded() {
        return isComponentGraded;
    }
    
    /**
     * Obtain location of campus.
     *
     * @return location of campus.
     */
    @NotNull
    public CampusLocation getLocation() {
        return location;
    }
    
    /**
     * Obtain description of location of campus.
     *
     * @return description of location of campus.
     */
    @NotNull
    public String getLocationDescription() {
        return locationDescription;
    }
    
    /**
     * Obtain section of the class.
     *
     * @return section of the class.
     */
    @NotNull
    public String getSection() {
        return section;
    }
    
    /**
     * Obtain component of the class.
     *
     * @return component of the class.
     */
    @NotNull
    public ClassComponent getComponent() {
        return component;
    }
    
    /**
     * Obtain long description of the class component.
     *
     * @return long description of the class component.
     */
    @NotNull
    public String getLongComponentDescription() {
        return longComponentDescription;
    }
    
    /**
     * Obtain topic description of the class.
     *
     * @return topic description of the class.
     */
    @NotNull
    public String getTopicDescription() {
        return topicDescription;
    }
    
    /**
     * Obtain a list of all class meetings.
     *
     * @return a list of all class meetings.
     */
    @NotNull
    public List<Meeting> getMeetings() {
        return meetings;
    }
    
    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("addConsent", addConsent)
                .add("addConsentDescription", addConsentDescription)
                .add("campus", campus)
                .add("classNumber", classNumber)
                .add("startDate", startDate)
                .add("endDate", endDate)
                .add("instructionMode", instructionMode == null? "null": instructionMode)
                .add("isComponentGraded", isComponentGraded)
                .add("location", location)
                .add("locationDescription", locationDescription)
                .add("section", section)
                .add("component", component)
                .add("longComponentDescription", longComponentDescription)
                .add("topicDescription", topicDescription)
                .add("meetings", meetings)
                .toString();
    }
}
