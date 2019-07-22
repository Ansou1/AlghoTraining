package com.ansou.algo;

public class FirstMissingPositive {

    public static int firstMissingPositive(int[] nums) {

        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                nums[index++] = nums[i];
            }
        }

        System.out.println("index => " + index);

        for (int i = 0; i < index; ++i) {
            int value = Math.abs(nums[i]) - 1;
            if (value < index)
                nums[value] = -Math.abs(nums[value]);
        }

        for (int i = 0; i < index; i++) {
            if (nums[i] > 0) {
                return i + 1;
            }
        }

        return index + 1;
    }

    public static void main(String[] args) {
        System.out.println(firstMissingPositive(new int[] {1, 2, 0})); // 3
        System.out.println(firstMissingPositive(new int[] {3, 4, -1, 1})); // 2
        System.out.println(firstMissingPositive(new int[] {7, 8, 9, 11, 12})); // 1
    }
}
