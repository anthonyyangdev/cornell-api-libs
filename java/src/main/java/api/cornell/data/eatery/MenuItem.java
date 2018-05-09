package api.cornell.data.eatery;

import com.google.common.base.MoreObjects;
import org.jetbrains.annotations.NotNull;

/**
 * {@code MenuItem} contains all useful information about menu item.
 */
public final class MenuItem implements Comparable<MenuItem> {
    
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
     * Index used for sorting.
     */
    private final int sortIdx;
    
    /**
     * Constructor for GSON.
     */
    private MenuItem() {
        item = "";
        healthy = false;
        sortIdx = 0;
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
    
    @Override
    public int compareTo(@NotNull MenuItem o) {
        return Integer.compare(sortIdx, o.sortIdx);
    }
    
    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("item", item)
                .add("healthy", healthy)
                .add("sortIdx", sortIdx)
                .toString();
    }
}
