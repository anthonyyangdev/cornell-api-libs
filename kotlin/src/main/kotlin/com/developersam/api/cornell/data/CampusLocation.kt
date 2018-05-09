package com.developersam.api.cornell.data

/**
 * [CampusLocation] is a collection of supported campus location values.
 *
 * @param description a simple description of the campus location.
 */
enum class CampusLocation(val description: String) {
    /**
     * Main campus
     */
    ITH("Ithaca, NY (Main Campus)"),
    /**
     * New York City Cornell Tech.
     */
    NYCTECH("Cornell Tech")
}
