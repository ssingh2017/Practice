package org.example.Trees.NeetCode;

import org.example.Trees.TreeNode;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

// Maximum number of nodes from to leaf node.
public class MaximumDepthOfBT {
    public static void main(String[] args) {
        TreeNode node = TreeNode.getSkewTree();

        System.out.println("value = "+maximumDepth(node));
        System.out.println("value = "+maxDepth(node));
        System.out.println("value = "+maxDepth2(node));

    }

    public static int maximumDepth(TreeNode node){
        if(node!=null){
            int leftCount = maximumDepth(node.left);
            int rightCount = maximumDepth(node.right);
            return Math.max(leftCount,rightCount)+1;
        }else
            return 0;
    }

    // iterative BFS approach
    public static int maxDepth(TreeNode root){
        int depth =0;
        Queue<TreeNode> queue = new LinkedList<>();
        if(root!=null)
            queue.add(root);
            queue.add(null);
            depth++;
        while(!queue.isEmpty()){

            TreeNode ptr = queue.poll();
            if(ptr==null && !queue.isEmpty()){
                depth++;
                queue.add(null);
            }
            if(ptr!=null && ptr.left!=null) {
                queue.add(ptr.left);
            }
            if(ptr!=null && ptr.right!=null)
                queue.add(ptr.right);
        }

            return depth;

    }

    public static int maxDepth2(TreeNode node){
        int depth =0;
        Queue<TreeNode> queue = new LinkedList<>();
        if(node!=null)
            queue.add(node);
        while(!queue.isEmpty()){
            for(int i=0;i< queue.size();i++){
                node = queue.poll();
                if(node.left!=null)
                    queue.add(node.left);
                if(node.right!=null)
                    queue.add(node.right);
            }
            depth++;
        }
        return depth;
    }
}
