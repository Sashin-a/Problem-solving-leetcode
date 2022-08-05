package com.leetcode.trees;

public class SymmetricTree {
    public boolean isSymmetric(TreeNode root) {
        if(root==null || checkSymmetric(root.left, root.right)) {
            return true;
        }
        return false;
    }

    private boolean checkSymmetric(TreeNode leftNode, TreeNode rightNode)
    {
        if(leftNode==null && rightNode==null)
        {
            return true;
        }
        else if(leftNode!=null && rightNode!=null)
        {

            return leftNode.val==rightNode.val && checkSymmetric(leftNode.left, rightNode.right) && checkSymmetric(leftNode.right, rightNode.left);


        }
        return false;
    }
}
