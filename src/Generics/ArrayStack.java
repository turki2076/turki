package Generics;

public class ArrayStack <T>{
    private final static int default_capacity=2;
    private int Top;
    private T [] stack;
    public ArrayStack(){
        this (default_capacity);
    }

    public ArrayStack(int initialCapacity){
        Top=0;
        stack = (T[]) new Object[initialCapacity];
    }

    //operations - methods
    int size(){
        return Top;
    }
    boolean isEmpty(){
            return Top == 0;
    }

}
