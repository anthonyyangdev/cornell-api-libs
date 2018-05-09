package api.cornell;

import api.cornell.data.classes.AcademicCareer;
import api.cornell.data.classes.AcademicGroup;
import api.cornell.data.classes.ClassLevel;
import api.cornell.data.classes.Course;
import api.cornell.data.classes.Roster;
import api.cornell.data.classes.Subject;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonDeserializer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;

/**
 * {@code ClassesApiClient} defines a set of operation that the Cornell Classes API Client supports.
 */
public final class ClassesApiClient {
    
    /**
     * The only instance.
     */
    private static final ClassesApiClient INSTANCE = new ClassesApiClient();
    /**
     * Used for JSON processing.
     */
    private static final Gson GSON = new GsonBuilder()
            .registerTypeAdapter(AcademicCareer.class,
                    (JsonDeserializer<AcademicCareer>) (json, $1, $2) -> {
                        String value;
                        if (json.isJsonObject()) {
                            value = json.getAsJsonObject().get("value").getAsString();
                        } else {
                            value = json.getAsString();
                        }
                        return AcademicCareer.valueOf(value);
                    })
            .registerTypeAdapter(AcademicGroup.class,
                    (JsonDeserializer<AcademicGroup>) (json, $1, $2) -> {
                        String value;
                        if (json.isJsonObject()) {
                            value = json.getAsJsonObject().get("value").getAsString();
                        } else {
                            value = json.getAsString();
                        }
                        return AcademicGroup.valueOf(value);
                    })
            .registerTypeAdapter(Subject.class,
                    (JsonDeserializer<Subject>) (json, $1, $2) -> {
                        String value;
                        if (json.isJsonObject()) {
                            value = json.getAsJsonObject().get("value").getAsString();
                        } else {
                            value = json.getAsString();
                        }
                        return Subject.valueOf(value);
                    }).create();
    /**
     * Used to send requests.
     */
    private static final Http HTTP = new Http("https://classes.cornell.edu/api/2.0", GSON);
    
    /**
     * Sealed constructor.
     */
    private ClassesApiClient() {}
    
    /**
     * Obtain the only instance of itself.
     *
     * @return the only instance of itself.
     */
    public static ClassesApiClient getInstance() {
        return INSTANCE;
    }
    
    /**
     * Obtain all available Cornell rosters.
     *
     * @param handler handler to receive all available Cornell rosters.
     */
    public void getRosters(@NotNull Consumer<List<Roster>> handler) {
        HTTP.request("/config/rosters.json", RostersResponse.class, r -> {
            if (r == null) {
                handler.accept(null);
            } else {
                handler.accept(r.getRosters());
            }
        });
    }
    
    /**
     * Obtain all available academic careers for a roster.
     * Academic careers refer to student type (i.e. Undergraduate) or study type
     * (i.e. Graduate Management).
     *
     * @param roster roster semester &amp; year (i.e. FA14, SP15)
     * @param handler handler to receive all available academic careers for a roster.
     */
    public void getAcademicCareers(@NotNull String roster,
                                   @NotNull Consumer<List<AcademicCareer>> handler) {
        Map<String, Object> params = new HashMap<>();
        params.put("roster", roster);
        HTTP.request("/config/acadCareers.json", params, AcademicCareersResponse.class, r -> {
            if (r == null) {
                handler.accept(null);
            } else {
                handler.accept(r.getAcademicCareers());
            }
        });
    }
    
    /**
     * Obtain all available academic groups for a roster.
     * Academic groups refer to college type (i.e. Engineering) or study type
     * (i.e. Graduate Management).
     *
     * @param roster roster semester &amp; year (i.e. FA14, SP15)
     * @param handler handler to receive all available academic groups for a roster.
     */
    public void getAcademicGroups(@NotNull String roster,
                                  @NotNull Consumer<List<AcademicGroup>> handler) {
        Map<String, Object> params = new HashMap<>();
        params.put("roster", roster);
        HTTP.request("/config/acadGroups.json", params, AcademicGroupsResponse.class, r -> {
            if (r == null) {
                handler.accept(null);
            } else {
                handler.accept(r.getAcademicGroups());
            }
        });
    }
    
