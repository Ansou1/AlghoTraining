package com.ansou.algo;

import java.util.Stack;

public class SudokuSolver {

    public static void solveSudoku(char[][] board) {
        Stack<Integer> empty = new Stack<>();
        for(int i = 0; i <= 8; i++) {
            for(int j = 0; j <= 8; j++) {
                if(board[i][j] == '.') {
                    empty.push(9 * i + j);
                }
            }
        }
        solve(board, empty);

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j]);
            }
            System.out.println();
        }
    }

    private static boolean solve(char[][] board, Stack<Integer> empty) {
        if(empty.size() == 0)
            return true;
        int firstValue = empty.peek();
        int row = firstValue / 9;
        int col = firstValue % 9;
        for(int k = 1; k <= 9; k++) {
            if(isSafe(board, row, col, (char)(k + '0'))) {
                board[row][col] = (char)(k + '0');
                empty.pop();
                if(solve(board, empty))
                    return true;
                board[row][col] = '.';
                empty.push(firstValue);
            }
        }
        return false;
    }

    private static boolean isSafe(char[][] board, int i, int j, char ch) {
        for(int k = 0; k < 9; k++) {
            if(board[k][j] == ch)
                return false;
            if(board[i][k] == ch)
                return false;
        }
        int starti = 3 * (i/3), startj = 3 * (j / 3);
        for(int k = starti; k < starti + 3; k++) {
            for(int l = startj; l < startj + 3; l++) {
                if(board[k][l] == ch)
                    return false;
            }
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

        solveSudoku(board);
    }
}
