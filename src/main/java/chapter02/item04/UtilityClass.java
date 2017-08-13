package chapter02.item04;

/**
 * Created by Jang Jeong Hyeon on 2017-08-13.
 */

// Noninstantiable utility class
public class UtilityClass {

    // Suppress default constructor for noninstantialbe
    private UtilityClass() {
        throw new AssertionError();
    }
}
