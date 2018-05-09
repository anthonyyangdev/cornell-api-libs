package api.cornell.data.eatery;

import com.google.common.base.MoreObjects;
import org.jetbrains.annotations.NotNull;

import java.util.Collections;
import java.util.List;

/**
 * {@code MenuCategory} contains all useful information about menu categories.
 */
public final class MenuCategory implements Comparable<MenuCategory> {
    
    /**
     * Category name.
     */
    @NotNull
    private final String category;
    
    /**
     * Index used for sorting.
     */
    private final int sortIdx;
    
    /**
     * A list of items in the category.
     */
    @NotNull
    private final List<MenuItem> items;
    
    /**
     * Constructor for GSON.
     */
    private MenuCategory() {
        category = "";
        sortIdx = 0;
        items = Collections.emptyList();
    }
    
    /**
     * Obtain category name.
     *
     * @return category name.
     */
    @NotNull
    public String getCategory() {
        return category;
    }
    
    /**
     * Obtain a list of items in the category.
     *
     * @return a list of items in the category.
     */
    @NotNull
    public List<MenuItem> getItems() {
        return items;
    }
    
    @Override
    public int compareTo(@NotNull MenuCategory o) {
        return Integer.compare(sortIdx, o.sortIdx);
    }
    
    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("category", category)
                .add("sortIdx", sortIdx)
                .add("items", items)
                .toString();
    }
}
