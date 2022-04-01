package com.leetcode.arrays;

public class FindFirstBadVersion {
    public int firstBadVersion(int n) {
        return findFirstBadVersion(n, 1, n);
     }
     
     private int findFirstBadVersion(int version, int start, int end)
     { 
         int ans =-1;
         if(start<=end)
         {
             int mid = start + (end-start)/2;
             if(isBadVersion(version))
             {
                 ans= version;
                 return findFirstBadVersion(version, start, mid-1);
             }
           
             return findFirstBadVersion(version, mid+1, end);
         }
         return ans;
     }
 }
}
