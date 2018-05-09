package api.cornell

import api.cornell.data.classes.AcademicCareer
import api.cornell.data.classes.AcademicGroup
import api.cornell.data.classes.ClassLevel
import api.cornell.data.classes.Course
import api.cornell.data.classes.Roster
import api.cornell.data.classes.Subject
import api.cornell.response.classes.AcademicCareersResponse
import api.cornell.response.classes.AcademicGroupsResponse
import api.cornell.response.classes.ClassLevelsResponse
import api.cornell.response.classes.CoursesResponse
import api.cornell.response.classes.RostersResponse
import api.cornell.response.classes.SubjectsResponse
import com.google.gson.Gson
import com.google.gson.GsonBuilder
import com.google.gson.JsonDeserializer

/**
 * [ClassesApiClient] defines a set of operation that the Cornell Classes API Client supports.
 */
object ClassesApiClient {

    /**
     * [gson] is used for JSON processing.
     */
    private val gson: Gson = GsonBuilder()
            .registerTypeAdapter(AcademicCareer::class.java,
                    JsonDeserializer<AcademicCareer> { json, _, _ ->
                        val value = if (json.isJsonObject) {
                            val obj = json.asJsonObject
                            obj["value"].asString
                        } else {
                            json.asString
                        }
                        AcademicCareer.valueOf(value)
                    })
            .registerTypeAdapter(AcademicGroup::class.java,
                    JsonDeserializer<AcademicGroup> { json, _, _ ->
                        val value = if (json.isJsonObject) {
                            val obj = json.asJsonObject
                            obj["value"].asString
                        } else {
                            json.asString
                        }
                        AcademicGroup.valueOf(value)
                    })
            .registerTypeAdapter(Subject::class.java,
                    JsonDeserializer<Subject> { json, _, _ ->
                        val value = if (json.isJsonObject) {
                            val obj = json.asJsonObject
                            obj["value"].asString
                        } else {
                            json.asString
                        }
                        Subject.valueOf(value)
                    })
            .create()
    /**
     * [http] is used to send requests.
     */
    private val http: Http = Http(prefix = "https://classes.cornell.edu/api/2.0", gson = gson)

    /**
     * Obtain all available Cornell rosters.
     *
     * @param handler handler to receive all available Cornell rosters.
     */
    fun getRosters(handler: (List<Roster>?) -> Unit) =
            http.request<RostersResponse>(path = "/config/rosters.json") { handler(it?.rosters) }

    /**
     * Obtain all available academic careers for a roster.
     * Academic careers refer to student type (i.e. Undergraduate) or study type
     * (i.e. Graduate Management).
     *
     * @param roster roster semester & year (i.e. FA14, SP15)
     * @param handler handler to receive all available academic careers for a roster.
     */
    fun getAcademicCareers(roster: String, handler: (List<AcademicCareer>?) -> Unit) =
            http.request<AcademicCareersResponse>(
                    path = "/config/acadCareers.json", parameters = listOf("roster" to roster)
            ) { handler(it?.academicCareers) }

    /**
     * Obtain all available academic groups for a roster.
     * Academic groups refer to college type (i.e. Engineering) or study type
     * (i.e. Graduate Management).
     *
     * @param roster roster semester & year (i.e. FA14, SP15)
     * @param handler handler to receive all available academic groups for a roster.
     */
    fun getAcademicGroups(roster: String, handler: (List<AcademicGroup>?) -> Unit) =
            http.request<AcademicGroupsResponse>(
                    path = "/config/acadGroups.json", parameters = listOf("roster" to roster)
            ) { handler(it?.academicGroups) }

    /**
     * Obtain all available class levels for a roster.
     * Class levels refer to the level of the course as specified by the course number
     * (i.e. 1000, 2000). For instance, CS 4300 has a class level of 4000.
     *
     * @param roster roster semester & year (i.e. FA14, SP15)
     * @param handler handle to receive all available class levels for a roster.
     */
    fun getClassLevels(roster: String, handler: (List<ClassLevel>?) -> Unit) =
            http.request<ClassLevelsResponse>(
                    path = "/config/classLevels.json", parameters = listOf("roster" to roster)
            ) { handler(it?.classLevels) }

    /**
     * Obtain all available course subjects for a roster.
     *
     * @param roster roster semester & year (i.e. FA14, SP15)
     * @param handler handle to receive all available course subjects for a roster.
     */
    fun getSubjects(roster: String, handler: (List<Subject>?) -> Unit) =
            http.request<SubjectsResponse>(
                    path = "/config/subjects.json", parameters = listOf("roster" to roster)
            ) { handler(it?.subjects) }

    /**
     * Obtain all classes in the specified roster and subject that match the input query.
     * Information like `academicCareers`, `academicGroups`, `classLevels`, `classAttributes`,
     * `query` are defaulted to `null`.
     * This method `getCourses(roster, subject)` is equivalent as
     * `getCourses(roster, subject, null, null, null, null, null)`.
     *
     * @param roster roster semester & year (i.e. FA14, SP15)
     * @param subject academic subject (i.e. CS, PHIL)
     * @param handler handler to receive all classes in the specified roster and subject that match
     * the input query.
     */
    fun getCourses(roster: String, subject: Subject, handler: (List<Course>?) -> Unit) =
            getCourses(roster, subject, null, null,
                    null, null, null, handler)

    /**
     * Obtain all classes in the specified roster and subject that match the input query.
     *
     * @param roster roster semester & year (i.e. FA14, SP15)
     * @param subject academic subject (i.e. CS, PHIL)
     * @param academicCareers academic career (i.e. GR)
     * @param academicGroups academic group (i.e. AG)
     * @param classLevels class levels (i.e. 6000)
     * @param classAttributes course attribute (i.e. CU-SBY)
     * @param query search term (i.e. graphics)
     * @param handler handler to receive all classes in the specified roster and subject that match
     * the input query.
     */
    fun getCourses(roster: String, subject: Subject,
                   academicCareers: Array<AcademicCareer>?,
                   academicGroups: Array<AcademicGroup>?,
                   classLevels: IntArray?, classAttributes: Array<String>?,
                   query: String?, handler: (List<Course>?) -> Unit) {
        val params: MutableList<Pair<String, Any?>> =
                arrayListOf("roster" to roster, "subject" to subject)
        academicCareers?.let {
            for (item in it) {
                params.add("acadCareer" to item)
            }
        }
        academicGroups?.let {
            for (item in it) {
                params.add("acadGroup" to item)
            }
        }
        classLevels?.let {
            for (item in it) {
                params.add("classLevels" to item)
            }
        }
        classAttributes?.let {
            for (item in it) {
                params.add("crseAttrs" to item)
            }
        }
        query?.let { params.add("q" to it) }
        http.request<CoursesResponse>(
                path = "/search/classes.json", parameters = params
        ) { handler(it?.courses) }
    }

}