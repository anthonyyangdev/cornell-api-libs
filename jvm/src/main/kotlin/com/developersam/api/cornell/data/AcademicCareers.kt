package com.developersam.api.cornell.data

import com.google.gson.annotations.SerializedName

/**
 * [AcademicCareersResponse] is the response of a Academic Careers request.
 */
internal class AcademicCareersResponse private constructor() {

    /**
     * Main data of response.
     */
    private lateinit var data: Data
    /**
     * Obtain the academic careers information.
     */
    val academicCareers: List<AcademicCareer>
        get() = data.academicCareers

    /**
     * [Data] is an uninteresting class that just holds an array of [AcademicCareer].
     */
    private inner class Data private constructor() {
        lateinit var academicCareers: List<AcademicCareer>
    }

}

/**
 * [AcademicCareer] contains all the useful information about academic careers.
 */
class AcademicCareer private constructor() {

    /**
     * Value of the academic career.
     */
    lateinit var value: AcademicCareerValue
        private set

    /**
     * Text description of the value.
     */
    @SerializedName(value = "descr")
    lateinit var description: String
        private set

}