package org.example.Trees;

import java.util.LinkedList;
import java.util.Queue;

public class P22_MaxSumAtLevel {
    public static void main(String[] args){
        TreeNode node = TreeNode.getTree();
        System.out.println("Max sum is "+maxSum(node));
    }

    public static int maxSum(TreeNode node){
        if(node == null)
            return 0;
        Queue<TreeNode> queue = new LinkedList<>();
        int sum;
        int maxSum = node.val;
        queue.add(node);
        queue.add(null);
        sum = 0;
        while(!queue.isEmpty()) {
            node = queue.poll();
            if (node != null) {
                if (node.left != null) {
                    queue.add(node.left);
                    sum = sum + node.left.val;
                }
                if (node.right != null) {
                    queue.add(node.right);
                    sum = sum + node.right.val;
                }
            } else {
                if (!queue.isEmpty()) {
                    if (sum > maxSum)
                        maxSum = sum;
                    sum = 0;
                    queue.add(null);
                }

            }
        }
        return maxSum;
    }
}
