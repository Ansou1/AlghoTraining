package com.ansou.algo;

import java.util.Scanner;
import java.util.Stack;

public class ValidParenthesis {


    public static boolean find(String s) {

        Stack<Character> res = new Stack<Character>();
        for (char a : s.toCharArray()) {
            if (a == '(' || a == '[' || a == '{') {
                res.push(a);
            } else {
                if (!res.empty()) {
                    if (a == ')' && res.peek() == '(') {
                        res.pop();
                    } else if (a == '}' && res.peek() == '{') {
                        res.pop();
                    } else if (a == ']' && res.peek() == '[') {
                        res.pop();
                    } else
                        return false;
                } else
                    return false;
            }
        }
        return res.empty();
    }

    public static void main(String[] args) {
        System.out.println(find("[([]])"));
    }
}
