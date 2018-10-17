package api.cornell.data.classes

/**
 * [InstructionMode] is a collection of supported instruction modes.
 *
 * @param description a simple description of the code.
 */
enum class InstructionMode(val description: String) {
    /**
     * In Person.
     */
    P("In Person"),
    /**
     * Distance Learning - WWW.
     */
    DW("Distance Learning - WWW")
}
