package org.example.Trees;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class P9_ReverseLevelOrderTraversal {
    public static void main(String [] args){
        TreeNode node = TreeNode.getTree();
        reverseLevelOrderTraversal(node);
    }

    private static void reverseLevelOrderTraversal(TreeNode node){
        Queue<TreeNode> queue = new LinkedList<>();
        Stack<Integer> st = new Stack<>();
        queue.add(node);

        while(!queue.isEmpty()){
            node = queue.poll();
            st.add(node.val);
            if(node.right!=null)
                queue.add(node.right);
            if(node.left!=null)
                queue.add(node.left);
        }
        while(!st.isEmpty()){
            System.out.print(st.pop()+" ");
        }
    }

}
