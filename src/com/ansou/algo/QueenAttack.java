package com.ansou.algo;

public class QueenAttack {

    static int queensAttack(int size, int nbrObstacles, int rowQueen, int columnQueen, int[][] obstacles) {

        int columNorth = -1;
        int rowTopNorth = -1;

        int columNorthEast = -1;
        int rowNorthEast = -1;

        int columNorthWest = -1;
        int rowNorthWest = -1;

        int columEast = -1;
        int rowEast = -1;

        int columWest = -1;
        int rowWest = -1;

        int columSouthEast = -1;
        int rowSouthEast = -1;

        int columSouth = -1;
        int rowSouth = -1;

        int columSouthWest = -1;
        int rowSouthWest = -1;


    }

    public static void main(String[] args) {
        int [][] obstacles = {{5, 5},{4, 2},{2, 3}};
        System.out.println(queensAttack(5, 3, 4, 3, obstacles));
    }
}
