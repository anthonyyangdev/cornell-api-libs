package api.cornell;

/**
 * {@code ClassesApiClient} defines a set of operation that the Cornell Classes API Client supports.
 */
public final class ClassesApiClient {
    
    /**
     * The only instance.
     */
    private static final ClassesApiClient INSTANCE = new ClassesApiClient();
    
    /**
     * Sealed constructor.
     */
    private ClassesApiClient() {}
    
    /**
     * Obtain the only instance of itself.
     *
     * @return the only instance of itself.
     */
    public static ClassesApiClient getInstance() {
        return INSTANCE;
    }
    
}
