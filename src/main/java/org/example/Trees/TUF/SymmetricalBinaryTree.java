package org.example.Trees.TUF;

import org.example.Trees.TreeNode;

public class SymmetricalBinaryTree {
    public static void main(String[] args) {
        TreeNode node = TreeNode.getTree2();
        System.out.println("output: "+ isSymmetrical(node));
    }
    private static boolean isSymmetrical(TreeNode root){
        if(root==null)
            return true;
       return checkSymmetry(root.left,root.right);
    }

    private static boolean checkSymmetry(TreeNode leftNode,TreeNode rightNode){
        if(leftNode == null && rightNode==null)
            return true;
        if(leftNode==null || rightNode == null)
            return false;
        if(leftNode.val != rightNode.val)
            return false;
        return  checkSymmetry(leftNode.left,rightNode.right) && checkSymmetry(leftNode.right,rightNode.left);
    }
}
