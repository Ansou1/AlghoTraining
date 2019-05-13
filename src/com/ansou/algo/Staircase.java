package com.ansou.algo;

public class Staircase {

    static void staircase(int n) {
        String str = "#";
        for (int i = 0; i < n; i++)
        {
            System.out.printf("%" + (n+1) + "s", str + "\n");
            str += "#";
        }
    }

    public static void main(String[] args) {
        staircase(5);
    }

}
