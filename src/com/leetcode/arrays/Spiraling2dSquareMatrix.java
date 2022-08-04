package com.leetcode.arrays;

import java.util.ArrayList;
import java.util.List;

public class Spiraling2dSquareMatrix {
    public List<Integer> spiralOrder(int[][] matrix) {
        int m = matrix.length; //3
        int n = matrix[0].length; //4
        int size= (int) Math.ceil( 0.5* (n+1));

        List<Integer> list = new ArrayList<>(m*n);
        // int offset=0;
        for(int offset=0; offset < size; offset++)
        {
            spiralMatrix(list, offset, matrix);
        }

        return list;
    }

    private void spiralMatrix(List<Integer> list, Integer offset, int[][] matrix)
    {
        for(int j = offset; j< matrix[0].length-offset-1;++j)
        {
            list.add(matrix[offset][j]);
        }
        for(int i = offset; i< matrix.length-offset-1;++i)
        {
            list.add(matrix[i][matrix[0].length-offset-1]);
        }

        for(int j = matrix[0].length - offset -1; j>offset; --j)
        {
            list.add(matrix[matrix.length - offset -1][j]);
        }

        for(int j = matrix.length - offset -1; j>offset; --j)
        {
            list.add(matrix[j][offset]);
        }
    }

    public static void main(String[] args) {
        Spiraling2dSquareMatrix spiraling2dMatrix = new Spiraling2dSquareMatrix();
        int[][] matrix = {{1,2,3,4}, {5,6, 7, 8}, {9, 10, 11, 12}};

        System.out.print(spiraling2dMatrix.spiralOrder(matrix));
    }
}
