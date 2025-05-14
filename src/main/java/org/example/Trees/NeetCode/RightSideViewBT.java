package org.example.Trees.NeetCode;

import org.example.Trees.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class RightSideViewBT {
    public static void main(String[] args) {
        TreeNode node = TreeNode.getTree();
        //System.out.println("list is "+rightSideView(node));
        System.out.println("list is "+rightSideView2(node));

    }

    private static List<Integer> rightSideView(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        TreeNode ptr = root;
        TreeNode prevPtr = root;
        if(root!=null)
            queue.add(root);
       queue.add(null);
        while(!queue.isEmpty()){
            ptr = queue.poll();
           // System.out.println("ptr value "+ptr.val);
            if(ptr!=null && ptr.left!=null)
                queue.add(ptr.left);
            if(ptr!=null && ptr.right!=null)
                queue.add(ptr.right);

            if(ptr==null && !queue.isEmpty()){
                //ptr= queue.poll();
                queue.add(null);
            }
            if(ptr==null && prevPtr!=null)
                list.add(prevPtr.val);
            prevPtr = ptr;
        }
        return list;
    }


    private static List<Integer> rightSideView2(TreeNode root){
        List<Integer> list = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            TreeNode rightMostNode = null;
            int length = queue.size();
            for(int i=0;i<length;i++){
                TreeNode ptr = queue.poll();
                if(ptr!=null){
                    rightMostNode = ptr;
                    queue.add(ptr.left);
                    queue.add(ptr.right);
                }
            }
            if(rightMostNode!=null)
                list.add(rightMostNode.val);
        }
        return list;
    }
}
