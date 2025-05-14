package org.example.Trees;

public class P20_DiameterOfBT {
    public static void main(String[] args){
        TreeNode node = TreeNode.getLeftTree();
        System.out.println("diameter of tree "+diameterOfBT(node));
    }

    // incorrect solution
    public static int diameterOfBT(TreeNode node) {
        if (node == null)
            return 0;
        return Math.max(diameterOfBT(node.left),diameterOfBT(node.right))+1;
    }
}
