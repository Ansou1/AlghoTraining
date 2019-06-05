package com.ansou.algo;

import java.util.HashMap;
import java.util.Map;

public class EqualizeTheArray {

    static int equalizeArray(int[] arr) {
        int max = 1;
        Map<Integer, Integer> nums = new HashMap<>();

        for (int i : arr)
            if (!nums.containsKey(i))
                nums.put(i, 1);
            else {
                nums.put(i, nums.get(i) + 1);
                if (max < nums.get(i))
                    max = nums.get(i);
            }
        return arr.length - max;
    }

    public static void main(String[] args) {
        int[] c = {3,3,2,1,3};
        System.out.println(equalizeArray(c));
    }
}
