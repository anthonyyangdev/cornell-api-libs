package api.cornell.data.classes;

import org.jetbrains.annotations.NotNull;

/**
 * {@code Campus} is a collection of supported campus values.
 */
public enum Campus {
    
    /**
     * Main campus
     */
    MAIN("Ithaca"),
    /**
     * New York City Cornell Tech.
     */
    NYT("New York Tech Campus");
    
    /**
     * A simple description of the campus.
     */
    @NotNull
    private final String description;
    
    /**
     * Construct an {@code CampusLocation}.
     *
     * @param description a simple description of the campus.
     */
    Campus(@NotNull String description) {
        this.description = description;
    }
    
    /**
     * Obtain a simple description of the campus.
     *
     * @return a simple description of the campus.
     */
    @NotNull
    public String getDescription() {
        return description;
    }
}
