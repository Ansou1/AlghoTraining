package com.ansou.algo;

public class AppendAndDelete {

    static String appendAndDelete(String s, String t, int k) {
        int i;

        for (i = 0; i < s.length() && i < t.length(); i++) {
            if (s.charAt(i) != t.charAt(i))
                break;
        }

        int indexS = s.length() - i;
        int indexT = t.length() - i;

        int valueToAppendDelete = k - indexS - indexT;

        if (valueToAppendDelete == 0)
            return "Yes";
        else if (valueToAppendDelete < 0)
            return "No";
        else {
            if(valueToAppendDelete % 2 == 0)
                return "Yes";
            else
            {
                if(valueToAppendDelete >= (2 * i))
                    return "Yes";
                else
                    return "No";
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(appendAndDelete("aba", "aba", 7));
    }
}
