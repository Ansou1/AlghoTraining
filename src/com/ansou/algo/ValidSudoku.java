package com.ansou.algo;

public class ValidSudoku {

    private static boolean[] curr;
    private static int[][][] subs = new int[3][3][9];

    public static boolean isValidSudoku(char[][] board) {
        for (int x = 0; x < 9; x++) {
            curr = new boolean[9];
            for (int y = 0; y < 9; y++) {
                char c = board[x][y];
                if (!validateCurr(x, y, c)) return false;
            }
        }

        for (int y = 0; y < 9; y++) {
            curr = new boolean[9];
            for (int x = 0; x < 9; x++) {
                char c = board[x][y];
                if (!validateCurr(x, y, c)) return false;
            }
        }

        return true;
    }

    public static boolean validateCurr(int x, int y, char c) {
        if (c >= '1' && c <= '9') {
            int num = Character.getNumericValue(c) - 1;
            if (curr[num]) return false;
            else curr[num] = true;

            if (subs[x / 3][y / 3][num] > 2) return false;
            else subs[x / 3][y / 3][num]++;
        }
        return true;
    }

    public static void main(String[] args) {

        char[][] board = {
                {'5', '3', '.', '.', '7', '.', '.', '.', '.'},
                {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
                {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
                {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
                {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
                {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
                {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
                {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
                {'.', '.', '.', '.', '8', '.', '.', '7', '9'}
        };

        System.out.println(isValidSudoku(board));
    }

}
