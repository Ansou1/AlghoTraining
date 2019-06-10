package com.ansou.algo;

public class TaumAndBday {

    static long taumBday(int b, int w, int bc, int wc, int z) {
        long x = bc > wc ? ((bc - wc > z)? wc + z : bc) : bc;
        long y = wc > bc ? ((wc - bc > z)? bc + z : wc) : wc;
        return b * x + w * y;
    }

    public static void main(String[] args) {
        System.out.println(taumBday(3,3,1,9,2));
    }
}
