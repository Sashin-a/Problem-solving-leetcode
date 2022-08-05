package com.leetcode.trees;

public class SumOfBinaryTreeRootToLeaves {
    public int sumNumbers(TreeNode root) {
        return treeLeafSum(root, 0) ;
    }

    private int treeLeafSum(TreeNode root, int pathSum)
    {
        if(root==null)
        {
            return 0;
        }

        pathSum=pathSum*10+root.val;
        if(root.left==null && root.right==null)
        {
            return pathSum;
        }
        return treeLeafSum(root.left, pathSum) + treeLeafSum(root.right, pathSum);
    }
}
