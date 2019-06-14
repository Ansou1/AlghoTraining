package com.ansou.algo;

public class ModifiedKaprekarNumbers {

    static boolean isKaprekar(int number) {
        long squared = (long)number * number;

        String str   = String.valueOf(squared);
        String left  = str.substring(0, str.length() / 2);
        String right = str.substring(str.length() / 2);
        int numL = (left.isEmpty())  ? 0 : Integer.parseInt(left);
        int numR = (right.isEmpty()) ? 0 : Integer.parseInt(right);
        if (numL + numR == number) {
            System.out.print(number + " ");
            return true;
        } else {
            return false;
        }
    }

    static void kaprekarNumbers(int p, int q) {
        boolean foundKaprekar = true;

        for (int i = p; i <= q; i++) {
            if (isKaprekar(i))
                foundKaprekar = false;
        }

        if (foundKaprekar)
            System.out.print("INVALID RANGE");
        System.out.println("");
    }

    public static void main(String[] args) {
        kaprekarNumbers(1, 100);
    }
}
