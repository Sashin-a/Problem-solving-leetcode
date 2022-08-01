package com.leetcode.string;

import java.util.Arrays;

public class IsomorphicStrings {
    public boolean isIsomorphic(String s, String t) {
        int[] dictToStoreS = new int[256];
        Arrays.fill(dictToStoreS, -1);

        int[] dictToStoreT = new int[256];
        Arrays.fill(dictToStoreT, -1);

        if(s.length()!=t.length())
        {
            return false;
        }

        for(int i=0; i<s.length(); i++)
        {
            char cS = s.charAt(i);
            char cT = t.charAt(i);

            if(dictToStoreS[cS] == -1 && dictToStoreT[cT]==-1){

                dictToStoreS[cS] = cT;
                dictToStoreT[cT] = cS;

            }

            else if(!(dictToStoreS[cS]==cT && dictToStoreT[cT]==cS))
            {
                return false;
            }
        }

        return true;

    }
}
