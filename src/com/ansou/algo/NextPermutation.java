package com.ansou.algo;

import java.util.Arrays;

public class NextPermutation {

    public static void nextPermutation(int[] nums) {
        int n = nums.length;
        if(n == 1)
            return;

        for(int i = n - 1; i >= 0; i--)
        {
            int x = nums[i];
            if(i == n - 1 || x >= nums[i + 1])
                continue;
            for(int k = i + 1; k < n; k++)
            {
                if(nums[k] > x && (k == n - 1 || nums[k + 1] <= x))
                {
                    int y = nums[k];
                    nums[k] = x;
                    nums[i] = y;
                    break;
                }
            }
            Arrays.sort(nums, i + 1, n);
            return;
        }
        Arrays.sort(nums);
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        nextPermutation(nums);

        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
    }
}
