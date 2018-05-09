package api.cornell.data.classes

/**
 * [AcademicGroup] is a collection of supported academic group value.
 *
 * @param description a simple description of the code.
 */
enum class AcademicGroup(val description: String) {
    /**
     * Agriculture and Life Sciences.
     */
    AG("Agriculture and Life Sciences"),
    /**
     * Architecture, Art and Planning.
     */
    AR("Architecture, Art and Planning"),
    /**
     * Arts and Sciences.
     */
    AS("Arts and Sciences"),
    /**
     * Athletics
     */
    AT("Athletics"),
    /**
     * Business.
     */
    BU("Business"),
    /**
     * Continuing Education.
     */
    CE("Continuing Education"),
    /**
     * Cornell Tech.
     */
    CT("Cornell Tech"),
    /**
     * Engineering.
     */
    EN("Engineering"),
    /**
     * Graduate.
     */
    GR("Graduate"),
    /**
     * Graduate Management.
     */
    GM("Graduate Management"),
    /**
     * Hotel Administration.
     */
    HA(description = "Hotel Administration"),
    /**
     * Human Ecology.
     */
    HE("Human Ecology"),
    /**
     * Industrial and Labor Relations.
     */
    IL("Industrial and Labor Relations"),
    /**
     * Law.
     */
    LA("Law"),
    /**
     * Reserve Officer Training.
     */
    OT("Reserve Officer Training"),
    /**
     * Veterinary Medicine.
     */
    VM("Veterinary Medicine")
}
