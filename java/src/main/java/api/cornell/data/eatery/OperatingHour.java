package api.cornell.data.eatery;

import com.google.common.base.MoreObjects;
import org.jetbrains.annotations.NotNull;

import java.util.Collections;
import java.util.List;

/**
 * {@code OperatingHour} contains all useful information about operating hours.
 */
public final class OperatingHour {
    
    /**
     * Date of operation.
     */
    @NotNull
    private final String date;
    
    /**
     * Status of operation.
     */
    @NotNull
    private final String status;
    
    /**
     * A list of events.
     */
    @NotNull
    private final List<Event> events;
    
    /**
     * Constructor for GSON.
     */
    private OperatingHour() {
        date = "";
        status = "";
        events = Collections.emptyList();
    }
    
    /**
     * Obtain date of operation.
     *
     * @return date of operation.
     */
    @NotNull
    public String getDate() {
        return date;
    }
    
    /**
     * Obtain status of operation.
     * Most of the time it is "EVENTS".
     *
     * @return status of operation.
     */
    @NotNull
    public String getStatus() {
        return status;
    }
    
    /**
     * Obtain a list of events.
     *
     * @return a list of events.
     */
    @NotNull
    public List<Event> getEvents() {
        return events;
    }
    
    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("date", date)
                .add("status", status)
                .add("events", events)
                .toString();
    }
}
