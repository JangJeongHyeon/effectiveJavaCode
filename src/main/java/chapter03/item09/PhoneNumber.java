package chapter03.item09;

/**
 * Created by Jang Jeong Hyeon on 2017-10-26.
 */

// shows the needs for overriding hashcode when you override equals
public final class PhoneNumber {
    private final short areaCode;
    private final short prefix;
    private final short lineNumber;

    public PhoneNumber(short areaCode, short prefix, short lineNumber) {
        this.areaCode = areaCode;
        this.prefix = prefix;
        this.lineNumber = lineNumber;
    }

    private static void ragneCheck(final int arg, final int max, final String name){
        if(arg < 0 || arg > max)
            throw new IllegalArgumentException(name+" "+arg);
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == this)
            return true;
        if(!(obj instanceof PhoneNumber))
            return false;
        PhoneNumber pn = (PhoneNumber) obj;
        return pn.lineNumber == lineNumber && pn.prefix == prefix && pn.areaCode == areaCode;
    }
}
