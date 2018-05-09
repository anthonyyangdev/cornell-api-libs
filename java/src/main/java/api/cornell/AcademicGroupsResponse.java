package api.cornell;

import api.cornell.data.classes.AcademicGroup;
import com.google.gson.annotations.SerializedName;
import org.jetbrains.annotations.Nullable;

import java.util.List;

/**
 * {@code AcademicGroupsResponse} is the response of a Academic Groups request.
 */
final class AcademicGroupsResponse {
    
    /**
     * Main data of response.
     */
    @Nullable
    private final Data data;
    
    /**
     * Constructor for GSON.
     */
    private AcademicGroupsResponse() {
        data = null;
    }
    
    /**
     * Obtain the academic groups information.
     *
     * @return the academic groups information.
     */
    @Nullable
    public List<AcademicGroup> getAcademicGroups() {
        if (data == null) {
            return null;
        }
        return data.academicGroups;
    }
    
    /**
     * {@code Data} is an uninteresting class that just holds an array of {@code Page}.
     */
    private static class Data {
        
        @Nullable
        @SerializedName(value = "acadGroups")
        private List<AcademicGroup> academicGroups;
        
        /**
         * Constructor for GSON.
         */
        private Data() {
            academicGroups = null;
        }
        
    }
}
