package com.leetcode.trees;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class BinaryTreeInorderTraversalWithoutRecursion {
    public List<Integer> inorderTraversal(TreeNode root) {
        Deque<TreeNode> stack = new LinkedList<>();
        List<Integer> result = new ArrayList<>();

        TreeNode curr = root;

        while(!stack.isEmpty() || curr!=null)
        {
            if(curr!=null)
            {
                stack.addFirst(curr);
                curr = curr.left;
            }
            else
            {
                curr= stack.removeFirst();
                result.add(curr.val);
                curr= curr.right;
            }
        }
        return result;
    }

//    public static void main(String[] args) {
//        TreeNode tr1 =  new TreeNode(1);
//        tr1.right = new TreeNode(2);
//        tr1.right.left = new TreeNode(3);
//
//        BinaryTreeInorderTraversalWithoutRecursion binaryTreeInorderTraversalWithoutRecursion = new BinaryTreeInorderTraversalWithoutRecursion();
//        List<Integer> integers = binaryTreeInorderTraversalWithoutRecursion.inorderTraversal(tr1);
//        System.out.print(integers);
//    }
}
