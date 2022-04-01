package com.leetcode.arrays;

import java.util.HashMap;
import java.util.Map;

class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        
        // target=9
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        
        // 
        for(int i=0; i<nums.length; i++){
        if(map.containsKey(nums[i]))
        {
          return new int[] {map.get(nums[i]), i}   ;
        }
//         7 {7, 0}
        map.put(target-nums[i], i);
            
        }
        return null;
    }
}