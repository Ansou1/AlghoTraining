package com.ansou.algo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {

    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();

        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {
            if (i > 0 && nums[i] == nums[i - 1])
                continue;

            int target = -nums[i];
            int j = i + 1;
            int k = nums.length - 1;

            while (j < k) {
                if (j > i + 1 && nums[j] == nums[j - 1])
                    j++;
                else if (nums[j] + nums[k] < target)
                    j++;
                else if (nums[j] + nums[k] > target)
                    k--;
                else {
                    result.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    j++;
                    k--;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {-1, 0, 1, 2, -1, -4};
        List<List<Integer>> result = threeSum(nums);

        for (List<Integer> item : result) {
            for (int value : item) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}
