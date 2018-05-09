package api.cornell;

import api.cornell.data.classes.Subject;
import org.jetbrains.annotations.Nullable;

import java.util.List;

/**
 * {@code SubjectsResponse} is the response of a Subjects request.
 */
final class SubjectsResponse {
    
    /**
     * Main data of response.
     */
    @Nullable
    private final Data data;
    
    /**
     * Constructor for GSON.
     */
    private SubjectsResponse() {
        data = null;
    }
    
    /**
     * Obtain the subjects information.
     *
     * @return the subjects information.
     */
    @Nullable
    public List<Subject> getSubjects() {
        if (data == null) {
            return null;
        }
        return data.subjects;
    }
    
    /**
     * {@code Data} is an uninteresting class that just holds an array of {@code Page}.
     */
    private static class Data {
        
        @Nullable
        private List<Subject> subjects;
    
        /**
         * Constructor for GSON.
         */
        private Data() {
            subjects = null;
        }
        
    }
}
