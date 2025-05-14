package org.example.Trees.NeetCode;

import org.example.Trees.LevelOrderTraversal;
import org.example.Trees.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class invertBT {
    public static void main(String[] args) {
        TreeNode node = TreeNode.getTree();
        LevelOrderTraversal.levelOrderTraversal(node);
        System.out.println();
       TreeNode root = invertTree(node);

       LevelOrderTraversal.levelOrderTraversal(root);
    }

    public static TreeNode invertTree(TreeNode root){
        if(root!=null){
            invertTree(root.left);
            invertTree(root.right);
            TreeNode tmp = new TreeNode();
            tmp = root.left;
            root.left= root.right;
            root.right = tmp;
        }
        return root;
    }


}
