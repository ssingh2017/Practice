package org.example.Trees;

import java.util.LinkedList;
import java.util.Queue;

public class P5_InsertIntoBT {
    public static void main(String [] args){
        TreeNode node = new TreeNode(1);
        node.left = new TreeNode(9);
        node.right = new TreeNode(2);
        node.left.left = new TreeNode(8);
        node.left.right = new TreeNode(6);
        node.right.left = new TreeNode(29);
        node.right.right = new  TreeNode(17);

        TreeNode ptr = insertIntoBT(4,node);
        TreeTraversingIterative.preOrderTraversal(ptr);

    }

    private static TreeNode insertIntoBT(int value, TreeNode root) {
        TreeNode node = root;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(node);
        if(root ==null){
            root = new TreeNode(value);
            return root;
        }
        while(!queue.isEmpty()){
            node = queue.poll();
            if(node!=null){
                if(node.left!=null)
                    queue.add(node.left);
                if(node.right!=null)
                    queue.add(node.right);
                if(node.left==null) {
                    node.left = new TreeNode(value);
                    return root;
                }
                if(node.right==null) {
                    node.right = new TreeNode(value);
                    return root;
                }
            }
        }
        return root;
    }
}
