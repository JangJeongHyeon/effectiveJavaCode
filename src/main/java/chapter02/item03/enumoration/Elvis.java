package chapter02.item03.enumoration;

/**
 * Created by Jang Jeong Hyeon on 2017-08-12.
 */
public enum Elvis {
    INSTANCE;

    public void leaveTheBuilding(){
        System.out.println("Whoa baby, I'm outta here!!");
    }

    public static void main(String args[]){
        Elvis elvis = Elvis.INSTANCE;
        elvis.leaveTheBuilding();
    }
}
