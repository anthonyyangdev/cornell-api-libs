package api.cornell;

import api.cornell.data.classes.Course;
import com.google.gson.annotations.SerializedName;
import org.jetbrains.annotations.Nullable;

import java.util.List;

/**
 * {@code CoursesResponse} is the response of a Classes request.
 */
final class CoursesResponse {
    
    /**
     * Main data of response.
     */
    @Nullable
    private final Data data;
    
    /**
     * Constructor for GSON.
     */
    private CoursesResponse() {
        data = null;
    }
    
    /**
     * Obtain the courses information.
     *
     * @return the courses information.
     */
    @Nullable
    public List<Course> getCourses() {
        if (data == null) {
            return null;
        }
        return data.courses;
    }
    
    /**
     * {@code Data} is an uninteresting class that just holds an array of {@code Page}.
     */
    private static class Data {
        
        @Nullable
        @SerializedName(value = "classes")
        private List<Course> courses;
    
        /**
         * Constructor for GSON.
         */
        private Data() {
            courses = null;
        }
        
    }
}
