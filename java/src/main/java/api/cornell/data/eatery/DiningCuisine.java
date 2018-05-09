package api.cornell.data.eatery;

import com.google.common.base.MoreObjects;
import com.google.gson.annotations.SerializedName;
import org.jetbrains.annotations.NotNull;

/**
 * {@code DiningCuisine} contains all useful information about dining cuisine.
 */
public final class DiningCuisine {
    
    /**
     * Name of the cuisine.
     */
    @NotNull
    private final String name;
    
    /**
     * Short name of the cuisine.
     */
    @NotNull
    @SerializedName(value = "nameshort")
    private final String shortName;
    
    /**
     * Description of the cuisine.
     */
    @NotNull
    @SerializedName(value = "descr")
    private final String description;
    
    /**
     * Constructor for GSON.
     */
    private DiningCuisine() {
       name = "";
       shortName = "";
       description = "";
    }
    
    
    /**
     * Obtain name of the cuisine.
     *
     * @return name of the cuisine.
     */
    @NotNull
    public String getName() {
        return name;
    }
    
    /**
     * Obtain short name of the cuisine.
     *
     * @return short name of the cuisine.
     */
    @NotNull
    public String getShortName() {
        return shortName;
    }
    
    /**
     * Obtain description of the cuisine.
     * @return description of the cuisine.
     */
    @NotNull
    public String getDescription() {
        return description;
    }
    
    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("name", name)
                .add("shortName", shortName)
                .add("description", description)
                .toString();
    }
    
}
