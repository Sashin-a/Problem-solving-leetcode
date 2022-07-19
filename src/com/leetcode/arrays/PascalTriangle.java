package com.leetcode.arrays;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();

        if(numRows==0)
        {
            return result;
        }

        for(int i=0; i<numRows; i++ )
        {
            List<Integer> lList = new ArrayList(i);
            for(int j=0; j<=i; j++)
            {
                int num=0;
                if(j==0 || j==i)
                {
                    num=1;
                }
                else if(j<i)
                {
                    num = result.get(i-1).get(j-1) + result.get(i-1).get(j);
                }
                lList.add(num);
            }
            result.add(lList);
        }

        return result;
    }
}
