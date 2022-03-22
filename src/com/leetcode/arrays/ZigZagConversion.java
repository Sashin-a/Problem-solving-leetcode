package com.leetcode.arrays;

import java.util.Arrays;

public class ZigZagConversion {

	public static void main(String[] args) {
		String s = "PAYPALISHIRING";
		System.out.println(convert(s, 3));
	}
	
	 public static String convert(String str, int n) {
	        
	      if (n == 1)
	        {
	            return str;
	        }
	         char[] str1 = str.toCharArray();
	 
	        int len = str.length();
	        
	         String[] arr = new String[n];
	        Arrays.fill(arr, "");
	        
	        int row = 0;
	        boolean down = true; 
	        
	         for (int i = 0; i < len; ++i)
	        {
	          
	            arr[row] += (str1[i]);
	 
	            if (row == n - 1)
	            {
	                down = false;
	            }
	             
	            
	            else if (row == 0)
	            {
	                down = true;
	            }
	 
	          
	            if (down)
	            {
	                row++;
	            }
	            else
	            {
	                row--;
	            }
	        }
	 
	       StringBuilder sb = new StringBuilder("");
	        for (int i = 0; i < n; ++i)
	        {
	            sb.append(arr[i]);
	        }
	        return sb.toString();
	    }
}
