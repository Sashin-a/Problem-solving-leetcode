package com.leetcode.arrays;

import java.util.HashMap;
import java.util.Map;

public class LongestPalindromPossible {
    class Solution {
        public int longestPalindrome(String s) {
            int count=0;
            Map<Character, Integer> map = new HashMap<>(s.length());
            for(Character c : s.toCharArray())
            {
                map.put(c, map.getOrDefault(c, 0)+1);
            }

            boolean hasSingleChar = false;
            // System.out.println(map);

            for (Map.Entry<Character, Integer> entry : map.entrySet()) {
                if(entry.getValue()>=2)
                {
                    int floor = (int) Math.floor(entry.getValue()/2);
                    int evenCounts= (floor)*2;
                    count+=evenCounts;
                    map.put(entry.getKey(), entry.getValue()-evenCounts);
                }

                if( !hasSingleChar && entry.getValue()%2!=0)
                {
                    hasSingleChar=true;
                    ++count;
                }
            }
            return count;
        }
    }
}
