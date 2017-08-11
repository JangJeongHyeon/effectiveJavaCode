package chapter02.item03.filed;

/**
 * Created by Jang Jeong Hyeon on 2017-08-12.
 */

// Singleton with public final static filed
public class Elvis {
    public static final Elvis INSTANCE = new Elvis();
    private Elvis(){
    }

    public void leaveTheBuilding(){
        System.out.println("Whoa baby, I'm outta here!!");
    }

    public static void main(String args[]){
        Elvis elvis = Elvis.INSTANCE;
        elvis.leaveTheBuilding();
    }
}
