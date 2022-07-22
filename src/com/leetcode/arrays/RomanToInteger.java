package com.leetcode.arrays;

import java.util.Map;

public class RomanToInteger {
    private static final Map<Character, Integer> map=    Map.of(
            'I', 1,
            'V', 5,
            'X', 10,
            'L', 50,
            'C', 100,
            'D', 500,
            'M', 1000);

    public int romanToInt(String s) {
        char[] cArr = s.toCharArray();
        int size = cArr.length;
        int sum= map.get(cArr[size-1]);

        for(int i=size-2; i>=0; i--)
        {
            if(map.get(cArr[i]) >= map.get(cArr[i+1]))
            {
                sum+=map.get(cArr[i]);
            }
            else
            {
                sum-=map.get(cArr[i]);
            }
        }
        return sum;
    }
}
