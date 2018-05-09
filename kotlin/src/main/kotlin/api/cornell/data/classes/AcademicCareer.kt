package api.cornell.data.classes

/**
 * [AcademicCareer] is a collection of supported academic career value.
 *
 * @param description a simple description of the code.
 */
enum class AcademicCareer(val description: String) {

    /**
     * Undergraduate.
     */
    UG("Undergraduate"),
    /**
     * Graduate
     */
    GR("Graduate"),
    /**
     * Graduate Management
     */
    GM("Graduate Management"),
    /**
     * Law.
     */
    LA("Law"),
    /**
     * Veterinary Medicine.
     */
    VM("Veterinary Medicine")
}
