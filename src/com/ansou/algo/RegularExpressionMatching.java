package com.ansou.algo;

public class RegularExpressionMatching {


    /*
    **    '.' Matches any single character.
    **    '*' Matches zero or more of the preceding element.
    **
    **    The matching should cover the entire input string (not partial).
    **
    **    Note:
    **
    **        s could be empty and contains only lowercase letters a-z.
    **        p could be empty and contains only lowercase letters a-z, and characters like . or *.
    */
    public static boolean isMatch(String s, String p) {
        int m = s.length(), n = p.length();
        boolean[][] dp = new boolean[m+1][n+1];

        dp[0][0] = true;

        if(p.length() > 0 && p.charAt(0) == '*')
            return false;

        for(int j = 1; j < n + 1; j++) {
            if(p.charAt(j - 1) == '*')
                dp[0][j] = dp[0][j - 2];
        }

        for(int i = 1; i < m + 1; i++) {
            for(int j = 0; j< n + 1; j++) {
                if(j > 0 && (p.charAt(j - 1) == s.charAt(i - 1) || p.charAt(j - 1) == '.')) {
                    dp[i][j] = dp[i - 1][j - 1];
                } else if(j > 0 && p.charAt(j - 1) == '*') {
                    dp[i][j] = dp[i][j - 2];
                    if(p.charAt(j - 2) == s.charAt(i - 1) || p.charAt(j - 2) == '.') {
                        dp[i][j] |= dp[i - 1][j];
                    }
                } else {
                    dp[i][j] = false;
                }
            }
        }
        return dp[m][n];
    }

    public static void main(String[] args) {
        System.out.println(isMatch("simon", "simon")); // true
        System.out.println(isMatch("aa", "a")); // false
        System.out.println(isMatch("aa", "a*")); // true
        System.out.println(isMatch("ab", ".*")); // true
        System.out.println(isMatch("mississippi", "mis*is*p*.")); // false
    }
}
