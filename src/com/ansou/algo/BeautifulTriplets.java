package com.ansou.algo;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class BeautifulTriplets {

    static int beautifulTriplets(int d, int[] data) {
        Integer[] arr = Arrays.stream(data).boxed().toArray(Integer[]::new);
        Set<Integer> myList = new HashSet<>(Arrays.asList(arr));
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (myList.contains(data[i] + d) && myList.contains(data[i] + (2 * d))) {
                count++;
            }
        }
        return count;
    }


    public static void main(String[] args) {
        int[] arr = {1, 6, 7, 7, 8, 10, 12, 13, 14, 19};
        System.out.println(beautifulTriplets(3, arr));

        int[] arr2 = {1, 6, 7, 8, 10, 12, 13, 14, 19};
        System.out.println(beautifulTriplets(3, arr2));
    }
}
