package api.cornell.data.classes;

import org.jetbrains.annotations.NotNull;

/**
 * {@code InstructionMode} is a collection of supported instruction modes.
 */
public enum InstructionMode {
    
    /**
     * In Person.
     */
    P("In Person"),
    /**
     * Distance Learning - WWW.
     */
    DW("Distance Learning - WWW");
    
    /**
     * A simple description of the code.
     */
    @NotNull
    private final String description;
    
    /**
     * Construct an {@code InstructionMode}.
     *
     * @param description a simple description of the code.
     */
    InstructionMode(@NotNull String description) {
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
