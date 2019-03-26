package com.ansou.algo;

import java.util.Stack;

public class ReverseAStringUsingStack {

    public void reverse(String str){
        Stack<Character> myStack = new Stack<>();
        char[] tabChar = str.toCharArray();

        for (int i = 0; i < str.length(); i++) {
            myStack.add(str.charAt(i));
        }
        for (int i = 0; i < str.length(); i++) {
            tabChar[i] = myStack.pop();
        }
        System.out.println(String.valueOf(tabChar));
    }

    public static void main(String[] args) {
    }
}
