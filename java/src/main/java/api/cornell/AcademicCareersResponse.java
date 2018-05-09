package api.cornell;

import api.cornell.data.classes.AcademicCareer;
import com.google.gson.annotations.SerializedName;
import org.jetbrains.annotations.Nullable;

import java.util.List;

/**
 * {@code AcademicCareersResponse} is the response of a Academic Careers request.
 */
final class AcademicCareersResponse {
    
    /**
     * Main data of response.
     */
    @Nullable
    private final Data data;
    
    /**
     * Constructor for GSON.
     */
    private AcademicCareersResponse() {
        data = null;
    }
    
    /**
     * Obtain the academic careers information.
     *
     * @return the academic careers information.
     */
    @Nullable
    public List<AcademicCareer> getAcademicCareers() {
        if (data == null) {
            return null;
        }
        return data.academicCareers;
    }
    
    /**
     * {@code Data} is an uninteresting class that just holds an array of {@code Page}.
     */
    private static class Data {
        
        @Nullable
        @SerializedName(value = "acadCareers")
        private List<AcademicCareer> academicCareers;
    
        /**
         * Constructor for GSON.
         */
        private Data() {
            academicCareers = null;
        }
        
    }
    
}
