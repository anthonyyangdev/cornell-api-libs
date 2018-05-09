package api.cornell.data.classes;

/**
 * A simple {@code Bool} enum for Cornell APIs.
 */
public enum Bool {
    /**
     * YES.
     */
    Y,
    /**
     * NO.
     */
    N;
    
    /**
     * Converts this value to an equivalent boolean value.
     *
     * @return the equivalent boolean value.
     */
    public boolean toBoolean() {
        switch (this) {
            case Y:
                return true;
            case N:
                return false;
            default:
                throw new RuntimeException("Impossible!");
        }
    }
}
