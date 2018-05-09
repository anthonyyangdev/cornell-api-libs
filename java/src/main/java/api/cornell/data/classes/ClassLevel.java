package api.cornell.data.classes;

import com.google.common.base.MoreObjects;
import com.google.gson.annotations.SerializedName;

/**
 * {@code ClassLevel} contains all the useful information about class levels.
 */
public final class ClassLevel {
    
    /**
     * Value of the academic group.
     */
    @SerializedName(value = "descr")
    private final int value;
    
    /**
     * Constructor for GSON.
     */
    private ClassLevel() {
        value = 0;
    }
    
    /**
     * Obtain value of the academic group.
     *
     * @return value of the academic group.
     */
    public int getValue() {
        return value;
    }
    
    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("value", value)
                .toString();
    }
}
