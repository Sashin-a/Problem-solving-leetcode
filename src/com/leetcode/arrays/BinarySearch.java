package com.leetcode.arrays;

public class BinarySearch {
 public static int executeBinarySearch(int[] a, int start, int end, int target )
 {
	 if(end>=start)
	 {
		 int mid  = start + (end-start)/2;
		 
		 if(a[mid]==target)
		 {
			return mid; 
		 }
		 
		 if(a[mid]>target)
		 {
			 return executeBinarySearch(a, start, mid-1, target);
		 }
		 return executeBinarySearch(a, mid+1, end, target);
	 }
	 
	 
	 return -1;
 }
 
 public static void main(String[] args) {
	 int arr[] = {2,3,4,10,40};
	System.out.print(executeBinarySearch(arr, 0, arr.length-1, 10));
}
}
