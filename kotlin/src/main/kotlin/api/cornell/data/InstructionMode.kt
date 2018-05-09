package api.cornell.data

/**
 * [InstructionMode] is a collection of supported instruction modes.
 *
 * @param description a simple description of the code.
 */
enum class InstructionMode(val description: String) {
    P("In Person"), DW("Distance Learning - WWW")
}
