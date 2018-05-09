package api.cornell.data.eatery;

import java.util.Arrays;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;

/**
 * {@code PayMethod} is a collection of supported pay methods.
 */
public enum PayMethod {
    
    /**
     * Meal Plan - Debit Plans (Big Red Bucks, Meal Choice, etc)
     */
    MEAL_PLAN_DEBIT("Meal Plan - Debit Plans (Big Red Bucks, Meal Choice, etc)"),
    /**
     * Meal Plan - Meal Swipe
     */
    MEAL_PLAN_SWIPE("Meal Plan - Meal Swipe"),
    /**
     * Cornell Card
     */
    CORNELL_CARD("Cornell Card"),
    /**
     * Major Credit Cards (VISA, MasterCard, AMEX)
     */
    CREDIT_CARD("Major Credit Cards (VISA, MasterCard, AMEX)"),
    /**
     * Mobile Payments (Apple Pay, Google Wallet)
     */
    MOBILE_PAYMENTS("Mobile Payments (Apple Pay, Google Wallet)"),
    /**
     * Cash.
     */
    CASH("Cash");
    
    /**
     * A simple description of the method.
     */
    private final String description;
    
    /**
     * Mapping from description to value.
     */
    private static final Map<String, PayMethod> MAP = Arrays.stream(PayMethod.values())
            .collect(Collectors.toMap(i -> i.description, i -> i));
    
    /**
     * Construct an {@code PayMethod}.
     *
     * @param description a simple description of the method.
     */
    PayMethod(String description) {
        this.description = description;
    }
    
    /**
     * Obtain the description of the method.
     *
     * @return the description of the method.
     */
    public String getDescription() {
        return description;
    }
    
    /**
     * Converts a string to a {@code PayMethod}.
     *
     * @param str string candidate.
     * @return corresponding {@code PayMethod}.
     * @throws NoSuchElementException if there is no such {@code PayMethod}.
     */
    public static PayMethod fromString(String str) {
        PayMethod i = MAP.get(str);
        if (i == null) {
            throw new NoSuchElementException();
        }
        return i;
    }
    
}
