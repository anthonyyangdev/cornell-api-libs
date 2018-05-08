package com.developersam.api.cornell.data

/**
 * A simple [Bool] enum for Cornell APIs.
 */
enum class Bool {
    Y, N;

    /**
     * [toBoolean] converts the [Bool] value to a boolean.
     */
    fun toBoolean() = when (this) {
        Y -> true
        N -> false
    }
}