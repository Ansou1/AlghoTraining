package com.ansou.algo;

public class BirthdayCakeCandles {

    static int birthdayCakeCandles(int[] arr, int n) {
        int tallest = 0;
        int frequency = 0;


        for(int i=0; i < n; i++){
            if(arr[i] > tallest){
                tallest = arr[i];
                frequency = 1;
            }
            else if(arr[i] == tallest)
                frequency++;
        }
        return frequency;
    }

    public static void main(String[] args) {
        int[] arr = {3,2,1,3};
        System.out.println(birthdayCakeCandles(arr, 4));
    }
}
