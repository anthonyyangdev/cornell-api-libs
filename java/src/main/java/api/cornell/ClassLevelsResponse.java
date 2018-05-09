package api.cornell;

import api.cornell.data.classes.ClassLevel;
import org.jetbrains.annotations.Nullable;

import java.util.List;

/**
 * {@code ClassLevelsResponse} is the response of a Class Levels request.
 */
final class ClassLevelsResponse {
    
    /**
     * Main data of response.
     */
    @Nullable
    private final Data data;
    
    /**
     * Constructor for GSON.
     */
    private ClassLevelsResponse() {
        data = null;
    }
    
    /**
     * Obtain the class levels information.
     *
     * @return the class levels information.
     */
    @Nullable
    public List<ClassLevel> getClassLevels() {
        if (data == null) {
            return null;
        }
        return data.classLevels;
    }
    
    /**
     * {@code Data} is an uninteresting class that just holds an array of {@code Page}.
     */
    private static class Data {
        
        @Nullable
        private List<ClassLevel> classLevels;
        
        /**
         * Constructor for GSON.
         */
        private Data() {
            classLevels = null;
        }
        
    }
}
