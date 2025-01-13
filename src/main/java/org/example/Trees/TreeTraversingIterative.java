package org.example.Trees;

import java.util.Stack;

public class TreeTraversingIterative {
    public static void main(String [] args){
        TreeNode node = new TreeNode(1);
        node.left = new TreeNode(2);
        node.right = new TreeNode(3);
        node.left.left = new TreeNode(4);
        node.left.right = new TreeNode(5);
        node.right.left = new TreeNode(6);
        node.right.right = new  TreeNode(7);

        preOrderTraversal(node);
        System.out.println();
        inOrderTraversal(node);
    }

    public static void preOrderTraversal(TreeNode node){
        Stack<TreeNode> stack = new Stack<>();
        stack.add(node);
        TreeNode ptr;
        while(!stack.isEmpty()){
            ptr = stack.pop();
            System.out.print(ptr.val+" ");
            if(ptr.right!=null)
                stack.add(ptr.right);
            if(ptr.left!=null)
                stack.add(ptr.left);
        }
    }

    public static void inOrderTraversal(TreeNode node){
        Stack<TreeNode> stack = new Stack<>();
        TreeNode ptr=node;
        //stack.add(node);
        boolean done = false;
        while(!done){
            if(ptr!=null){
              stack.push(ptr);
              ptr = ptr.left;
            }else{
                if(stack.isEmpty())
                    done=true;
                else{
                    ptr = stack.pop();
                    System.out.print(ptr.val+" ");
                    ptr = ptr.right;
                }
            }
        }
    }
}
