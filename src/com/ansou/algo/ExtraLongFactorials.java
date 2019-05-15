package com.ansou.algo;

import java.math.BigInteger;

public class ExtraLongFactorials {

    static void extraLongFactorials(int n) {
        BigInteger fact = BigInteger.valueOf(1);
        for (int i = 1; i <= n; i++)
            fact = fact.multiply(BigInteger.valueOf(i));
        System.out.println(fact.toString());
    }

    public static void main(String[] args) {
        extraLongFactorials(25);
    }
}