    /**
     * Obtain all available class levels for a roster.
     * Class levels refer to the level of the course as specified by the course number
     * (i.e. 1000, 2000). For instance, CS 4300 has a class level of 4000.
     *
     * @param roster roster semester &amp; year (i.e. FA14, SP15)
     * @param handler handle to receive all available class levels for a roster.
     */
    public void getClassLevels(@NotNull String roster,
                               @NotNull Consumer<List<ClassLevel>> handler) {
        Map<String, Object> params = new HashMap<>();
        params.put("roster", roster);
        HTTP.request("/config/classLevels.json", params, ClassLevelsResponse.class, r -> {
            if (r == null) {
                handler.accept(null);
            } else {
                handler.accept(r.getClassLevels());
            }
        });
    }
    
    /**
     * Obtain all available course subjects for a roster.
     *
     * @param roster roster semester &amp; year (i.e. FA14, SP15)
     * @param handler handle to receive all available course subjects for a roster.
     */
    public void getSubjects(@NotNull String roster, @NotNull Consumer<List<Subject>> handler) {
        Map<String, Object> params = new HashMap<>();
        params.put("roster", roster);
        HTTP.request("/config/subjects.json", params, SubjectsResponse.class, r -> {
            if (r == null) {
                handler.accept(null);
            } else {
                handler.accept(r.getSubjects());
            }
        });
    }
    
    /**
     * Obtain all classes in the specified roster and subject that match the input query.
     * Information like `academicCareers`, `academicGroups`, `classLevels`, `classAttributes`,
     * `query` are defaulted to `null`.
     * This method `getCourses(roster, subject)` is equivalent as
     * `getCourses(roster, subject, null, null, null, null, null)`.
     *
     * @param roster roster semester &amp; year (i.e. FA14, SP15)
     * @param subject academic subject (i.e. CS, PHIL)
     * @param handler handler to receive all classes in the specified roster and subject that match
     * the input query.
     */
    public void getCourses(@NotNull String roster, @NotNull Subject subject,
                           @NotNull Consumer<List<Course>> handler) {
        getCourses(roster, subject, null, null, null,
                null, null, handler);
    }
    
    /**
     * Obtain all classes in the specified roster and subject that match the input query.
     *
     * @param roster roster semester &amp; year (i.e. FA14, SP15)
     * @param subject academic subject (i.e. CS, PHIL)
     * @param academicCareers academic career (i.e. GR)
     * @param academicGroups academic group (i.e. AG)
     * @param classLevels class levels (i.e. 6000)
     * @param classAttributes course attribute (i.e. CU-SBY)
     * @param query search term (i.e. graphics)
     * @param handler handler to receive all classes in the specified roster and subject that match
     * the input query.
     */
    public void getCourses(@NotNull String roster, @NotNull Subject subject,
                           @Nullable AcademicCareer[] academicCareers,
                           @Nullable AcademicGroup[] academicGroups,
                           @Nullable int[] classLevels, @Nullable String[] classAttributes,
                           @Nullable String query, @NotNull Consumer<List<Course>> handler) {
        Map<String, Object> params = new HashMap<>();
        params.put("roster", roster);
        params.put("subject", subject);
        if (academicCareers != null) {
            params.put("acadCareer", academicCareers);
        }
        if (academicGroups != null) {
            params.put("acadGroup", academicGroups);
        }
        if (classLevels != null) {
            params.put("classLevels", classLevels);
        }
        if (classAttributes != null) {
            params.put("crseAttrs", classAttributes);
        }
        if (query != null) {
            params.put("q", query);
        }
        HTTP.request("/search/classes.json", params, CoursesResponse.class, r -> {
            if (r == null) {
                handler.accept(null);
            } else {
                handler.accept(r.getCourses());
            }
        });
    }
}
