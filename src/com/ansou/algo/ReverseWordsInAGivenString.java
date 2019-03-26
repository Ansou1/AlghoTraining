package com.ansou.algo;

import java.util.Scanner;
import java.util.StringTokenizer;

public class ReverseWordsInAGivenString {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-- > 0)
        {
            String s = sc.next();
            String res = "";
            StringTokenizer st = new StringTokenizer(s,".");

            while(st.hasMoreTokens())
            {
                res = st.nextToken() + res;
                if(st.hasMoreTokens()) res = "." + res;
            }
            System.out.println(res);
        }
    }
}
