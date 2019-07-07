package com.ansou.algo;

public class DivideTwoIntegers {

    /*
    public static int divide(int dividend, int divisor) {
        if(dividend == Integer.MIN_VALUE && divisor == -1)
            return Integer.MAX_VALUE;

        int sign = (dividend < 0) ^ (divisor < 0) ? -1 : 1;
        int result = 0;
        long x = Math.abs((long)dividend);
        long y = Math.abs((long)divisor);

        while(x >= y)
        {
            x -= y;
            result++;
        }
        return result * sign;
    }
    */

    public static int divide(int dividend, int divisor) {
        if(dividend == Integer.MIN_VALUE && divisor == -1){
            return Integer.MAX_VALUE;
        }
        int a = Math.abs(dividend);
        int b = Math.abs(divisor);
        int res = 0;
        while(a - b >= 0){

            int x = 0;
            while( a - (b << 1 << x) >= 0){
                x++;
            }
            res += 1 << x;
            a -= b << x;
        }
        return (dividend >= 0) == (divisor >= 0) ? res :-res;
    }

    public static void main(String[] args) {
        System.out.println(divide(10, 3));
        System.out.println(divide(7, -3));
        System.out.println(divide(Integer.MIN_VALUE, Integer.MAX_VALUE));
        System.out.println(divide(Integer.MAX_VALUE, Integer.MIN_VALUE));
        System.out.println(divide(Integer.MAX_VALUE, Integer.MAX_VALUE));
        System.out.println(divide(Integer.MIN_VALUE, Integer.MIN_VALUE));
        System.out.println(divide(Integer.MIN_VALUE, -1));
        System.out.println(divide(Integer.MIN_VALUE, 1));
        System.out.println(divide(Integer.MAX_VALUE, 1));
        System.out.println(divide(Integer.MAX_VALUE, -1));

    }
}
