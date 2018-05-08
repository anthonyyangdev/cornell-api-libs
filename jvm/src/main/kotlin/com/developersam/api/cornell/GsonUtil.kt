@file:JvmName(name = "GsonUtil")

package com.developersam.api.cornell

import com.google.gson.Gson
import java.io.InputStream
import java.io.InputStreamReader

/**
 * [gson] is the globally used GSON for JSON processing.
 */
internal val gson: Gson = Gson()

/**
 * [InputStream.toClass] conveniently converts the [InputStream] to a class with type [clazz].
 */
internal fun <T> InputStream.toClass(clazz: Class<T>): T {
    val reader = InputStreamReader(this)
    return gson.fromJson(reader, clazz)
}
