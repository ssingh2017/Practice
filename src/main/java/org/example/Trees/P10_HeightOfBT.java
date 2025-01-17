package org.example.Trees;

public class P10_HeightOfBT {
    public static void main(String args[]){
        TreeNode node = TreeNode.getTree();
        TreeNode skewNode  = TreeNode.getSkewTree();
        System.out.println("Height of BT "+heightOfBT(node));
        System.out.println("Height of BT "+heightOfBT(skewNode));

    }
    public static int heightOfBT(TreeNode node){
        if(node!=null){
            if(node.left==null && node.right==null)
                return 1;
            return Math.max(heightOfBT(node.left),heightOfBT(node.right))+1;
        }else
            return 0;
    }

    // Solve using stack

}
