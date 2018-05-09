package api.cornell.data

/**
 * [AcademicGroupValue] is a collection of supported academic group value.
 *
 * @param description a simple description of the code.
 */
enum class AcademicGroupValue(val description: String) {
    AG("Agriculture and Life Sciences"), AR("Architecture, Art and Planning"),
    AS("Arts and Sciences"), AT("Athletics"), BU("Business"),
    CT("Cornell Tech"), EN("Engineering"), GR("Graduate"),
    HE("Human Ecology"), IL("Industrial and Labor Relations"),
    LA("Law"), OT("Reserve Officer Training"), VM("Veterinary Medicine")
}
