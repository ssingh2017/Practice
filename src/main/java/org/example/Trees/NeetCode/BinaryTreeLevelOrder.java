package org.example.Trees.NeetCode;

import org.example.Trees.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeLevelOrder {
    public static void main(String[] args) {
        //TreeNode root = TreeNode.getTree();
        TreeNode root = null;
        System.out.println("result "+levelOrder(root));
    }

    private static List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        TreeNode ptr = root;
        if(root ==null )
            return result;
        else
            queue.add(root);
        queue.add(null);
        while(!queue.isEmpty()){
            ptr = queue.poll();
            // System.out.println("ptr value "+ptr.val);
            if(ptr!=null && ptr.left!=null)
                queue.add(ptr.left);
            if(ptr!=null && ptr.right!=null)
                queue.add(ptr.right);

            if(ptr==null ){
                if(!queue.isEmpty())
                    queue.add(null);

                    result.add(list);
                    list = new ArrayList<>();
            }else{
                list.add(ptr.val);
            }
        }
        return result;
    }

}
