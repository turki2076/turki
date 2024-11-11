package assignment;

import java.util.Arrays;

public class ArrayStack<T> {
    private  static  final  int DEFAULT_CAPACITY=2;
    private int top;
    private T[]  stack;


    ArrayStack(){
        this(DEFAULT_CAPACITY);

    }
    ArrayStack(int size){
        top=0;
        stack = (T[]) new Object[size];

    }


    boolean Empty(){
        return top==0;
    }

    int size(){
        return  top;
    }
    void push(T element){
        if(size()==stack.length);
        expand();
        stack[top]=element;
        top++;
    }

    public void expand(){
        stack= Arrays.copyOf(stack,stack.length * 2);
    }

    @Override
    public String toString() {
        return "StackArray{" +
                "top=" + top +
                ", stack=" + Arrays.toString(stack) +
                '}';
    }

    T peak(){
        if(Empty());
        return stack[top-1];

    }
    T pop(){
        if(Empty());
        top--;
        T removed= stack[top];
        stack[top]=null;
        return  removed;

    }


    void display() {
        if(Empty() ){
            System.out.println("Is Empty");

        }
        for(int i=top-1; i>=0; i--) {
            System.out.println(stack[i]);
        }


    }


    private boolean RomoveDuplicate(T element) {
        if (size() == 0) {
            return false;
        }
        for (int i = 0; i <size(); i++) {
            if (stack[i] == element) {
                return true;
            }
        }
        return false;
    }



    public void merge(ArrayStack<T> list1, ArrayStack<T> list2) {
        int newSize = list1.size() + list2.size();


        if (stack.length < newSize) {
            stack = Arrays.copyOf(stack, newSize);
        }

        for (int i = 0; i < list1.size(); i++) {
            boolean duplicated;
            duplicated = RomoveDuplicate( list1.stack[i]);
            if (!duplicated)
                push(list1.stack[i]);
        }

        for (int i = 0; i < list2.size(); i++) {
            boolean duplicated;
            duplicated = RomoveDuplicate( list2.stack[i]);
            if (!duplicated)
                push(list2.stack[i]);
        }
    }




    public static void main(String[] args) {
        ArrayStack<Integer> list1=new ArrayStack();
        ArrayStack<Integer> list2=new ArrayStack();
        ArrayStack<Integer> list3=new ArrayStack();

        list1.push(100);
        list1.push(90);
        list1.push(70);

        list2.push(100);
        list2.push(90);
        list2.push(60);

        list3.merge(list1,list2);
        list3.display();
    }
}