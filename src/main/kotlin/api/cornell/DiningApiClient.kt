package api.cornell

import api.cornell.data.eatery.Eatery
import api.cornell.data.eatery.EateryType
import api.cornell.data.eatery.Page
import api.cornell.data.eatery.PayMethod
import api.cornell.response.eatery.EateriesResponse
import api.cornell.response.eatery.PagesResponse
import com.google.gson.Gson
import com.google.gson.GsonBuilder
import com.google.gson.JsonDeserializer

/**
 * [DiningApiClient] defines a set of operation that the Cornell Dining API Client supports.
 */
object DiningApiClient {

    /**
     * [gson] is used for JSON processing.
     */
    private val gson: Gson = GsonBuilder()
            .registerTypeAdapter(EateryType::class.java,
                    JsonDeserializer<EateryType> { json, _, _ ->
                        val value = if (json.isJsonObject) {
                            val obj = json.asJsonObject
                            obj["descr"].asString
                        } else {
                            json.asString
                        }
                        EateryType.fromString(value)
                    })
            .registerTypeAdapter(PayMethod::class.java,
                    JsonDeserializer<PayMethod> { json, _, _ ->
                        val value = if (json.isJsonObject) {
                            val obj = json.asJsonObject
                            obj["descr"].asString
                        } else {
                            json.asString
                        }
                        PayMethod.fromString(value)
                    })
            .create()
    /**
     * [http] is used to send requests.
     */
    private val http: Http = Http(prefix = "https://now.dining.cornell.edu/api/1.0", gson = gson)

    /**
     * Obtain all pages on the Cornell Dining website.
     *
     * @param handler handler to receive all pages on the Cornell Dining website.
     */
    fun getPages(handler: (List<Page>) -> Unit): Unit =
            http.request<PagesResponse>(path = "/config/pages.json") { handler(it.pages) }

    /**
     * Obtain all eateries (i.e. dining halls, cafes) under Cornell Dining.
     * Eateries not under Cornell Dining, like Terrace and Mac’s, are not included.
     *
     * @param handler handler to receive all eateries under Cornell Dining.
     */
    fun getEateries(handler: (List<Eatery>) -> Unit): Unit =
            http.request<EateriesResponse>(path = "/dining/eateries.json") { handler(it.eateries) }

}