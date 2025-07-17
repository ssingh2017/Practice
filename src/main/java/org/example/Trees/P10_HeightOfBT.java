package org.example.Trees;

import java.util.LinkedList;
import java.util.Queue;

public class P10_HeightOfBT {
    public static void main(String args[]){
        TreeNode node = TreeNode.getTree();
        TreeNode skewNode  = TreeNode.getSkewTree();
        TreeNode node2 = TreeNode.getTree2();
        System.out.println("Height of BT : "+heightOfBT(node2));
        System.out.println("Height of BT 3 : "+heightOfBT3(skewNode));
        System.out.println("Height of BT 2 : "+heightOfBT2(node2));
        System.out.println("Height of BT Using level order : "+heightOfBTUsingLevelOrder(skewNode));

    }
    public static int heightOfBT(TreeNode node){
        if(node!=null){
            if(node.left==null && node.right==null)
                return 1;
            return Math.max(heightOfBT(node.left),heightOfBT(node.right))+1;
        }else
            return -1;
    }

    public static int heightOfBT2(TreeNode node){
        if(node==null)
            return 0;
        int leftCount = heightOfBT2(node.left);
        int rightCount = heightOfBT2(node.right);
        return Math.max(leftCount,rightCount)+1;
    }

    public static int heightOfBT3(TreeNode node){
        if (node == null)
            return 0;

        // compute the height of left and right subtrees
        int lHeight = heightOfBT3(node.left);
        int rHeight = heightOfBT3(node.right);

        return Math.max(lHeight, rHeight) + 1;
    }
    // Solve using stack

    // Solving using level order traversal.
    public static int heightOfBTUsingLevelOrder(TreeNode node){
        int count = 0;
        if(node==null)
            return 0;
        count++;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(node);
        queue.add(null);
        while(!queue.isEmpty()){
            node = queue.poll();
            if(node!=null){
//                if(node.left==null && node.right==null)
//                    return count;
                if(node.left!=null)
                    queue.add(node.left);
                if (node.right!=null)
                    queue.add(node.right);
            }else{
                if(!queue.isEmpty()){
                    count++;
                    queue.add(null);
                }
            }
        }
        return count;
    }

}
