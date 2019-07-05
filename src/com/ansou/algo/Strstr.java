package com.ansou.algo;

public class Strstr {

    public static int strStr(String haystack, String needle) {
        if (needle.equals("")) {
            return 0;
        } else if(needle.length() > haystack.length()) {
            return -1;
        }
        for (int i = 0; i <= haystack.length() - needle.length(); i++) {
            int j = 0;
            while (haystack.charAt(i + j) == needle.charAt(j)) {
                j++;
                if (j == needle.length())
                    return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(strStr("hello", "ll"));
        System.out.println(strStr("aaaaa", "bba"));
        System.out.println(strStr("a", ""));
        System.out.println(strStr("", ""));
    }
}
