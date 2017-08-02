package chapter02.item01;

/**
 * Created by Jang Jeong Hyeon on 2017-08-03.
 */
public class Main {
    public static void main(String args[]) {

        // Providers would execute these lines
        Services.registerDefaultProvider(DEFAULT_PROVIDER);
        Services.registerProvider("comp",COMP_PROVIDER);
        Services.registerProvider("armed",ARMED_PROVIDER);


        // Clients would execute these lines
        Service defaultService = Services.newInstance(); // get default service in default provider
        Service compService = Services.newInstance("comp");
        Service armedService = Services.newInstance("armed");


        // test
        System.out.println("service 1 : "+defaultService);
        System.out.println("service 2 : "+compService);
        System.out.println("service 3 : "+armedService);

    }

    private static Provider DEFAULT_PROVIDER = new Provider() {

        public Service newService() {
            return new Service() {
                @Override
                public String toString() {
                    return "Default Service";
                }
            };
        }
    };

    private static Provider COMP_PROVIDER = new Provider() {
        public Service newService() {
            return new Service() {
                @Override
                public String toString() {
                    return "Complementary service";
                }
            };
        }
    };

    private static Provider ARMED_PROVIDER = new Provider() {
        public Service newService() {
            return new Service() {
                @Override
                public String toString() {
                    return "Armed service";
                }
            };
        }
    };
}
