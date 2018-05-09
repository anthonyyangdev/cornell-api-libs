package api.cornell;

import api.cornell.data.eatery.Page;
import org.jetbrains.annotations.Nullable;

import java.util.List;

/**
 * {@code PagesResponse} is the response of a Pages request.
 */
final class PagesResponse {
    
    /**
     * Main data of response.
     */
    @Nullable
    private final Data data;
    
    /**
     * Constructor for GSON.
     */
    private PagesResponse() {
        data = null;
    }
    
    /**
     * Obtain the pages information.
     *
     * @return the pages information.
     */
    @Nullable
    public List<Page> getPages() {
        if (data == null) {
            return null;
        }
        return data.pages;
    }
    
    /**
     * {@code Data} is an uninteresting class that just holds an array of {@code Page}.
     */
    private static class Data {
        
        @Nullable
        private List<Page> pages;
        
        /**
         * Constructor for GSON.
         */
        private Data() {
            pages = null;
        }
        
    }
    
}
