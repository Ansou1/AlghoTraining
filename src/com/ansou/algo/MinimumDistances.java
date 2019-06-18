package com.ansou.algo;

import java.util.HashMap;
import java.util.Map;

public class MinimumDistances {

    static int minimumDistances(int[] a) {
        Map<Integer, Integer> map=new HashMap<Integer,Integer>();
        int smallest = a.length + 1;
        for (int k = 0; k < a.length; k++) {
            Integer j = map.get(a[k]);
            if (j != null) {
                int diff = k - j;
                if (diff == 1) {
                    return 1;
                }
                if (diff < smallest) {
                    smallest = diff;
                }
            }
            map.put(a[k], k);
        }
        if (smallest > a.length) {
            smallest = -1;
        }
        return smallest;
    }

    public static void main(String[] args) {
        int[] a = {7, 1, 3, 4, 1, 7};
        System.out.println(minimumDistances(a));
    }
}
