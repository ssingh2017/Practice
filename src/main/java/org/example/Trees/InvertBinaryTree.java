package org.example.Trees;

import java.util.LinkedList;
import java.util.Queue;

public class InvertBinaryTree {

    public static void main(String[] args){

        TreeNode node = new TreeNode();
        node.left = new TreeNode(2);
        node.right = new TreeNode(3);
        node.left.left = new TreeNode(4);
        node.left.right = new TreeNode(5);
        node.right.left = new TreeNode(6);
        node.right.right = new  TreeNode(7);

        System.out.println("before inverting ");
        //TreeNode ptr = node;
        LevelOrderTraversal.levelOrderTraversal(node);
    }

    public static TreeNode invertTree(TreeNode root) {
        TreeNode node = root;
        TreeNode  newNode;

        //while
        return null;
    }
}
