package api.cornell.data.eatery;

import com.google.common.base.MoreObjects;
import com.google.gson.annotations.SerializedName;
import org.jetbrains.annotations.NotNull;

/**
 * {@code Page} contains all the useful information about eatery pages.
 */
public final class Page {
    
    /**
     * Path of the page.
     */
    @NotNull
    @SerializedName(value = "slug")
    private final String path;
    /**
     * Title of the page.
     */
    @NotNull
    private final String title;
    /**
     * Body content of the page.
     */
    @NotNull
    private final String body;
    /**
     * Last updated date time.
     */
    @NotNull
    @SerializedName(value = "updatedDttm")
    private final String updatedDatetime;
    /**
     * Whether the page is included in the nav bar.
     */
    private final boolean navInclude;
    /**
     * Index in the nav bar.
     */
    private final int navSortIdx;
    
    /**
     * Constructor for GSON.
     */
    private Page() {
        path = "";
        title = "";
        body = "";
        updatedDatetime = "";
        navInclude = false;
        navSortIdx = 0;
    }
    
    /**
     * Obtain path of the page.
     *
     * @return path of the page.
     */
    @NotNull
    public String getPath() {
        return path;
    }
    
    /**
     * Obtain title of the page.
     *
     * @return title of the page.
     */
    @NotNull
    public String getTitle() {
        return title;
    }
    
    /**
     * Obtain body content of the page.
     *
     * @return body content of the page.
     */
    @NotNull
    public String getBody() {
        return body;
    }
    
    /**
     * Obtain last updated date time.
     *
     * @return last updated date time.
     */
    @NotNull
    public String getUpdatedDatetime() {
        return updatedDatetime;
    }
    
    /**
     * Report whether the page is included in the nav bar.
     *
     * @return whether the page is included in the nav bar.
     */
    public boolean isNavInclude() {
        return navInclude;
    }
    
    /**
     * Obtain index in the nav bar.
     *
     * @return index in the nav bar.
     */
    public int getNavSortIdx() {
        return navSortIdx;
    }
    
    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("path", path)
                .add("title", title)
                .add("body", body)
                .add("updatedDatetime", updatedDatetime)
                .add("navInclude", navInclude)
                .add("navSortIdx", navSortIdx)
                .toString();
    }
}
