package com.developersam.api.cornell

import com.developersam.api.cornell.data.AcademicCareer
import com.developersam.api.cornell.data.AcademicCareerValue
import com.developersam.api.cornell.response.AcademicCareersResponse
import com.developersam.api.cornell.data.AcademicGroup
import com.developersam.api.cornell.data.AcademicGroupValue
import com.developersam.api.cornell.response.AcademicGroupsResponse
import com.developersam.api.cornell.data.ClassLevel
import com.developersam.api.cornell.response.ClassLevelsResponse
import com.developersam.api.cornell.response.CoursesResponse
import com.developersam.api.cornell.data.Course
import com.developersam.api.cornell.data.Roster
import com.developersam.api.cornell.response.RostersResponse
import com.developersam.api.cornell.data.Subject
import com.developersam.api.cornell.data.SubjectValue
import com.developersam.api.cornell.response.SubjectsResponse
import com.github.kittinunf.fuel.httpGet
import com.github.kittinunf.result.Result
import com.google.gson.Gson
import java.io.InputStream
import java.io.InputStreamReader

/**
 * [ApiClient] defines a set of operation that the Cornell API Client supports.
 */
object ApiClient {

    /**
     * [PREFIX] is the URL prefix for API requests.
     */
    private const val PREFIX = "https://classes.cornell.edu/api/2.0"
    /**
     * [gson] is used for JSON processing.
     */
    private val gson: Gson = Gson()

    /**
     * [request] is a function that fetch the result from Cornell APIs without the prefix.
     *
     * @param path API path without prefix.
     * @param parameters defines a list of parameters to give. This is optional.
     * @param handler defines a handler to process result.
     */
    private inline fun <reified T> request(path: String,
                                           parameters: List<Pair<String, Any?>>? = null,
                                           crossinline handler: (T?) -> Unit) {
        val url = PREFIX + path
        url.httpGet(parameters = parameters).responseString { _, _, result ->
            when (result) {
                is Result.Success -> handler(gson.fromJson(result.value, T::class.java))
                is Result.Failure -> handler(null)
            }
        }
    }

    /**
     * Obtain all available Cornell rosters.
     *
     * @param handler handler to receive all available Cornell rosters.
     */
    fun getRosters(handler: (List<Roster>?) -> Unit) =
            request<RostersResponse>(path = "/config/rosters.json") { handler(it?.rosters) }

    /**
     * Obtain all available academic careers for a roster.
     * Academic careers refer to student type (i.e. Undergraduate) or study type
     * (i.e. Graduate Management).
     *
     * @param roster roster semester & year (i.e. FA14, SP15)
     * @param handler handler to receive all available academic careers for a roster.
     */
    fun getAcademicCareers(roster: String, handler: (List<AcademicCareer>?) -> Unit) =
            request<AcademicCareersResponse>(path = "/config/acadCareers.json",
                    parameters = listOf("roster" to roster)) { handler(it?.academicCareers) }

    /**
     * Obtain all available academic groups for a roster.
     * Academic groups refer to college type (i.e. Engineering) or study type
     * (i.e. Graduate Management).
     *
     * @param roster roster semester & year (i.e. FA14, SP15)
     * @param handler handler to receive all available academic groups for a roster.
     */
    fun getAcademicGroups(roster: String, handler: (List<AcademicGroup>?) -> Unit) =
            request<AcademicGroupsResponse>(path = "/config/acadGroups.json",
                    parameters = listOf("roster" to roster)) { handler(it?.academicGroups) }

    /**
     * Obtain all available class levels for a roster.
     * Class levels refer to the level of the course as specified by the course number
     * (i.e. 1000, 2000). For instance, CS 4300 has a class level of 4000.
     *
     * @param roster roster semester & year (i.e. FA14, SP15)
     * @param handler handle to receive all available class levels for a roster.
     */
    fun getClassLevels(roster: String, handler: (List<ClassLevel>?) -> Unit) =
            request<ClassLevelsResponse>(path = "/config/classLevels.json",
                    parameters = listOf("roster" to roster)) { handler(it?.classLevels) }

    /**
     * Obtain all available course subjects for a roster.
     *
     * @param roster roster semester & year (i.e. FA14, SP15)
     * @param handler handle to receive all available course subjects for a roster.
     */
    fun getSubjects(roster: String, handler: (List<Subject>?) -> Unit) =
            request<SubjectsResponse>(path = "/config/subjects.json",
                    parameters = listOf("roster" to roster)) { handler(it?.subjects) }

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
    fun getCourses(roster: String, subject: SubjectValue, handler: (List<Course>?) -> Unit) =
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
    fun getCourses(roster: String, subject: SubjectValue,
                   academicCareers: Array<AcademicCareerValue>?,
                   academicGroups: Array<AcademicGroupValue>?,
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
        request<CoursesResponse>(path = "/search/classes.json", parameters = params) {
            val courses = it?.courses
            if (courses == null) {
                println("ITTT:")
                println()
                println(it)
            }
            handler(courses)
        }
    }

}