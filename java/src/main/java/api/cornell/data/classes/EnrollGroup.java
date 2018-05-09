package api.cornell.data.classes;

import com.google.common.base.MoreObjects;
import com.google.gson.annotations.SerializedName;
import org.jetbrains.annotations.NotNull;

import java.util.Collections;
import java.util.List;

/**
 * {@code EnrollGroup} contains all the information about an enroll group.
 */
public final class EnrollGroup {
    
    /**
     * A list of class sections.
     */
    @NotNull
    private final List<ClassSection> classSections;
    /**
     * Units available.
     */
    private final double unitsMinimum, unitsMaximum;
    /**
     * Class components.
     */
    @NotNull
    private final List<ClassComponent> componentsRequired, componentsOptional;
    /**
     * Basis of grading.
     */
    @NotNull
    private final GradingBasis gradingBasis;
    /**
     * The code for session.
     */
    @NotNull
    private final String sessionCode;
    /**
     * The begin date of session.
     */
    @NotNull
    @SerializedName(value = "sessionBeginDt")
    private final String sessionBeginDate;
    /**
     * The end date of session.
     */
    @NotNull
    @SerializedName(value = "sessionEndDt")
    private final String sessionEndDate;
    /**
     * The long description of session.
     */
    @NotNull
    private final String sessionLong;
    
    /**
     * Constructor for GSON.
     */
    private EnrollGroup() {
        classSections = Collections.emptyList();
        unitsMinimum = unitsMaximum = 0;
        componentsRequired = componentsOptional = Collections.emptyList();
        gradingBasis = GradingBasis.OPT;
        sessionCode = sessionBeginDate = sessionEndDate = sessionLong = "";
    }
    
    /**
     * Obtain a list of class sections.
     *
     * @return a list of class sections.
     */
    @NotNull
    public List<ClassSection> getClassSections() {
        return classSections;
    }
    
    /**
     * Obtain minimum units.
     *
     * @return minimum units.
     */
    public double getUnitsMinimum() {
        return unitsMinimum;
    }
    
    /**
     * Obtain maximum units.
     *
     * @return maximum units.
     */
    public double getUnitsMaximum() {
        return unitsMaximum;
    }
    
    /**
     * Obtain a list of required components.
     *
     * @return a list of required components.
     */
    @NotNull
    public List<ClassComponent> getComponentsRequired() {
        return componentsRequired;
    }
    
    /**
     * Obtain a list of optional components.
     *
     * @return a list of optional components.
     */
    @NotNull
    public List<ClassComponent> getComponentsOptional() {
        return componentsOptional;
    }
    
    /**
     * Obtain basis of grading.
     *
     * @return basis of grading.
     */
    @NotNull
    public GradingBasis getGradingBasis() {
        return gradingBasis;
    }
    
    /**
     * Obtain the code for session.
     *
     * @return the code for session.
     */
    @NotNull
    public String getSessionCode() {
        return sessionCode;
    }
    
    /**
     * Obtain the begin date of session.
     *
     * @return the begin date of session.
     */
    @NotNull
    public String getSessionBeginDate() {
        return sessionBeginDate;
    }
    
    /**
     * Obtain the end date of session.
     *
     * @return the end date of session.
     */
    @NotNull
    public String getSessionEndDate() {
        return sessionEndDate;
    }
    
    /**
     * Obtain the long description of session.
     *
     * @return the long description of session.
     */
    @NotNull
    public String getSessionLong() {
        return sessionLong;
    }
    
    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("classSections", classSections)
                .add("unitsMinimum", unitsMinimum)
                .add("unitsMaximum", unitsMaximum)
                .add("componentsRequired", componentsRequired)
                .add("componentsOptional", componentsOptional)
                .add("gradingBasis", gradingBasis)
                .add("sessionCode", sessionCode)
                .add("sessionBeginDate", sessionBeginDate)
                .add("sessionEndDate", sessionEndDate)
                .add("sessionLong", sessionLong)
                .toString();
    }
}
