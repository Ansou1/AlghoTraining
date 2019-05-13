package com.ansou.algo;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class MiniMaxSum {

    static void miniMaxSum(int[] arr) {
        List<Integer> myList = Arrays.stream(arr).boxed().collect(Collectors.toList());
        Collections.sort(myList);

        BigInteger result = new BigInteger("0");
        for (int i = 1; i < myList.size() - 1; i++) {
            result = result.add(BigInteger.valueOf(myList.get(i)));
        }
        System.out.println(result.add(BigInteger.valueOf(myList.get(0))).toString() + " " + result.add(BigInteger.valueOf(myList.get(myList.size() - 1))).toString());
    }

    public static void main(String[] args) {
        int[] arr = {1,3,5,7,9};
        miniMaxSum(arr);
    }

}
