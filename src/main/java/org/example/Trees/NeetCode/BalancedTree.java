package org.example.Trees.NeetCode;

import org.example.Trees.TreeNode;

import java.util.HashMap;
import java.util.Map;

public class BalancedTree {
    static boolean isBalanced = false;
    public static void main(String[] args) {
        TreeNode node = TreeNode.getSkewTree();
        System.out.println("output "+isBalancedBT(node));
        System.out.println("output --  "+isBalancedBTUsingDFS(node));
    }

    public static int heightOfTree(TreeNode node){
        if(node!=null){
            if(node.left == null  && node.right==null)
                return 1;
            return Math.max(heightOfTree(node.left),heightOfTree(node.right))+1;
        }else
            return 0;
    }

    // calculating the height of tree at each node.
    public static boolean isBalancedBT(TreeNode root){
        TreeNode node = root;

        if(root!=null){
            int left = heightOfTree(root.left);
            int right = heightOfTree(root.right);
            if (Math.abs(left-right)>=2)
                return false;
        }else if(root==null)
            return true;

        while(node!=null && node.left!=null){
            node = node.left;
            int left = heightOfTree(node.left);
            int right = heightOfTree(node.right);
            if (Math.abs(left-right)>=2)
                return false;
        }
        node = root;

        while(node!=null && node.right!=null){
            node = node.right;
            int left = heightOfTree(node.left);
            int right = heightOfTree(node.right);
            if (Math.abs(left-right)>=2)
                return false;
        }
        return true;

    }

    public static boolean isBalancedBTUsingDFS(TreeNode root){
        return dfs(root)>=0;
    }

    private static int dfs(TreeNode root) {
        if(root==null) {
            return 0;
        }
        int leftHeight = dfs(root.left);
        int rightHeight = dfs(root.right);
        if(leftHeight ==-1 || rightHeight ==-1 || Math.abs(leftHeight-rightHeight)>1)
            return -1;
        return Math.max(leftHeight,rightHeight)+1;
    }
}
