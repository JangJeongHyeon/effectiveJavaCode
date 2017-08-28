package chapter02.item06;

import java.util.Arrays;

/**
 * Created by Jang Jeong Hyeon on 2017-08-29.
 */
public class Stack {
    private Object elements[];
    private int size = 0;
    private static final int DEFAULT_INITIAL_CAPACITY = 16;

    public Stack(){
        elements = new Object[DEFAULT_INITIAL_CAPACITY];
    }

    public void push(final Object o){
        ensureCapacity();
        elements[size++] = o;
    }


    public Object pop(){
        if(size == 0)
            throw new EmptyStackException();
        // it will be occur memory leak
        // unintentional object retention
        // solve code is follow
        /*
            Object result = elements[--size];
            elements[size] = null;
            return result;

         */
        return elements[--size];
    }

    /**
     * Ensure space for at least one more element, roughly doubling the capacity
     * each time the array needs to grow
     */
    private void ensureCapacity(){
        if(elements.length == size)
            elements = Arrays.copyOf(elements,2*size+1); // Arrays.copOf(origin, newLength)
    }
}
