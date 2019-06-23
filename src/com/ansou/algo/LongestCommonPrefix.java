package com.ansou.algo;

import java.util.Arrays;

public class LongestCommonPrefix {

    public static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) return "";
        Arrays.sort(strs);
        int i = 0;
        while (i < strs[0].length() && (strs[0].charAt(i) == strs[strs.length - 1].charAt(i))) {
            i++;
        }
        return strs[0].substring(0, i);
    }

    public static void main(String[] args) {
        String[] arrSuccess = {"flower","flow","flight"};
        String[] arrFail = {"dog","racecar","car"};

        System.out.println(longestCommonPrefix(arrSuccess));
        System.out.println(longestCommonPrefix(arrFail));
    }
}
