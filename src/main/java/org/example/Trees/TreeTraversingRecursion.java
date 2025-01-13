package org.example.Trees;

public class TreeTraversingRecursion {
    public static void main(String [] args){
        TreeNode node = new TreeNode(1);
        node.left = new TreeNode(2);
        node.right = new TreeNode(3);
        node.left.left = new TreeNode(4);
        node.left.right = new TreeNode(5);
        node.right.left = new TreeNode(6);
        node.right.right = new  TreeNode(7);

        preOrderTraversing(node);
            System.out.println();
        postOrderTraversing(node);
            System.out.println();
        inOrderTraversing(node);

    }

    public static void preOrderTraversing(TreeNode node){
        if(node!=null){
            System.out.print(node.val+" ");
            preOrderTraversing(node.left);
            preOrderTraversing(node.right);
        }
    }

    public static void postOrderTraversing(TreeNode node){
        if(node!=null){
            postOrderTraversing(node.left);
            postOrderTraversing(node.right);
            System.out.print(node.val +" ");
        }
    }

    public static void inOrderTraversing(TreeNode node){

        if(node!=null){
            inOrderTraversing(node.left);
            System.out.print(node.val+" ");
            inOrderTraversing(node.right);
        }
    }

}
