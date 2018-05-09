package api.cornell.data.classes;

import org.jetbrains.annotations.NotNull;

/**
 * {@code AcademicCareer} is a collection of supported academic career value.
 */
public enum AcademicCareer {
    
    /**
     * Undergraduate.
     */
    UG("Undergraduate"),
    /**
     * Graduate
     */
    GR("Graduate"),
    /**
     * Graduate Management
     */
    GM("Graduate Management"),
    /**
     * Law.
     */
    LA("Law"),
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
     * Construct an {@code AcademicCareer}.
     *
     * @param description a simple description of the code.
     */
    AcademicCareer(@NotNull String description) {
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
