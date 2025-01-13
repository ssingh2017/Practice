package org.example.Trees;

import java.util.LinkedList;
import java.util.Queue;

public class PrintLevelOrderTraversal {
    public static void main(String [] args){
           Tree tree = new Tree(1);
           tree.left = new Tree(2);
           tree.right = new Tree(3);
           tree.left.left = new Tree(4);
           tree.left.right = new Tree(5);
           tree.right.left = new Tree(6);
           tree.right.right = new  Tree(7);

        Queue<Tree> queue = new LinkedList<>();
        queue.add(tree);


        while(!queue.isEmpty()) {
           // queue.add(null);
            Tree node = queue.poll();
            //if(node!=null)
            System.out.print(node.val+" ");

                if (node.left != null) {
                    queue.add(node.left);
                }
                if (node.right != null) {
                    queue.add(node.right);
                }
        }
    }
}
