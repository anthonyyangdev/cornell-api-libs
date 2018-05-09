package com.developersam.api.cornell.data

/**
 * [Campus] is a collection of supported campus values.
 *
 * @param description a simple description of the campus.
 */
enum class Campus(val description: String) {
    /**
     * Main campus
     */
    MAIN("Ithaca"),
    /**
     * New York City Cornell Tech.
     */
    NYT("New York Tech Campus")
}
