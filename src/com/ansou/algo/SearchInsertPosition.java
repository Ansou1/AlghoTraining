package com.ansou.algo;

public class SearchInsertPosition {
    public static int searchInsert(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target)
                return i;
            else if (nums[i] > target) {
                return i - 1 >= 0 ? i : 0;
            }
        }
        return nums.length;
    }

    public static void main(String[] args) {
        System.out.println(searchInsert(new int[] {1,3,5,6}, 5)); // 2
        System.out.println(searchInsert(new int[] {1,3,5,6}, 2)); // 1
        System.out.println(searchInsert(new int[] {1,3,5,6}, 7)); // 4
        System.out.println(searchInsert(new int[] {1,3,5,6}, 0)); // 0
    }
}
