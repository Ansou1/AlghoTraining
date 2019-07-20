package com.ansou.algo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSum {

    public static List<List<Integer>> result = new ArrayList<>();


    private static void helper(List<Integer> sub, int[] candidates, int target, int start) {
        if (target == 0) {
            result.add(new ArrayList<Integer>(sub));
        } else {
            for (int i = start; i < candidates.length && target >= candidates[i]; i++) {
                //choose
                sub.add(0, candidates[i]);
                //explore
                helper(sub, candidates, target - candidates[i], i);
                //unchoose
                sub.remove(0);
            }
        }
    }

    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        Arrays.sort(candidates);
        helper(new ArrayList<Integer>(), candidates, target, 0);
        return result;
    }

    public static void main(String[] args) {

        List<List<Integer>> result = combinationSum(new int[]{2, 3, 5}, 8);

        for (List<Integer> list : result) {
            for (Integer item : list) {
                System.out.print(item);
            }
            System.out.println();
        }
    }

}
