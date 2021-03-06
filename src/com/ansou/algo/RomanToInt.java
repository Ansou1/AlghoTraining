package com.ansou.algo;

import java.util.HashMap;
import java.util.Map;

public class RomanToInt {

    public static int romanToInt(String s) {
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int ret = map.get(s.charAt(s.length()-1));
        for (int i=0; i<s.length()-1; i++) {
            if(map.get(s.charAt(i)) < map.get(s.charAt(i+1)))
                ret -= map.get(s.charAt(i));
            else
                ret += map.get(s.charAt(i));
        }
        return ret;
    }

    public static void main(String[] args) {
        System.out.println(romanToInt("LVIII")); //58
        System.out.println(romanToInt("III")); //3
        System.out.println(romanToInt("IV")); //4
        System.out.println(romanToInt("V")); //5
        System.out.println(romanToInt("IX")); //9
        System.out.println(romanToInt("MCMXCIV")); //1994
    }
}
