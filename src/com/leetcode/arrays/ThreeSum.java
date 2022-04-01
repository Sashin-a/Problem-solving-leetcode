package com.leetcode.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
	 public List<List<Integer>> threeSum(int[] nums) {
	        int sum = 0;
	        Arrays.sort(nums);
	        List<List<Integer>> list = new ArrayList<>();
	        
	        for(int i=0;i<nums.length;i++)
	        {
	        int p = i+1, q= nums.length-1;
	        
	        while(p<q)
	        {
	            if(nums[p]+nums[q]==-nums[i])
	            {
	                List<Integer> list1 = new ArrayList<Integer>();
	                list1.add(nums[p]);
	                list1.add(nums[q]);
	                list1.add(nums[i]);
	                list.add(list1);
	                
	                while(p+1<q && nums[p+1]==nums[p]) p++;
	                while(q-1> p && nums[q-1]==nums[q]) q--;
	            
	                p++; q--;
	            }
	            
	             else if(nums[p]+nums[q] < -nums[i]) p++;
	            else q--;  
	        }
	             while(i+1<nums.length && nums[i+1]==nums[i]) i++;
	        }
	        
	       return list;
	    } 
}
