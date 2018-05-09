package api.cornell.response

import api.cornell.data.AcademicCareer
import com.google.gson.annotations.SerializedName

/**
 * [AcademicCareersResponse] is the response of a Academic Careers request.
 */
internal class AcademicCareersResponse private constructor() {

    /**
     * Main data of response.
     */
    private val data: Data? = null
    /**
     * Obtain the academic careers information.
     */
    val academicCareers: List<AcademicCareer>?
        get() = data?.academicCareers

    /**
     * [Data] is an uninteresting class that just holds an array of [AcademicCareer].
     */
    private inner class Data private constructor() {
        @SerializedName(value = "acadCareers")
        val academicCareers: List<AcademicCareer>? = null
    }

}

