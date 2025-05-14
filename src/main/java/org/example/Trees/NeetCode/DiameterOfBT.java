package org.example.Trees.NeetCode;

import org.example.Trees.TreeNode;


public class DiameterOfBT {
    static int diameter =0;
    public static void main(String[] args) {
        TreeNode node = TreeNode.getLeftTree();
        System.out.println("diameter of BT - "+ diameterOfBT(node));

    }

    private static int diameterOfBT(TreeNode node) {
        //int res[] = new int[1];
        dfs(node);
        return diameter;
    }

    private static int dfs(TreeNode node) {
        if(node==null)
            return 0;
        int left = dfs(node.left);
        int right = dfs(node.right);
        diameter = Math.max(left+right,diameter);
        return 1+Math.max(left,right);
    }
}
