package api.cornell.data.eatery;

import com.google.common.base.MoreObjects;
import com.google.gson.annotations.SerializedName;
import org.jetbrains.annotations.NotNull;

import java.util.Collections;
import java.util.List;

/**
 * {@code Eatery} contains all the useful information about eatery.
 */
public final class Eatery {
    
    /**
     * ID of the eatery.
     */
    private final int id;
    
    /**
     * Code of the eatery.
     */
    @NotNull
    @SerializedName(value = "slug")
    private final String code;
    
    /**
     * Name of the eatery.
     */
    @NotNull
    private final String name;
    
    /**
     * Short name of the eatery.
     */
    @NotNull
    @SerializedName(value = "nameshort")
    private final String shortName;
    
    /**
     * About the eatery.
     */
    @NotNull
    private final String about;
    
    /**
     * About the eatery, shorter version.
     */
    @NotNull
    @SerializedName(value = "aboutshort")
    private final String shortAbout;
    
    /**
     * Whether it's related to Cornell dining.
     */
    private final boolean cornellDining;
    
    /**
     * Latitude of the eatery.
     */
    private final double latitude;
    
    /**
     * Longitude of the eatery.
     */
    private final double longitude;
    
    /**
     * Operating hours of the eatery.
     */
    @NotNull
    private final List<OperatingHour> operatingHours;
    
    /**
     * Types of eatery.
     */
    @NotNull
    private final List<EateryType> eateryTypes;
    
    /**
     * Payment methods for the eatery.
     */
    @NotNull
    private final List<PayMethod> payMethods;
    
    /**
     * List of dining items.
     */
    @NotNull
    private final List<DiningItem> diningItems;
    
    /**
     * List of dining cuisines.
     */
    @NotNull
    private final List<DiningCuisine> diningCuisines;
    
    /**
     * Constructor for GSON.
     */
    private Eatery() {
        id = 0;
        code = "";
        name = "";
        shortName = "";
        about = "";
        shortAbout = "";
        cornellDining = false;
        latitude = 0;
        longitude = 0;
        operatingHours = Collections.emptyList();
        eateryTypes = Collections.emptyList();
        payMethods = Collections.emptyList();
        diningItems = Collections.emptyList();
        diningCuisines = Collections.emptyList();
    }
    
    /**
     * Obtain id of the eatery.
     *
     * @return id of the eatery.
     */
    public int getId() {
        return id;
    }
    
    /**
     * Obtain code of the eatery.
     *
     * @return code of the eatery.
     */
    @NotNull
    public String getCode() {
        return code;
    }
    
    /**
     * Obtain name of the eatery.
     *
     * @return name of the eatery.
     */
    @NotNull
    public String getName() {
        return name;
    }
    
    /**
     * Obtain short name of the eatery.
     *
     * @return short name of the eatery.
     */
    @NotNull
    public String getShortName() {
        return shortName;
    }
    
    /**
     * Obtain about the eatery.
     *
     * @return about the eatery.
     */
    @NotNull
    public String getAbout() {
        return about;
    }
    
    /**
     * Obtain about the eatery, shorter version.
     *
     * @return about the eatery, shorter version.
     */
    @NotNull
    public String getShortAbout() {
        return shortAbout;
    }
    
    /**
     * Report whether it's related to Cornell dining.
     *
     * @return whether it's related to Cornell dining.
     */
    public boolean isCornellDining() {
        return cornellDining;
    }
    
    /**
     * Obtain latitude of the eatery.
     *
     * @return latitude of the eatery.
     */
    public double getLatitude() {
        return latitude;
    }
    
    /**
     * Obtain longitude of the eatery.
     *
     * @return longitude of the eatery.
     */
    public double getLongitude() {
        return longitude;
    }
    
    /**
     * Obtain operating hours of the eatery.
     *
     * @return operating hours of the eatery.
     */
    @NotNull
    public List<OperatingHour> getOperatingHours() {
        return operatingHours;
    }
    
    /**
     * Obtain types of eatery.
     *
     * @return types of eatery.
     */
    @NotNull
    public List<EateryType> getEateryTypes() {
        return eateryTypes;
    }
    
    /**
     * Obtain payment methods for the eatery.
     *
     * @return payment methods for the eatery.
     */
    @NotNull
    public List<PayMethod> getPayMethods() {
        return payMethods;
    }
    
    /**
     * Obtain list of dining items.
     *
     * @return list of dining items.
     */
    @NotNull
    public List<DiningItem> getDiningItems() {
        return diningItems;
    }
    
    /**
     * Obtain list of dining cuisines.
     *
     * @return list of dining cuisines.
     */
    @NotNull
    public List<DiningCuisine> getDiningCuisines() {
        return diningCuisines;
    }
    
    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("id", id)
                .add("code", code)
                .add("name", name)
                .add("shortName", shortName)
                .add("about", about)
                .add("shortAbout", shortAbout)
                .add("cornellDining", cornellDining)
                .add("latitude", latitude)
                .add("latitude", latitude)
                .add("operatingHours", operatingHours)
                .add("eateryTypes", eateryTypes)
                .add("payMethods", payMethods)
                .add("diningItems", diningItems)
                .add("diningCuisines", diningCuisines)
                .toString();
    }
}
