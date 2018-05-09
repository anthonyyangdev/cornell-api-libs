package api.cornell;

import com.google.gson.Gson;
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.async.Callback;
import com.mashape.unirest.http.exceptions.UnirestException;
import com.mashape.unirest.request.GetRequest;
import com.sun.istack.internal.NotNull;
import com.sun.istack.internal.Nullable;

import java.util.Map;
import java.util.function.Consumer;

/**
 * {@code Http} is used for providing support for API access.
 */
class Http {
    
    /**
     * Prefix prefix for URL.
     */
    private final String prefix;
    /**
     * Gson used for data deserialization.
     */
    private final Gson gson;
    
    /**
     * Construct an {@code Http} object.
     *
     * @param prefix prefix prefix for URL.
     * @param gson gson used for data deserialization.
     */
    Http(String prefix, Gson gson) {
        this.prefix = prefix;
        this.gson = gson;
    }
    
    /**
     * Fetch the result from Cornell APIs without the prefix.
     * It defaults {@code parameters} to {@code null}.
     *
     * @param path API path without prefix.
     * @param type type of response.
     * @param handler defines a handler to process result.
     */
    <T> void request(@NotNull String path, @NotNull Class<T> type, @NotNull Consumer<T> handler) {
        request(path, null, type, handler);
    }
    
    /**
     * Fetch the result from Cornell APIs without the prefix.
     *
     * @param path API path without prefix.
     * @param parameters defines a list of parameters to give. This is optional.
     * @param type type of response.
     * @param handler defines a handler to process result.
     */
    <T> void request(@NotNull String path, @Nullable Map<String, Object> parameters,
                     @NotNull Class<T> type, @NotNull Consumer<T> handler) {
        GetRequest request = Unirest.get(prefix + path);
        parameters.forEach((key, value) -> {
            if (value instanceof Object[]) {
                Object[] values = (Object[]) value;
                for (Object v : values) {
                    request.queryString(key, v);
                }
            } else {
                request.queryString(key, value);
            }
        });
        request.asStringAsync(new Callback<String>() {
            @Override
            public void completed(HttpResponse<String> response) {
                String body = response.getBody();
                T value = gson.fromJson(body, type);
                handler.accept(value);
            }
    
            @Override
            public void failed(UnirestException e) {
                handler.accept(null);
            }
    
            @Override
            public void cancelled() {
                handler.accept(null);
            }
        });
    }
    
}
