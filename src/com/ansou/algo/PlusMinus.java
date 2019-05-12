package com.ansou.algo;

public class PlusMinus {

    static void plusMinus(int[] arr, int n) {
        int[] result = {0, 0, 0}; // Sup to 0, Inf to 0, Equal to 0

        for (int i = 0; i < n; i++) {
            if (arr[i] > 0)
                result[0] += 1;
            else if (arr[i] < 0)
                result[1] += 1;
            else
                result[2] += 1;
        }

        System.out.printf("%.6f\n", (float)result[0] / n);
        System.out.printf("%.6f\n", (float)result[1] / n);
        System.out.printf("%.6f\n", (float)result[2] / n);

    }

    public static void main(String[] args) {
        int[] arr = {1, 1, 0, -1, -1};
        plusMinus(arr, 5);
    }

}
