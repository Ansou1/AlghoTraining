package com.ansou.algo;

public class RepeatedString {

    static long repeatedString(String s, long n) {
        long count = 0;
        for(char c : s.toCharArray())
            if(c == 'a')
                count++;
        System.out.println(count); // 2
        long factor = (n / s.length());
        System.out.println(factor); // 10/3 = 3
        long rem = (n % s.length());
        System.out.println(rem); // 10%3 = 1
        count =  factor * count  ;
        System.out.println(count); // 3*2 = 6
        for(int i = 0; i < rem; i++)
            if(s.charAt(i) == 'a')
                count++;
        return count;
    }

    public static void main(String[] args) {
        System.out.println(repeatedString("aba", 10));
    }
}
