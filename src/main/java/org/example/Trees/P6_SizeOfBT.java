package org.example.Trees;


import java.util.LinkedList;
import java.util.Queue;

// Size of left + right subtree + 1 = total no. of nodes.
public class P6_SizeOfBT {
    public static void main(String []  args){
        TreeNode node = TreeNode.getTree();
        LevelOrderTraversal.levelOrderTraversal(node);

        System.out.println("\n1.Size of tree "+ sizeOfBTWithRecursion(node));
        System.out.println("2.Size of tree "+ sizeOfBTWithLevelOrder(node));
    }

    public static int sizeOfBTWithRecursion(TreeNode node){
        if(node!=null){
            if(node.right==null && node.left==null)
                return 1;
            return sizeOfBTWithRecursion(node.left) + sizeOfBTWithRecursion(node.right)+1;
        }else
            return 0;
    }

    // without recursion
    public static int sizeOfBTWithLevelOrder(TreeNode node){
        if(node==null)
            return 0;
        int size = 0;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(node);
        while(!queue.isEmpty()){
            node = queue.poll();
            size++;
            if(node.left!=null)
                queue.add(node.left);
            if(node.right!=null)
                queue.add(node.right);
        }
        return size;
    }

}
