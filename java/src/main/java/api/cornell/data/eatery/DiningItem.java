package api.cornell.data.eatery;

import com.google.common.base.MoreObjects;
import com.google.gson.annotations.SerializedName;
import org.jetbrains.annotations.NotNull;

/**
 * {@code DiningItem} contains all useful information about dining items.
 */
public final class DiningItem {
    
    /**
     * Description of the item.
     */
    @NotNull
    @SerializedName(value = "descr")
    private final String description;
    
    /**
     * Category of the item.
     */
    @NotNull
    private final String category;
    
    /**
     * Name of the item.
     */
    @NotNull
    private final String item;
    
    /**
     * Whether the item is healthy.
     */
    private final boolean healthy;
    
    /**
     * Icon of the item.
     */
    @NotNull
    private final String icon;
    
    /**
     * Constructor for GSON.
     */
    private DiningItem() {
        description = "";
        category = "";
        item = "";
        healthy = false;
        icon = "";
    }
    
    /**
     * Obtain category of the item.
     *
     * @return category of the item.
     */
    @NotNull
    public String getDescription() {
        return description;
    }
    
    /**
     * Obtain category of the item.
     *
     * @return category of the item.
     */
    @NotNull
    public String getCategory() {
        return category;
    }
    
    /**
     * Obtain name of the item.
     *
     * @return name of the item.
     */
    @NotNull
    public String getItem() {
        return item;
    }
    
    /**
     * Report whether the item is healthy.
     *
     * @return whether the item is healthy.
     */
    public boolean isHealthy() {
        return healthy;
    }
    
    /**
     * Obtain icon of the item.
     *
     * @return icon of the item.
     */
    @NotNull
    public String getIcon() {
        return icon;
    }
    
    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("description", description)
                .add("category", category)
                .add("item", item)
                .add("healthy", healthy)
                .add("icon", icon)
                .toString();
    }
}
