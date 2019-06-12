package com.ansou.algo;

import java.util.Arrays;

public class OrganizingContainersOfBalls {

    static String organizingContainers(int[][] container) {
        int[] a = new int[container.length];
        int[] b = new int[container.length];

        for(int i = 0; i < container.length; i++)
        {
            for(int j = 0; j < container.length; j++)
            {
                int x = container[i][j];
                a[i] += x;
                b[j] += x;
            }
        }
        Arrays.sort(a);
        Arrays.sort(b);
        return Arrays.equals(a, b) ? "Possible" : "Impossible";
    }

    public static void main(String[] args) {
        int[][] container = {
                {0,2},
                {1,1}
        };
        System.out.println(organizingContainers(container));
    }
}
