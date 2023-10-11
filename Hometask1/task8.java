package org.example;

import java.lang.reflect.Array;
import java.util.logging.Logger;
import java.util.Arrays;
import java.util.stream.IntStream;
import java.lang.Math;


public class Main {

    static int[] dx = {2, 2, -2, -2, 1, -1, 1, -1};
    static int[] dy = {1, -1, 1, -1, 2, 2, -2, -2,};

    public static boolean knightBoardCapture(int[][] board) {
        for (int i = 0; i <8; i++){
            for(int j = 0; j < 8; j++){
                if (board[i][j] == 1){
                    for (int k = 0; k < 8; k++){
                        if (i + dx[k] > 0 && i + dx[k] < 8 && j + dy[k] > 0 && j + dy[k] < 8){
                            if (board[i + dx[k]][j + dy[k]] == 1){
                                return false;
                            }
                        }
                    }
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(knightBoardCapture(
                new int [][]{{0, 0, 0, 1, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 1, 0, 0, 0, 1, 0, 0},
                        {0, 0, 0, 0, 1, 0, 1, 0},
                        {0, 1, 0, 0, 0, 1, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 1, 0, 0, 0, 0, 0, 1},
                        {0, 0, 0, 0, 1, 0, 0, 0}}));

        System.out.println(knightBoardCapture(
                new int [][]{{1, 0, 1, 0, 1, 0, 1, 0},
                        {0, 1, 0, 1, 0, 1, 0, 1},
                        {0, 0, 0, 0, 1, 0, 1, 0},
                        {0, 0, 1, 0, 0, 1, 0, 1},
                        {1, 0, 0, 0, 1, 0, 1, 0},
                        {0, 0, 0, 0, 0, 1, 0, 1},
                        {1, 0, 0, 0, 1, 0, 1, 0},
                        {0, 0, 0, 1, 0, 1, 0, 1}}));

        System.out.println(knightBoardCapture(
                new int [][]{{0, 0, 0, 0, 1, 0, 0, 0},
                        {0, 0, 0, 0, 0, 1, 0, 0},
                        {0, 0, 0, 1, 0, 0, 0, 0},
                        {1, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 1, 0, 0, 0},
                        {0, 0, 0, 0, 0, 1, 0, 0},
                        {0, 0, 0, 0, 0, 1, 0, 0},
                        {1, 0, 0, 0, 0, 0, 0, 0}}));

    }
}
