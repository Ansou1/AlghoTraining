package com.ansou.algo;

public class IntegerToRoman {

    public static String intToRoman(int n)
    {
        String[] roman = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        StringBuilder result = new StringBuilder();

        for(int i = 0; i < values.length; i++)
        {
            while(n >= values[i])
            {
                n -= values[i];
                result.append(roman[i]);
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(intToRoman(1));
    }
}
