package com.ansou.algo;

public class FindFirstLastPositionElementSortedArray {

    public static int[] searchRange(int[] nums, int target) {
        return helper(nums, target, 0, nums.length - 1);
    }

    private static int[] helper(int[] nums, int target, int left, int right) {
        if (left == right) {
            return nums[left] == target ? new int[] {left, right} : new int[] {-1, -1};
        }

        if (left > right) {
            return new int[] {-1, -1};
        }

        int mid = (left + right) / 2;
        if (nums[mid] == target) {
            int[] leftRange = helper(nums, target, left, mid - 1);
            int[] rightRange = helper(nums, target, mid + 1, right);
            int start = leftRange[0] == -1 ? mid : leftRange[0];
            int end = rightRange[1] == -1 ? mid : rightRange[1];
            return new int[] {start, end};
        } else if (nums[mid] < target) {
            // search right side
            return helper(nums, target, mid + 1, right);
        } else {
            // search left side
            return helper(nums, target, left, mid - 1);
        }
    }

    public static void main(String[] args) {
        int[] nums = {5, 6, 7, 9, 9, 9};

        int[] result = searchRange(nums, 9);

        for (int elem : result) {
            System.out.println(elem);
        }
    }
}
