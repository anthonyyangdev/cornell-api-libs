package api.cornell;

import api.cornell.data.eatery.Eatery;
import org.jetbrains.annotations.Nullable;

import java.util.List;

/**
 * {@code EateriesResponse} is the response of a Eateries request.
 */
final class EateriesResponse {
    
    /**
     * Main data of response.
     */
    @Nullable
    private final Data data;
    
    /**
     * Constructor for GSON.
     */
    private EateriesResponse() {
        data = null;
    }
    
    /**
     * Obtain the eateries information.
     *
     * @return the eateries information.
     */
    @Nullable
    public List<Eatery> getEateries() {
        if (data == null) {
            return null;
        }
        return data.eateries;
    }
    
    /**
     * {@code Data} is an uninteresting class that just holds an array of {@code Eatery}.
     */
    private static class Data {
        
        @Nullable
        private List<Eatery> eateries;
        
        /**
         * Constructor for GSON.
         */
        private Data() {
            eateries = null;
        }
    }
    
}
