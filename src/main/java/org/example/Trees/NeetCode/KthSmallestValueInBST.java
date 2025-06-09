package org.example.Trees.NeetCode;

import org.example.Trees.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class KthSmallestValueInBST {
    public static void main(String[] args) {
        TreeNode node = TreeNode.getTree2();


        System.out.println("node values "+kthSmallest(node,3));
    }

    private static int kthSmallest(TreeNode root,int k){
        List<Integer> nodeListValue = new ArrayList<>();
        storeInList(root,nodeListValue);
        //System.out.println(nodeListValue);
        return nodeListValue.get(k-1);
    }

    private static void storeInList(TreeNode node, List<Integer> nodeValueList){
        if(node==null)
            return;
       storeInList(node.left,nodeValueList);
       nodeValueList.add(node.val);
       storeInList(node.right,nodeValueList);
    }
}
