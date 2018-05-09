package api.cornell.data.classes;

import com.google.common.base.MoreObjects;
import com.google.gson.annotations.SerializedName;
import org.jetbrains.annotations.NotNull;

/**
 * {@code Instructor} contains all the information about class instructors.
 */
public final class Instructor {
    
    /**
     * Names of the instructor.
     */
    @NotNull
    private final String firstName, middleName, lastName;
    /**
     * NetID of the instructor.
     */
    @NotNull
    @SerializedName(value = "netid")
    private final String netId;
    /**
     * Assign sequence of the instructor.
     */
    @SerializedName(value = "instrAssignSeq")
    private final int assignSequence;
    
    /**
     * Constructor for GSON.
     */
    private Instructor() {
        firstName = middleName = lastName = "";
        netId = "";
        assignSequence = 0;
    }
    
    /**
     * Obtain first name of the instructor.
     *
     * @return first name of the instructor.
     */
    @NotNull
    public String getFirstName() {
        return firstName;
    }
    
    /**
     * Obtain middle name of the instructor.
     *
     * @return middle name of the instructor.
     */
    @NotNull
    public String getMiddleName() {
        return middleName;
    }
    
    /**
     * Obtain last name of the instructor.
     *
     * @return last name of the instructor.
     */
    @NotNull
    public String getLastName() {
        return lastName;
    }
    
    /**
     * Obtain NetID of the instructor.
     *
     * @return NetID of the instructor.
     */
    @NotNull
    public String getNetId() {
        return netId;
    }
    
    /**
     * Obtain assign sequence of the instructor.
     *
     * @return assign sequence of the instructor.
     */
    public int getAssignSequence() {
        return assignSequence;
    }
    
    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("firstName", firstName)
                .add("middleName", middleName)
                .add("lastName", lastName)
                .add("netId", netId)
                .add("assignSequence", assignSequence)
                .toString();
    }
}
