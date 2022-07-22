package com.leetcode.arrays;

import java.util.ArrayList;
import java.util.List;

public class Spiraling2dMatrix {
    public List<Integer> spiralOrder(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int size= (int) Math.ceil( 0.5* (n+1));

        List<Integer> list = new ArrayList<>(m*n);
        // int offset=0;
        for(int offset=0; offset < size; offset++)
        {
            spiralMatrix(list, offset, matrix);
        }

        // System.out.println(matrix.length);

        return list;
    }

    private void spiralMatrix(List<Integer> list, Integer offset, int[][] matrix)
    {
        if(offset==matrix.length-offset-1)
        {
            list.add(matrix[offset][offset]);
            return;
        }

        for(int j = offset; j< matrix.length-offset-1;++j)
        {
            list.add(matrix[offset][j]);
        }
        for(int i = offset; i< matrix.length-offset-1;++i)
        {
            list.add(matrix[i][matrix.length-offset-1]);
        }

        for(int j = matrix.length - offset -1; j>offset; --j)
        {
            list.add(matrix[matrix.length - offset -1][j]);
        }

        for(int j = matrix.length - offset -1; j>offset; --j)
        {
            list.add(matrix[j][offset]);
        }
    }

//    public static void main(String[] args) {
//        Spiraling2dMatrix spiraling2dMatrix = new Spiraling2dMatrix();
//        int[][] matrix = {{1,2,3,4}, {5,6, 7, 8}, {9, 10, 11, 12}};
//
//        System.out.print(spiraling2dMatrix.spiralOrder(matrix));
//    }
}
