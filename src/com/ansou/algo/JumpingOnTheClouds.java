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

    static int jumpingOnClouds(int[] c) {
        int count = 0;
        int i = 0;

        while(i < c.length - 1) {
            if (i < c.length - 2 && c[i + 2] == 0) {
                i++;
            }
            if(i != c.length - 1) {
                count++;
            }
            i++;
        }
        return count;
    }

    public static void main(String[] args) {
        int[] c = {0,0,1,0,0,1,1,0};
        System.out.println(jumpingOnClouds(c, 2));

        int[] d = {0, 0, 1, 0, 0, 1, 0};
        System.out.println(jumpingOnClouds(d));
    }
}
