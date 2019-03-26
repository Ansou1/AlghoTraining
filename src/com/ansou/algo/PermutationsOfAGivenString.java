package com.ansou.algo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class PermutationsOfAGivenString {

    static ArrayList<String> result = new ArrayList<>();

    static void permut(String str, int l, int r) {

        if (l == r) {
            //System.out.print(str+" ");
            result.add(str);
        } else {
            for (int i = l; i <= r; i++) {
                str = swap(str, l, i);
                permut(str, l + 1, r);
                str = swap(str, l, i);
            }
        }
    }

    static String swap(String str, int i, int j) {
        char[] ch = str.toCharArray();
        char temp;
        temp = ch[i];
        ch[i] = ch[j];
        ch[j] = temp;
        return ch.toString().valueOf(ch);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        while (i-- > 0) {

            String exp = sc.next();

            int r = exp.length() - 1;
            permut(exp, 0, r);
            Collections.sort(result);
            for (String k : result)
                System.out.print(k + " ");
            result.clear();
            System.out.println();
        }

    }
}
