package org.example.Trees.NeetCode;

import org.example.Trees.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class ValidateBinarySearchTree {
    public static void main(String[] args) {
        TreeNode node = TreeNode.getTree2();
        System.out.println("output: "+isValidBST(node));
    }
    private static boolean isValidBST(TreeNode root){
        boolean isValid = true;
        List<Integer> nodeList = new ArrayList<>();
        storeInList(root,nodeList);
        for(int i=1;i<nodeList.size();i++){
            if(nodeList.get(i-1)>nodeList.get(i))
                isValid = false;
        }
        return isValid;
    }

    private static void storeInList(TreeNode node, List<Integer> nodeValueList){
        if(node==null)
            return;
        storeInList(node.left,nodeValueList);
        nodeValueList.add(node.val);
        storeInList(node.right,nodeValueList);
    }
}
