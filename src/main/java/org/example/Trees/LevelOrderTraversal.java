package org.example.Trees;

import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderTraversal {
    public static void main(String[] args){

        TreeNode node = new TreeNode(1);
        node.left = new TreeNode(2);
        node.right = new TreeNode(3);
        node.left.left = new TreeNode(4);
        node.left.right = new TreeNode(5);
        node.left.left.right = new TreeNode(6);
        levelOrderTraversal(node);

    }

    public static void levelOrderTraversal(TreeNode head){

        TreeNode node = head;
        Queue<TreeNode>  queue  = new LinkedList<>();
        queue.add(node);
        while(!queue.isEmpty()){
            node = queue.poll();
            if(node.left !=null)
                queue.add(node.left);
            if (node.right!=null)
                queue.add(node.right);
            System.out.print(node.val+" ");
        }
    }

}
