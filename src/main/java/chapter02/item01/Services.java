package chapter02.item01;

        import java.util.Map;
        import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by Jang Jeong Hyeon on 2017-08-03.
 */
public class Services {

    // Prevents instantiations
    private Services() {
    }

    // map for register to service with service name
    // ConcurrentHashMap - support high speed than synchronizedMap objects and guarantee of synchronization
    private static final Map<String, Provider> providers = new ConcurrentHashMap<String, Provider>();
    public static final String DEFAULT_SERVICE_NAME = "<def>";

    // Provider registration API
    public static void registerDefaultProvider(final Provider p) {
        registerProvider(DEFAULT_SERVICE_NAME, p);
    }

    public static void registerProvider(final String name, final Provider p) {
        providers.put(name, p);
    }

    // Service access API
    public static Service newInstance() {
        return newInstance(DEFAULT_SERVICE_NAME);
    }


    public static Service newInstance(final String name) {
        Provider provider = providers.get(name);
        if (provider == null)
            throw new IllegalArgumentException("No Provider registered with name: " + name);
        return provider.newService();
    }
}
