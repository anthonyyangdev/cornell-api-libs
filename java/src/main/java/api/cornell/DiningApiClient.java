package api.cornell;

import api.cornell.data.eatery.Eatery;
import api.cornell.data.eatery.EateryType;
import api.cornell.data.eatery.Page;
import api.cornell.data.eatery.PayMethod;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonDeserializer;

import java.util.List;
import java.util.function.Consumer;

/**
 * {@code DiningApiClient} defines a set of operation that the Cornell Dining API Client supports.
 */
public final class DiningApiClient {
    
    /**
     * The only instance.
     */
    private static final DiningApiClient INSTANCE = new DiningApiClient();
    /**
     * Used for JSON processing.
     */
    private static final Gson GSON = new GsonBuilder()
            .registerTypeAdapter(EateryType.class, (JsonDeserializer<EateryType>) (j, $1, $2) -> {
                String value;
                if (j.isJsonObject()) {
                    value = j.getAsJsonObject().get("descr").getAsString();
                } else {
                    value = j.getAsString();
                }
                return EateryType.fromString(value);
            })
            .registerTypeAdapter(PayMethod.class, (JsonDeserializer<PayMethod>) (j, $1, $2) -> {
                String value;
                if (j.isJsonObject()) {
                    value = j.getAsJsonObject().get("descr").getAsString();
                } else {
                    value = j.getAsString();
                }
                return PayMethod.fromString(value);
            })
            .create();
    /**
     * Used to send requests.
     */
    private static final Http HTTP = new Http("https://now.dining.cornell.edu/api/1.0", GSON);
    
    /**
     * Sealed constructor.
     */
    private DiningApiClient() {}
    
    /**
     * Obtain the only instance of itself.
     *
     * @return the only instance of itself.
     */
    public static DiningApiClient getInstance() {
        return INSTANCE;
    }
    
    /**
     * Obtain all pages on the Cornell Dining website.
     *
     * @param handler handler to receive all pages on the Cornell Dining website.
     */
    public void getPages(Consumer<List<Page>> handler) {
        HTTP.request("/config/pages.json", PagesResponse.class, resp -> {
            if (resp == null) {
                handler.accept(null);
            } else {
                handler.accept(resp.getPages());
            }
        });
    }
    
    /**
     * Obtain all eateries (i.e. dining halls, cafes) under Cornell Dining.
     * Eateries not under Cornell Dining, like Terrace and Mac’s, are not included.
     *
     * @param handler handler to receive all eateries under Cornell Dining.
     */
    public void getEateries(Consumer<List<Eatery>> handler) {
        HTTP.request("/dining/eateries.json", EateriesResponse.class, resp -> {
            if (resp == null) {
                handler.accept(null);
            } else {
                handler.accept(resp.getEateries());
            }
        });
    }
    
}
