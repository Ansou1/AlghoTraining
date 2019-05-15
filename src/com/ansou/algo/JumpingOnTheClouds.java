package com.ansou.algo;

public class JumpingOnTheClouds {

    static int jumpingOnClouds(int[] c, int k) {
        int energie = 100;
        int position = 0;

        do {
            position = (position + k) % c.length;
            if (c[position] == 1)
                energie -=2;
            energie--;
        } while (position != 0);
        return energie;
    }

    public static void main(String[] args) {
        int[] c = {0,0,1,0,0,1,1,0};
        System.out.println(jumpingOnClouds(c, 2));
    }
}
