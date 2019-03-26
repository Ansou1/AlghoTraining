package com.ansou.algo;

import java.util.Scanner;
import java.util.Stack;

public class ParenthesisChecker {


    public static boolean find(String str) {

        Stack<Character> stack = new Stack<>();
        int n = str.length();

        for (int i = 0; i < n; i++) {
            char c = str.charAt(i);
            if (c == '{' || c == '(' || c == '[')
                stack.push(c);
            else {
                // if closing bracket
                if (!stack.isEmpty()) {
                    if (c == '}' && stack.peek() == '{')
                        stack.remove(stack.peek());
                    else if (c == ']' && stack.peek() == '[')
                        stack.remove(stack.peek());
                    else if (c == ')' && stack.peek() == '(')
                        stack.remove(stack.peek());
                    else
                        return false;
                } else
                    return false;
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while (t-- > 0) {
            String str = s.next();
            boolean ans = find(str);
            if (ans)
                System.out.println("balanced");
            else
                System.out.println("not balanced");
        }
    }
}
