package api.cornell.data.eatery;

import com.google.common.base.MoreObjects;
import com.google.gson.annotations.SerializedName;
import org.jetbrains.annotations.NotNull;

import java.util.Collections;
import java.util.List;

/**
 * {@code Event} contains all useful information about an event of dining hall (e.g. lunch, dinner).
 */
public final class Event {
    
    /**
     * Description of the event.
     */
    @NotNull
    @SerializedName(value = "descr")
    private final String description;
    /**
     * Start and end time in timestamp format.
     */
    private final long startTimestamp, endTimestamp;
    /**
     * Start and end time in string.
     */
    @NotNull
    private final String start, end;
    /**
     * The summary of the calendar.
     */
    @NotNull
    @SerializedName(value = "calSummary")
    private final String calendarSummary;
    /**
     * A list of menu categories.
     */
    @NotNull
    private final List<MenuCategory> menu;
    
    /**
     * Constructor for GSON.
     */
    private Event() {
        description = "";
        startTimestamp = endTimestamp = 0;
        start = end = "";
        calendarSummary = "";
        menu = Collections.emptyList();
    }
    
    /**
     * Obtain description of the event.
     *
     * @return description of the event.
     */
    @NotNull
    public String getDescription() {
        return description;
    }
    
    /**
     * Obtain start time in timestamp format.
     *
     * @return start time in timestamp format.
     */
    public long getStartTimestamp() {
        return startTimestamp;
    }
    
    /**
     * Obtain end time in timestamp format.
     *
     * @return end time in timestamp format.
     */
    public long getEndTimestamp() {
        return endTimestamp;
    }
    
    /**
     * Obtain start time in string.
     *
     * @return start time in string.
     */
    @NotNull
    public String getStart() {
        return start;
    }
    
    /**
     * Obtain end time in string.
     *
     * @return end time in string.
     */
    @NotNull
    public String getEnd() {
        return end;
    }
    
    /**
     * Obtain the summary of the calendar.
     *
     * @return the summary of the calendar.
     */
    @NotNull
    public String getCalendarSummary() {
        return calendarSummary;
    }
    
    /**
     * Obtain a list of menu categories.
     *
     * @return a list of menu categories.
     */
    @NotNull
    public List<MenuCategory> getMenu() {
        return menu;
    }
    
    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("description", description)
                .add("startTimestamp", startTimestamp)
                .add("endTimestamp", endTimestamp)
                .add("start", start)
                .add("end", end)
                .add("calendarSummary", calendarSummary)
                .add("menu", menu)
                .toString();
    }
}
