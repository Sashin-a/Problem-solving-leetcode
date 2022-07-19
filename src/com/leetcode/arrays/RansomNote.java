package com.leetcode.arrays;

import java.util.HashMap;
import java.util.Map;

public class RansomNote {

        public boolean canConstruct(String ransomNote, String magazine) {
            boolean flag = true;
            HashMap<Character, Integer> map = new HashMap<>();
            for(int i=0; i < ransomNote.length(); i++)
            {
                Character c = ransomNote.charAt(i);
                map.put(c, map.getOrDefault(c, 0)+1);
            }

            HashMap<Character, Integer> magazineMap = new HashMap<>();
            for(int i=0; i < magazine.length(); i++)
            {
                Character c = magazine.charAt(i);
                magazineMap.put(c, magazineMap.getOrDefault(c, 0)+1);
            }


            for (Map.Entry<Character, Integer> entry : map.entrySet()) {

                if(entry.getValue()<= magazineMap.getOrDefault(entry.getKey(), 0))
                {
                    continue;
                }
                else
                {
                    flag = false;
                }
            }
            return flag;

        }
    }
