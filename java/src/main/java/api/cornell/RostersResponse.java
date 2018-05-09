package api.cornell;

import api.cornell.data.classes.Roster;
import org.jetbrains.annotations.Nullable;

import java.util.List;

/**
 * {@code RostersResponse} is the response of a Rosters request.
 */
final class RostersResponse {
    
    /**
     * Main data of response.
     */
    @Nullable
    private final Data data;
    
    /**
     * Constructor for GSON.
     */
    private RostersResponse() {
        data = null;
    }
    
    /**
     * Obtain the rosters information.
     *
     * @return the rosters information.
     */
    @Nullable
    public List<Roster> getRosters() {
        if (data == null) {
            return null;
        }
        return data.rosters;
    }
    
    /**
     * {@code Data} is an uninteresting class that just holds an array of {@code Roster}.
     */
    private static class Data {
        
        @Nullable
        private List<Roster> rosters;
        
        /**
         * Constructor for GSON.
         */
        private Data() {
            rosters = null;
        }
        
    }
}
