package com.ansou.algo;

public class BiggerIsGreater {

    static String nextPermutation(int[] array) {
        // Find non-increasing suffix
        int i = array.length - 1;
        while (i > 0 && array[i - 1] >= array[i])
            i--;
        if (i <= 0)
            return "no answer";

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
        String result = "";
        for (int item : array)
            result += (char)item;
        return result;
    }

    static String biggerIsGreater(String w) {
        char[] charArray = w.toCharArray();
        int[] array = new int[w.length()];

        for (int i = 0; i < charArray.length; i++) {
            array[i] = charArray[i];
        }
        return nextPermutation(array);
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
            System.out.println(biggerIsGreater(item));
        }
    }
}
