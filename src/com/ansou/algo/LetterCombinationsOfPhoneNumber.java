package com.ansou.algo;

import java.util.*;

public class LetterCombinationsOfPhoneNumber {

    /*
    static String[] chars = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

    public static List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<String>();
        if(digits == null || digits.length() == 0) return result;
        backtracking(result, new StringBuilder(), digits, 0);
        return result;
    }

    public static void backtracking(List<String> result, StringBuilder sb, String digits, int index) {
        if(index == digits.length()) {
            result.add(sb.toString());
            return;
        }

        String str = chars[digits.charAt(index) - '0'];
        for(char c : str.toCharArray()) {
            sb.append(c);
            backtracking(result, sb, digits, index + 1);
            sb.setLength(sb.length() - 1);
        }
    }


    private static final Map<Character, String> mapping = new HashMap<>();
    static {
        mapping.put('2', "abc"); mapping.put('3', "def");
        mapping.put('4', "ghi"); mapping.put('5', "jkl");
        mapping.put('6', "mno"); mapping.put('7', "pqrs");
        mapping.put('8', "tuv"); mapping.put('9', "wxyz");
    }

    public static List<String> letterCombinations(String digits) {
        if (digits.isEmpty()) return Arrays.asList("");
        List<String> res = new LinkedList<>();
        char[] buf = new char[digits.length()];
        for (int k = 0; k < buf.length; k++)
            buf[k] = mapping.get(digits.charAt(k)).charAt(0);
        int[] idx = new int[digits.length()];
        int i = 0;
        while (i < digits.length()) {
            res.add(new String(buf));
            i = 0;
            while (i < digits.length()) {
                idx[i] = (idx[i] + 1) % mapping.get(digits.charAt(i)).length();
                buf[i] = mapping.get(digits.charAt(i)).charAt(idx[i]);
                if (idx[i] != 0)
                    break;
                i++;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(letterCombinations("234"));
    }*/



    public static List<String> letterCombinations(String number)
    {
        String[] table = { "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };
        List<String> list = new ArrayList<>();
        if(number == null || number.length() == 0) return list;
        Queue<String> q = new LinkedList<>();
        q.add("");

        while(!q.isEmpty())
        {
            String s = q.remove();
            if (s.length() == number.length())
                list.add(s);
            else
            {
                //String val = table[number[s.length()]];
                String val = table[number.charAt(s.length()) - '0'];
                for (int i = 0; i < val.length(); i++)
                {
                    q.add(s + val.charAt(i));
                }
            }
        }
        return list;
    }

    public static void main(String[] args) {
        System.out.println(letterCombinations("234"));
        System.out.println(letterCombinations(""));
    }
}
