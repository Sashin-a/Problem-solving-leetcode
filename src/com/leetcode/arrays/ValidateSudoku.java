package com.leetcode.arrays;

import java.util.HashMap;
import java.util.Map;

public class ValidateSudoku {
    public boolean isValidSudoku(char[][] board) {
        //validate rows

        for (int i = 0; i < 9; i++) {

            if (!isValid(i, i + 1, 0, 9, board)) {
                return false;
            }
        }
        //validate columns
        for (int j = 0; j < 9; j++) {
            if (!isValid(0, 9, j, j + 1, board)) {
                return false;
            }
        }
        //validate sub-grids
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (!isValid(3 * i, 3 * (i + 1), 3 * j, 3 * (j + 1), board)) {
                    return false;
                }
            }
        }
        return true;

    }

    public boolean isValid(int rowS, int rowE, int colS, int colE, char[][] board) {
        Map<Character, Integer> map = new HashMap<>();

        for (int i = rowS; i < rowE; ++i) {
            for (int j = colS; j < colE; ++j) {
                if (board[i][j] != '.') {
                    if (map.containsKey(board[i][j])) {
                        return false;
                    }

                    map.put(board[i][j], 1);
                }
            }
        }
        return true;
    }
}
