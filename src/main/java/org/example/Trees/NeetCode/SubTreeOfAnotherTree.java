package org.example.Trees.NeetCode;

import org.example.Trees.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class SubTreeOfAnotherTree {
    public static void main(String[] args) {
        TreeNode root = TreeNode.getTree2();
        TreeNode subRoot = TreeNode.subTree();
        System.out.println("output "+isSubTree(root,subRoot));
    }

    private static boolean isSubTree(TreeNode root, TreeNode subRoot) {
        if(subRoot==null)
            return true;
        if(root == null)
            return false;

        if (sameBT(root,subRoot))
            return true;

        return isSubTree(root.left,subRoot) || isSubTree(root.right,subRoot);

    }

    private static boolean sameBT(TreeNode root, TreeNode subRoot) {
        if(root == null && subRoot ==null)
            return true;
        if(root == null || subRoot ==null || root.val !=subRoot.val)
            return false;

        return sameBT(root.left,subRoot.left) && sameBT(root.right,subRoot.right);
    }
}
