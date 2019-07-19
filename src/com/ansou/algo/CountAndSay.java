package com.ansou.algo;

public class CountAndSay {

    public static String countAndSay(int n) {

        StringBuilder result = new StringBuilder("1");

        for (int i = 2; i <= n; i++) {
            StringBuilder tmp = new StringBuilder();
            int count = 1;
            char prev = result.charAt(0);
            for (int j = 1; j < result.length(); j++) {
                char ch = result.charAt(j);
                if(prev != ch){
                    tmp.append(count);
                    tmp.append(prev);
                    count = 1;
                    prev = ch;
                }
                else{
                    count++;
                }
            }
            tmp.append(count);
            tmp.append(prev);
            result = tmp;
        }

        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(countAndSay(1)); // 1
        System.out.println(countAndSay(4)); // 1211
    }

}
