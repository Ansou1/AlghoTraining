package com.ansou.algo;

public class RemoveDuplicatesFromSortedArray {

    public static int removeDuplicates(int[] nums) {
        int count = 0;
        int value = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {
            int currentValue = nums[i];
            if (value < currentValue) {
                nums[count] = currentValue;
                value = currentValue;
                count++;
            }
        }

        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();

        return count;
    }

    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        System.out.println(removeDuplicates(nums));
    }
}
