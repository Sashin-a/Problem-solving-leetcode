package com.leetcode.arrays;

public class Rotate2DArray {
    public void rotate(int[][] matrix) {
        // Reverse each row in a for-loop...
        for (int row = 0; row < matrix.length/2; row++) {
            int[] rotate = matrix[row];
            matrix[row] = matrix[matrix.length - row - 1];
            matrix[matrix.length - row - 1] = rotate;
        }
        // Visit each row...
        for (int row = 0; row < matrix.length - 1; row++) {
            for (int col = row+1; col < matrix.length; col++) {

                //Initialize col as row + 1.
                // Swap each pair of symmetric elements...
                int rotate = matrix[row][col];
                matrix[row][col] = matrix[col][row];
                matrix[col][row] = rotate;
            }
        }
    }
}
