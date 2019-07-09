package com.ansou.algo;

import java.util.*;

public class SubstringWithConcatenationOfAllWords {

    public static List<Integer> findSubstring(String s, String[] words) {
        List<Integer> result = new ArrayList<>();
        if(words.length == 0)
            return result;

        Map<String, Integer> t = new HashMap<>();
        for(String word : words)
            t.put(word, t.getOrDefault(word,0) + 1);

        int k = words[0].length() * words.length;
        int inc = words[0].length();
        int n = s.length();

        for (int i = 0; i< n - k + 1; i++) {
            Map<String, Integer> copy = new HashMap<String, Integer>(t);
            int counter = copy.size();
            for (int j = i; j < i + k ; j += inc) {
                String word = s.substring(j, j + inc);
                if (copy.containsKey(word)) {
                    if (copy.get(word) == 1)
                        counter--;
                    copy.put(word, copy.get(word) - 1);
                }
            }
            if (counter == 0)
                result.add(i);
        }
        return result;
    }

    public static void main(String[] args) {
        String s = "worldgetteworld";
        String[] words = {"world", "world", "gette"};
        List<Integer> result = findSubstring(s, words);

        for (Integer item : result) {
            System.out.print(item + " ");
        }
        System.out.println();
    }
}
