package com.leetcode.arrays;

import java.util.ArrayList;
import java.util.List;

class SpiralNonSquareMatrix {

    // Function to print in spiral order
    public static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ans = new ArrayList<Integer>();

        if (matrix.length == 0)
            return ans;

        int m = matrix.length, n = matrix[0].length;
        boolean[][] seen = new boolean[m][n];
        int[] dr = { 0, 1, 0, -1 };
        int[] dc = { 1, 0, -1, 0 };
        int x = 0, y = 0, di = 0;

        // Iterate from 0 to R * C - 1
        for (int i = 0; i < m * n; i++) {
            ans.add(matrix[x][y]);
            seen[x][y] = true;
            int cr = x + dr[di];
            int cc = y + dc[di];

            if (0 <= cr && cr < m && 0 <= cc && cc < n
                    && !seen[cr][cc]) {
                x = cr;
                y = cc;
            } else {
                di = (di + 1) % 4;
                x += dr[di];
                y += dc[di];
            }
        }
        return ans;
    }

    // Driver Code
    public static void main(String[] args) {
        int a[][] = { { 1, 2, 3, 4,15 },
                { 5, 6, 7, 8,16 },
                { 9, 10, 11, 12, 17 }};

        System.out.println(spiralOrder(a));
    }
}