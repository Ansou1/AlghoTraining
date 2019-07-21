package com.ansou.algo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSumII {

    public static List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        if (candidates.length == 0) {
            return res;
        }
        int n = candidates.length;
        Arrays.sort(candidates);
        boolean[] visited = new boolean[n];
        helper(0, new ArrayList<>(), candidates, target, res, visited);
        return res;
    }

    private static void helper(int index, List<Integer> list, int[] candidates, int target, List<List<Integer>> res, boolean[] visited) {
        if (target == 0) {
            res.add(new ArrayList<>(list));
            return;
        }
        if (index == candidates.length) {
            return;
        }
        for (int i = index; i < candidates.length; i++) {
            if (i != index && !visited[i - 1] && candidates[i] == candidates[i - 1]) {
                continue;
            }
            if (target < candidates[i]) {
                break;
            }
            visited[i] = true;
            list.add(candidates[i]);
            helper(i + 1, list, candidates, target - candidates[i], res, visited);
            visited[i] = false;
            list.remove(list.size() - 1);
        }
    }

    public static void main(String[] args) {

        List<List<Integer>> result = combinationSum2(new int[]{10,1,2,7,6,1,5}, 8);

        for (List<Integer> list : result) {
            for (Integer item : list) {
                System.out.print(item);
            }
            System.out.println();
        }
    }
}
