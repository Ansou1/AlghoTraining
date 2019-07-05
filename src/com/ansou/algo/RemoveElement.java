package com.ansou.algo;

public class RemoveElement {

    public static int removeElement(int[] nums, int val) {
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            int currentValue = nums[i];
            if (currentValue != val) {
                nums[count] = currentValue;
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] nums = {3,2,2,3};

        System.out.println(removeElement(nums, 2));
    }
}
