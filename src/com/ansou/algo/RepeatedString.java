package com.ansou.algo;

public class RepeatedString {

    static long repeatedString(String s, long n) {
        long count = 0;
        for(char c : s.toCharArray())
            if(c == 'a')
                count++;
        long factor = (n / s.length());
        long rem = (n % s.length());
        count =  factor * count  ;
        for(int i = 0; i < rem; i++)
            if(s.charAt(i) == 'a')
                count++;
        return count;
    }

    public static void main(String[] args) {
        System.out.println(repeatedString("aba", 10));
    }
}
