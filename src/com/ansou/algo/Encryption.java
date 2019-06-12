package com.ansou.algo;

public class Encryption {

    static String encryption(String s) {
        s = s.replaceAll("\\s+", "");

        double row = Math.floor(Math.pow(s.length(), 0.5));
        double col = Math.ceil(Math.pow(s.length(), 0.5));
        String ans = "";

        for (int i = 0; i < col; i++) {
            int j = 0;
            while (i + j < s.length()) {
                ans = ans + s.substring(i + j, i + j + 1);
                j = (int)(j + col);
            }
            ans = ans + " ";
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(encryption("have a nice day"));
    }
}
