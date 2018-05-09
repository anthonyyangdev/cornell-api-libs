package api.cornell.data.classes;

import org.jetbrains.annotations.NotNull;

/**
 * {@code CampusLocation} is a collection of supported campus location values.
 */
public enum CampusLocation {
    
    /**
     * Main campus
     */
    ITH("Ithaca, NY (Main Campus)"),
    /**
     * New York City Cornell Tech.
     */
    NYCTECH("Cornell Tech");
    
    /**
     * A simple description of the campus location.
     */
    @NotNull
    private final String description;
    
    /**
     * Construct an {@code CampusLocation}.
     *
     * @param description a simple description of the campus location.
     */
    CampusLocation(@NotNull String description) {
        this.description = description;
    }
    
    /**
     * Obtain a simple description of the campus location.
     *
     * @return a simple description of the campus location.
     */
    @NotNull
    public String getDescription() {
        return description;
    }
    
}
