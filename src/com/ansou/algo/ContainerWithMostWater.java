package com.ansou.algo;

public class ContainerWithMostWater {

    public static int maxArea(int[] height) {
        int maxWater=0, left=0, right=height.length-1;
        while(left<right) {
            maxWater = Math.max(maxWater,(right-left)*Math.min(height[left], height[right]));
            if(height[left]<height[right]) left++;
            else right--;
        }
        return maxWater;
    }

    public static void main(String[] args) {
        int[] arr= {1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(arr));
    }

}
