package com.ansou.algo;

import java.util.Stack;

public class StackOperations {

    // Function to insert element to stack
    public static void insert(Stack<Integer> st, int x)
    {
        st.add(x);

    }

    // Function to pop element from stack
    public static void remove(Stack<Integer> st)
    {
        int x = st.pop();

    }

    // Function to return top of stack
    public static void headOf_Stack(Stack<Integer> st)
    {
        int x = st.peek();
        System.out.println(x + " ");
    }

    // Function to find the element in stack
    public static void find(Stack<Integer> st, int val)
    {
        if(st.contains(val)){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }

    }

    public static void main(String[] args) {
    }
}
