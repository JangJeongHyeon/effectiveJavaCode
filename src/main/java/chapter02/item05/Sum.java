package chapter02.item05;

/**
 * Created by Jang Jeong Hyeon on 2017-08-27.
 */
public class Sum {
    // Hideously slow program! Can you spot the object creation?
    public static void main(String args[]){
        Long sum = 0L;
        for(long i = 0; i < Integer.MAX_VALUE; i++){
            sum += 1;
        }
        System.out.println(sum);
    }
}
