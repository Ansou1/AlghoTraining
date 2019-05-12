package com.ansou.algo;

public class DiagonalDifference {

    static int diagonalDifference(int[][] arr, int n) {
        int firstDiagonal = 0;
        int secondDiagonal = 0;

        for (int i = 0, j = n - 1; i < n; i++, j--) {
            firstDiagonal += arr[i][i];
            secondDiagonal += arr[i][j];
        }
        return Math.abs(firstDiagonal - secondDiagonal);
    }

    public static void main(String[] args) {
        int [][] arr = {
                {1,2,3},
                {4,5,6},
                {9,8,9}
        };

        System.out.println(diagonalDifference(arr, 3));
    }

}
