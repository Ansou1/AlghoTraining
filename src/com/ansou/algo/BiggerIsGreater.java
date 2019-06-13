package com.ansou.algo;

public class BiggerIsGreater {

    public static boolean nextPermutation(int[] array) {
        // Find non-increasing suffix
        int i = array.length - 1;
        while (i > 0 && array[i - 1] >= array[i])
            i--;
        if (i <= 0)
            return false;

        // Find successor to pivot
        int j = array.length - 1;
        while (array[j] <= array[i - 1])
            j--;
        int temp = array[i - 1];
        array[i - 1] = array[j];
        array[j] = temp;

        // Reverse suffix
        j = array.length - 1;
        while (i < j) {
            temp = array[i];
            array[i] = array[j];
            array[j] = temp;
            i++;
            j--;
        }
        return true;
    }

    static String biggerIsGreater(String w) {

    }

    public static void main(String[] args) {

        String[] test = {
                "lmno",
                "dcba",
                "dcbb",
                "abdc",
                "abcd",
                "fedcbabcd"
        };

        for (String item : test) {
            biggerIsGreater(item);
        }
    }
}
