package org.example.Trees.NeetCode;

import org.example.Trees.TreeNode;

public class CountGoodNodes {
    public static void main(String[] args) {
        TreeNode root = TreeNode.getTree2();
        TreeNode node =root;
        int max = node.val;
        int res=0;
        System.out.println("Good nodes count:"+getGoodNodeCount(node,max,0));

    }

    private static int getGoodNodeCount(TreeNode node,int max,int count){
     if(node==null)
         return 0;
     if(node.val>=max) {
         max = node.val;
         count=1;
     }
    int leftCount = getGoodNodeCount(node.left,max,count);
    int rightCount = getGoodNodeCount(node.right,max,count);

    return leftCount+rightCount+1;
    }
}
