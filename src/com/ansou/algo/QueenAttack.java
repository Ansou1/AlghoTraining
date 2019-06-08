package com.ansou.algo;

public class QueenAttack {

    static int queensAttack(int size, int nbrObstacles, int rQueen, int cQueen, int[][] obstacles) {

        int rRObstacle = -1;
        int cRObstacle = -1;
        int rBRObstacle = -1;
        int cBRObstacle = -1;
        int rBObstacle = -1;
        int cBObstacle = -1;
        int rBLObstacle = -1;
        int cBLObstacle = -1;
        int rLObstacle = -1;
        int cLObstacle = -1;
        int rTLObstacle = -1;
        int cTLObstacle = -1;
        int rTObstacle = -1;
        int cTObstacle = -1;
        int rTRObstacle = -1;
        int cTRObstacle = -1;

        for (int i = 0; i < obstacles.length; i++) {
            //Right
            if ((obstacles[i][1] < cRObstacle || rRObstacle == -1) && obstacles[i][1] > cQueen && obstacles[i][0] == rQueen) {
                rRObstacle = obstacles[i][0];
                cRObstacle = obstacles[i][1];
            }

            //Bottom Right
            if (rQueen - obstacles[i][0] == obstacles[i][1] - cQueen && obstacles[i][1] > cQueen && obstacles[i][0] < rQueen
                    && ((obstacles[i][0] > rBRObstacle && obstacles[i][1] < cBRObstacle) || rBRObstacle == -1)) {
                rBRObstacle = obstacles[i][0];
                cBRObstacle = obstacles[i][1];
            }

            //Bottom
            if ((obstacles[i][0] > rBObstacle || rBObstacle == -1) && obstacles[i][0] < rQueen && obstacles[i][1] == cQueen) {
                rBObstacle = obstacles[i][0];
                cBObstacle = obstacles[i][1];
            }

            //Bottom Left
            if (rQueen - obstacles[i][0] == cQueen - obstacles[i][1] && obstacles[i][1] < cQueen && obstacles[i][0] < rQueen
                    && ((obstacles[i][0] > rBLObstacle && obstacles[i][1] > cBLObstacle) || rBLObstacle == -1)) {
                rBLObstacle = obstacles[i][0];
                cBLObstacle = obstacles[i][1];
            }

            //Left
            if ((obstacles[i][1] > cLObstacle || rLObstacle == -1) && obstacles[i][1] < cQueen && obstacles[i][0] == rQueen) {
                rLObstacle = obstacles[i][0];
                cLObstacle = obstacles[i][1];
            }

            //Top Left
            if (cQueen - obstacles[i][1] == obstacles[i][0] - rQueen && obstacles[i][1] < cQueen && obstacles[i][0] > rQueen
                    && ((obstacles[i][0] < rTLObstacle && obstacles[i][1] > cTLObstacle) || rTLObstacle == -1)) {
                rTLObstacle = obstacles[i][0];
                cTLObstacle = obstacles[i][1];
            }

            //Top
            if ((obstacles[i][0] < rTObstacle || rTObstacle == -1) && obstacles[i][0] > rQueen && obstacles[i][1] == cQueen) {
                rTObstacle = obstacles[i][0];
                cTObstacle = obstacles[i][1];
            }

            //Top Right
            if (obstacles[i][0] - rQueen == obstacles[i][1] - cQueen && obstacles[i][1] > cQueen
                    && obstacles[i][0] > rQueen && ((obstacles[i][0] < rTRObstacle && obstacles[i][1] < cTRObstacle) || rTRObstacle == -1)) {
                rTRObstacle = obstacles[i][0];
                cTRObstacle = obstacles[i][1];
            }
        }

        int result = 0;

        result += (cRObstacle != -1) ? (cRObstacle - cQueen -1) : size - cQueen;
        result += (rBObstacle != -1) ? (rQueen - rBObstacle - 1) : rQueen - 1;
        result += (cLObstacle != -1) ? (cQueen - cLObstacle -1) : cQueen - 1;
        result += (rTObstacle != -1) ? (rTObstacle - rQueen - 1) : size - rQueen;

        //BR BL TL TR
        result += (cBRObstacle != -1) ? (cBRObstacle - cQueen -1) : Math.min(size - cQueen, rQueen - 1);
        result += (rBLObstacle != -1) ? (cQueen - cBLObstacle - 1) : Math.min(cQueen - 1, rQueen - 1);
        result += (cTLObstacle != -1) ? (cQueen - cTLObstacle -1) : Math.min(cQueen - 1, size - rQueen);
        result += (rTRObstacle != -1) ? (cTRObstacle - cQueen - 1) : Math.min(size - cQueen, size - rQueen);
        return result;
    }


    public static void main(String[] args) {
        int [][] obstacles = {
                {54, 87},
                {64, 97},
                {42, 75},
                {32, 65},
                {42, 87},
                {32, 97},
                {54, 75},
                {64, 65},
                {48, 87},
                {48, 75},
                {54, 81},
                {42, 81},
                {45, 17},
                {14, 24},
                {35, 15},
                {95, 64},
                {63, 87},
                {25, 72},
                {71, 38},
                {96, 97},
                {16, 30},
                {60, 34},
                {31, 67},
                {26, 82},
                {20, 93},
                {81, 38},
                {51, 94},
                {75, 41},
                {79, 84},
                {79, 65},
                {76, 80},
                {52, 87},
                {81, 54},
                {89, 52},
                {20, 31},
                {10, 41},
                {32, 73},
                {83, 98},
                {87, 61},
                {82, 52},
                {80, 64},
                {82, 46},
                {49, 21},
                {73, 86},
                {37, 70},
                {43, 12},
                {94, 28},
                {10, 93},
                {52, 25},
                {50, 61},
                {52, 68},
                {52, 23},
                {60, 91},
                {79, 17},
                {93, 82},
                {12, 18},
                {75, 64},
                {69, 69},
                {94, 74},
                {61, 61},
                {46, 57},
                {67, 45},
                {96, 64},
                {83, 89},
                {58, 87},
                {76, 53},
                {79, 21},
                {94, 70},
                {16, 10},
                {50, 82},
                {92, 20},
                {40, 51},
                {49, 28},
                {51, 82},
                {35, 16},
                {15, 86},
                {78, 89},
                {41, 98},
                {70, 46},
                {79, 79},
                {24, 40},
                {91, 13},
                {59, 73},
                {35, 32},
                {40, 31},
                {14, 31},
                {71, 35},
                {96, 18},
                {27, 39},
                {28, 38},
                {41, 36},
                {31, 63},
                {52, 48},
                {81, 25},
                {49, 90},
                {32, 65},
                {25, 45},
                {63, 94},
                {89, 50},
                {43, 41}
        };
        System.out.println(queensAttack(100, 100, 48, 81, obstacles));
    }
}
