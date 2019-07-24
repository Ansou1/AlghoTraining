package com.ansou.algo;

public class MultiplyStrings {

    public static String multiply(String num1, String num2) {
        String n1 = new StringBuilder(num1).reverse().toString();
        String n2 = new StringBuilder(num2).reverse().toString();

        int m = n1.length();
        int n = n2.length();
        int [] res = new int[m + n];
        for (int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                res[i + j] += (n1.charAt(i) - '0') * (n2.charAt(j) - '0');
            }
        }

        int carry = 0;

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < m + n; i++){
            int sum = (res[i] + carry) % 10;
            carry = (res[i] + carry) / 10;
            sb.append((char)('0' + sum));
        }
        sb = sb.reverse();
        while (sb.length() > 1 && sb.charAt(0) == '0'){
            sb.deleteCharAt(0);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(multiply("2","3"));
        System.out.println(multiply("123","456"));
    }

}
