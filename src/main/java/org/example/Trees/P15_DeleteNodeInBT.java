package org.example.Trees;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class P15_DeleteNodeInBT {
    public static void main(String [] args){
        TreeNode node = TreeNode.getTree2();
        System.out.println("last node is "+deepestNode(node).val);
        LevelOrderTraversal.levelOrderTraversal(deleteNode(2,node));
        //System.out.println("after deleting "+deleteNode(2,node));
    }


    public static TreeNode deepestNode(TreeNode node){
        TreeNode lastNode =null;
        TreeNode parentNode = node;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(node);
        while(!queue.isEmpty()){
            node = queue.poll();
            parentNode = node;
            lastNode = node;
            if(node.left!=null) {
                queue.add(node.left);
            }
            if(node.right!=null) {
                queue.add(node.right);
            }

        }
        System.out.println("parent Node "+parentNode.val);
        if(parentNode.right!=null)
            parentNode.right=null;
        else
            parentNode.left = null;

        return lastNode;
    }

    public static TreeNode deleteNode(int x, TreeNode root){
        TreeNode node = root;
        Stack<TreeNode> st = new Stack<>();
        //st.add(node);
        boolean isDone = false;
        while(!isDone){
            if(node!=null){
                st.add(node);
                if(node.val == x){
                    TreeNode lastNode = deepestNode(root);
                    node.val = lastNode.val;
                    lastNode =null;
                }
                node = node.left;
            }else {
                if(st.isEmpty())
                    isDone = true;
                else {
                    node = st.pop();
                    node = node.right;
                }
            }
        }
        return root;
    }
}
