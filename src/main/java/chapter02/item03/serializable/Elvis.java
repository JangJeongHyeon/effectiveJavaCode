package chapter02.item03.serializable;

/**
 * Created by Jang Jeong Hyeon on 2017-08-12.
 */

// Serializable singleton with public final field
public class Elvis {
    public static final Elvis INSTANCE = new Elvis();
    private Elvis(){}
    public void leaveTheBuilding(){
        System.out.println("Whoa baby, I'm outta here!!");
    }

    private Object readResolve(){
        return INSTANCE;
    }

    public static void main(String args[]){
        Elvis elvis = Elvis.INSTANCE;
        elvis.leaveTheBuilding();
    }
}
