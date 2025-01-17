package org.example.Trees;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class P13_MinimumDepthOfBT {
    public static void main(String args[]){
        TreeNode node = TreeNode.getTree2();
        System.out.println("Minimum depth is "+ minimumDepthOfBTWithRecursion(node));
    }

    public static int minimumDepthOfBTWithRecursion(TreeNode node){
        if(node!=null){
            if(node.left==null && node.right==null)
                return 1;
            return Math.min(minimumDepthOfBTWithRecursion(node.left), minimumDepthOfBTWithRecursion(node.right))+1;
        }else
            return 0;

    }

    public static int minimumDepthOfBT(TreeNode node){
        Stack<TreeNode> st = new Stack<>();
        boolean isDone = false;
        while(!isDone){
            if(node!=null){
                st.add(node);
                node = node.left;
            }else{
                if(!st.isEmpty())
                    isDone =true;
                else{
                    node = st.pop();
                    node = node.right;
                }
            }
        }
        return 0;
    }
}
