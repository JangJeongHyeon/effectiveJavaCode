package chapter02.item05.slowversion;

import java.util.Calendar;
import java.util.Date;

/**
 * Created by Jang Jeong Hyeon on 2017-08-27.
 */
public class Person {
    private final Date birthDate;

    public Person(Date birthDate) {
        // Defensive copy - see Item 39
        this.birthDate = birthDate;
    }

    // Other fields, methods omitted

    // Don't do this
    public boolean isBabyBoom(){
        //Unnecessary allocation of expensive object
        Calendar gmCal = Calendar.getInstance();
        gmCal.set(1946,Calendar.JANUARY, 1,0,0);
        Date boomStart = gmCal.getTime();
        gmCal.set(1965,Calendar.JANUARY, 1,0,0);
        Date boomEnd = gmCal.getTime();

        return birthDate.compareTo(boomStart) >= 0
                && birthDate.compareTo(boomEnd) < 0;
    }
}
