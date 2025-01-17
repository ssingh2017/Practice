package org.example.Trees;

import java.util.LinkedList;
import java.util.Queue;

public class P4_SearchInBT {
    public static void main(String[] args){
        TreeNode node = new TreeNode(1);
        node.left = new TreeNode(9);
        node.right = new TreeNode(2);
        node.left.left = new TreeNode(8);
        node.left.right = new TreeNode(6);
        node.right.left = new TreeNode(29);
        node.right.right = new  TreeNode(17);

        System.out.println("1.value is present "+ searchInBTRecursion(7,node));
        System.out.println("2.value is present "+ searchInBTLevelOrder(9,node));
    }

    private static boolean searchInBTRecursion(int x, TreeNode node){
        if(node!=null) {
            if(x == node.val)
                return true;
            return searchInBTRecursion(x, node.left) || searchInBTRecursion(x, node.right);
        }
        return false;
    }

    private static boolean searchInBTLevelOrder(int x , TreeNode node){
        Queue<TreeNode> queue  = new LinkedList<>();
        queue.add(node);
        TreeNode ptr;
        while(!queue.isEmpty()){
            ptr = queue.poll();
            if(ptr.val==x)
                return true;
            if(ptr!=null) {
                if (ptr.left != null)
                    queue.add(ptr.left);
                if (ptr.right != null)
                    queue.add(ptr.right);
            }
        }

        return false;

    }
}
