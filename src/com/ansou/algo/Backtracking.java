package com.ansou.algo;

public class Backtracking {

    /*
    private void helper(StringBuilder text, StringBuilder chosen) {
        if (text.length() == 0) {
            System.out.println(chosen);
        } else {
            for (int i = 0; i < text.length(); i++) {

                //choose
                char c = text.charAt(i);
                chosen.append(c);
                text.deleteCharAt(i);

                //explore
                helper(text, chosen);

                //unchoose
                text.insert(i, c);
                chosen.deleteCharAt(chosen.length() - 1);
            }
        }
    }

    private void permute(StringBuilder value) {
        helper(value, new StringBuilder(""));
    }

    public static void main(String[] args) {
        Backtracking object = new Backtracking();
        object.permute(new StringBuilder("EUNJU"));
    }
*/


    private void helper(String text, String chosen) {
        if (text.length() == 0) {
            System.out.println(chosen);
        } else {
            for (int i = 0; i < text.length(); i++) {

                //choose
                char c = text.charAt(i);
                chosen += c;
                text = text.substring(0, i) + text.substring(i + 1);

                //explore
                helper(text, chosen);

                //unchoose
                text= text.substring(0, i) + c + text.substring(i);
                chosen = chosen.substring(0, chosen.length() - 1);
            }
        }
    }

    private void permute(String value) {
        helper(value, "");
    }

    public static void main(String[] args) {
        Backtracking object = new Backtracking();
        object.permute("EUNJU");
    }
}
