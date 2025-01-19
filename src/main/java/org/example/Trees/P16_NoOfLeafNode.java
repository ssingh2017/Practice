package org.example.Trees;

import java.util.LinkedList;
import java.util.Queue;

public class P16_NoOfLeafNode {
    public static void main(String [] args){
        TreeNode node = TreeNode.getTree();
        System.out.println("No of leafs "+leafNodeCount(node));
    }

    public static int leafNodeCount(TreeNode node){
        int count =0;
        if(node==null)
            return count;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(node);
        while (!queue.isEmpty()){
            node = queue.poll();
            if(node.left!=null)
                queue.add(node.left);
            if(node.right!=null)
                queue.add(node.right);
            if(node.left ==null && node.right==null)
                count++;
        }
        return count;

    }
}
