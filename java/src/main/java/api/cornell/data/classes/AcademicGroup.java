package api.cornell.data.classes;

import org.jetbrains.annotations.NotNull;

/**
 * {@code AcademicGroup} is a collection of supported academic group value.
 */
public enum AcademicGroup {
    
    /**
     * Agriculture and Life Sciences.
     */
    AG("Agriculture and Life Sciences"),
    /**
     * Architecture, Art and Planning.
     */
    AR("Architecture, Art and Planning"),
    /**
     * Arts and Sciences.
     */
    AS("Arts and Sciences"),
    /**
     * Athletics
     */
    AT("Athletics"),
    /**
     * Business.
     */
    BU("Business"),
    /**
     * Continuing Education.
     */
    CE("Continuing Education"),
    /**
     * Cornell Tech.
     */
    CT("Cornell Tech"),
    /**
     * Engineering.
     */
    EN("Engineering"),
    /**
     * Graduate.
     */
    GR("Graduate"),
    /**
     * Graduate Management.
     */
    GM("Graduate Management"),
    /**
     * Hotel Administration.
     */
    HA("Hotel Administration"),
    /**
     * Human Ecology.
     */
    HE("Human Ecology"),
    /**
     * Industrial and Labor Relations.
     */
    IL("Industrial and Labor Relations"),
    /**
     * Law.
     */
    LA("Law"),
    /**
     * Reserve Officer Training.
     */
    OT("Reserve Officer Training"),
    /**
     * Veterinary Medicine.
     */
    VM("Veterinary Medicine");
    
    /**
     * A simple description of the code.
     */
    @NotNull
    private final String description;
    
    /**
     * Construct an {@code AcademicGroup}.
     *
     * @param description a simple description of the code.
     */
    AcademicGroup(@NotNull String description) {
        this.description = description;
    }
    
    /**
     * Obtain a simple description of the code.
     *
     * @return a simple description of the code.
     */
    @NotNull
    public String getDescription() {
        return description;
    }
}
