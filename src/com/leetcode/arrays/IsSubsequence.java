package com.leetcode.arrays;

public class IsSubsequence {
    public boolean isSubsequence(String s, String t) {
        if(s.length()==0)
            return true;

        if(s.length()> t.length()) return false;

        int subsequence=0;

        for(int i=0; i<t.length(); i++)
        {
            if(subsequence+1<= s.length() && subsequence<=t.length())
            {
                if(s.charAt(subsequence)==t.charAt(i))
                {
                    subsequence+=1;
                }
            }
        }
        return subsequence==s.length();
    }

}
