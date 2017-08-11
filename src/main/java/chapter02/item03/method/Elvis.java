package chapter02.item03.method;

/**
 * Created by Jang Jeong Hyeon on 2017-08-12.
 */


// Singleton with static factory
public class Elvis {
    private static final Elvis INSTANCE = new Elvis();
    private Elvis(){
    }

    public static Elvis getInstance(){return INSTANCE;}

    public void leaveTheBuilding(){
        System.out.println("Whoa baby, I'm outta here!!");
    }

    public static void main(String args[]){
        Elvis elvis = Elvis.getInstance();
        elvis.leaveTheBuilding();
    }
}
