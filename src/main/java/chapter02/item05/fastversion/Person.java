package chapter02.item05.fastversion;

import java.util.Calendar;
import java.util.Date;

/**
 * Created by Jang Jeong Hyeon on 2017-08-27.
 */
public class Person {
    private final Date birthDate;

    public Person(final Date birthDate){
        // Defensive copy - see Item 39
        this.birthDate = birthDate;
    }

    // Other fields, methods

    /**
     * The starting and ending dates of the body boom
     */

    private static final Date BOOM_START;
    private static final Date BOOM_END;

    static{
        Calendar gmCal = Calendar.getInstance();
        gmCal.set(1946,Calendar.JANUARY,1,0,0);
        BOOM_START = gmCal.getTime();
        gmCal.set(1965,Calendar.JANUARY,1,0,0);
        BOOM_END = gmCal.getTime();
    }

    public boolean isBabyBoom(){
        return birthDate.compareTo(BOOM_START) > 0
                && birthDate.compareTo(BOOM_END) < 0;
    }
}
