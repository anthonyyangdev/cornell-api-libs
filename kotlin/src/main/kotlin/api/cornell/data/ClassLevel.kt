package api.cornell.data

import com.google.gson.annotations.SerializedName

/**
 * [ClassLevel] contains all the useful information about class levels.
 *
 * @param value value of the academic group.
 */
data class ClassLevel(@SerializedName(value = "descr") val value: Int = 0)
