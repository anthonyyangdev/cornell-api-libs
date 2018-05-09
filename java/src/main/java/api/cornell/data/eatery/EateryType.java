package api.cornell.data.eatery;

import org.jetbrains.annotations.NotNull;

import java.util.Arrays;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;

/**
 * {@code EateryType} is a collection of supported eatery type.
 */
public enum EateryType {
    
    /**
     * All You Care To Eat Dining Room.
     */
    ALL_YOU_CARE_TO_EAT("All You Care To Eat Dining Room"),
    /**
     * Cafe.
     */
    CAFE("Cafe"),
    /**
     * Coffee shop.
     */
    COFFEE_SHOP("Coffee Shop"),
    /**
     * Convenience store.
     */
    CONVENIENCE_STORE("Convenience Store"),
    /**
     * Cart.
     */
    CART("Cart"),
    /**
     * Food court.
     */
    FOOD_COURT("Food Court");
    
    /**
     * A simple description of the type.
     */
    @NotNull
    private final String description;
    /**
     * Mapping from description to value.
     */
    private static final Map<String, EateryType> MAP = Arrays.stream(EateryType.values())
            .collect(Collectors.toMap(i -> i.description, i -> i));
    
    /**
     * Construct an {@code EateryType}.
     *
     * @param description a simple description of the type.
     */
    EateryType(@NotNull String description) {
        this.description = description;
    }
    
    /**
     * Obtain the description of the type.
     *
     * @return the description of the type.
     */
    @NotNull
    public String getDescription() {
        return description;
    }
    
    /**
     * Converts a string to a {@code EateryType}.
     *
     * @param str string candidate.
     * @return corresponding {@code EateryType}.
     * @throws NoSuchElementException if there is no such {@code EateryType}.
     */
    public static EateryType fromString(String str) {
        EateryType i = MAP.get(str);
        if (i == null) {
            throw new NoSuchElementException();
        }
        return i;
    }
    
}
