package com.ansou.algo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class CutTheSticks {

    static int[] cutTheSticks(int[] arr) {
        List<Integer> result = new ArrayList<>();
        Arrays.sort(arr);

        result.add(arr.length);
        for(int i = 0; i < arr.length - 1; i++){
            if(arr[i] != arr[i + 1])
                result.add(arr.length - (i + 1));
        }
        return result.stream().mapToInt(Integer::intValue).toArray();
    }

    public static void main(String[] args) {
        int[] arr = {5, 4, 4, 2, 2, 8};
        int[] result = cutTheSticks(arr);

        for (int elem : result) {
            System.out.println(elem);
        }
    }
}
