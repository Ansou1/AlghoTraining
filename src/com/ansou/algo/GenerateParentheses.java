package com.ansou.algo;

import java.util.ArrayList;
import java.util.List;

public class GenerateParentheses {

    private static void helper(List<String> result, int left, int right,String string) {
        System.out.println("helper => " + string);
        if (right < left) {
            return;
        }
        if (left == 0 && right == 0) {
            result.add(string);
            return;
        }
        if (left > 0) {
            helper(result,left-1,right,string+'(');
        }
        if (right > 0){
            helper(result, left,right-1,string+')');
        }
    }

    public static List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        helper(result, n, n, "");
        return result;
    }

    public static void main(String[] args) {
        List<String> result = generateParenthesis(3);

        for (String item : result) {
            System.out.println(item);
        }
    }
}
