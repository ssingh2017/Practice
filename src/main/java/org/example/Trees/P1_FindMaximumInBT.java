package org.example.Trees;

import java.util.Stack;

public class P1_FindMaximumInBT {
    public static void main(String [] args){
        TreeNode node = new TreeNode(1);
        node.left = new TreeNode(9);
        node.right = new TreeNode(2);
        node.left.left = new TreeNode(8);
        node.left.right = new TreeNode(6);
        node.right.left = new TreeNode(29);
        node.right.right = new  TreeNode(17);

        System.out.println("1.maximum value is " + findMaxUsingPreOrderTraversal(node));
        System.out.println("2.maximum value is " + findMaxUsingInOrderTraversal(node));
    }

    private static int findMaxUsingRecursion(TreeNode node) {
        //if(node.val>)
        findMaxUsingRecursion(node.left);

        return 0;
    }

    private static int findMaxUsingPreOrderTraversal(TreeNode node){
        Stack<TreeNode> st = new Stack<>();
        st.add(node);
        TreeNode ptr;
        int max = node.val;
        while(!st.isEmpty()){
            ptr = st.pop();
            if(ptr.right!=null) {
                st.add(ptr.right);
                max = Math.max(max, ptr.right.val);
            }
            if(ptr.left!=null) {
                st.add(ptr.left);
                max = Math.max(max,ptr.left.val);
            }
        }
        return max;
    }


    private static int findMaxUsingInOrderTraversal(TreeNode node){
        Stack<TreeNode> st = new Stack<>();
        TreeNode ptr = node;
        int max = node.val;
        boolean isDone = false;
        while(!isDone){

            if(ptr!=null){
                st.add(ptr);
                ptr = ptr.left;
            }else{
                if(st.isEmpty())
                    isDone = true;
                else {
                    ptr =st.pop();
                    max = Math.max(max, ptr.val);
                    ptr = ptr.right;
                }
            }

        }
        return max;
    }
}
