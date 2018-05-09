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
    AG(description = "Agriculture and Life Sciences"),
    /**
     * Architecture, Art and Planning.
     */
    AR(description = "Architecture, Art and Planning"),
    /**
     * Arts and Sciences.
     */
    AS(description = "Arts and Sciences"),
    /**
     * Athletics
     */
    AT(description = "Athletics"),
    /**
     * Business.
     */
    BU(description = "Business"),
    /**
     * Continuing Education.
     */
    CE(description = "Continuing Education"),
    /**
     * Cornell Tech.
     */
    CT(description = "Cornell Tech"),
    /**
     * Engineering.
     */
    EN(description = "Engineering"),
    /**
     * Graduate.
     */
    GR(description = "Graduate"),
    /**
     * Graduate Management.
     */
    GM(description = "Graduate Management"),
    /**
     * Hotel Administration.
     */
    HA(description = "Hotel Administration"),
    /**
     * Human Ecology.
     */
    HE(description = "Human Ecology"),
    /**
     * Industrial and Labor Relations.
     */
    IL(description = "Industrial and Labor Relations"),
    /**
     * Law.
     */
    LA(description = "Law"),
    /**
     * Reserve Officer Training.
     */
    OT(description = description = "Reserve Officer Training"),
    /**
     * Veterinary Medicine.
     */
    VM(description = "Veterinary Medicine")
}
