package api.cornell.data

/**
 * [AcademicCareerValue] is a collection of supported academic career value.
 *
 * @param description a simple description of the code.
 */
enum class AcademicCareerValue(val description: String) {
    UG("Undergraduate"), GR("Graduate"), GM("Graduate Management"),
    LA("Law"), VM("Veterinary Medicine")
}
