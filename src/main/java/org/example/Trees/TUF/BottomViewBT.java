package org.example.Trees.TUF;


// Concept of vertical distance from root node.

import org.example.Trees.TreeNode;

import java.util.*;

public class BottomViewBT {
    public static void main(String[] args) {
        TreeNode root =  TreeNode.getTree2();

        System.out.println("output "+ bottomView(root));
    }
    private static List<Integer> bottomView(TreeNode root){
        List<Integer> output = new ArrayList<>();
        Map<Integer,Integer> lineNodeValues = new TreeMap<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        lineNodeValues.put(0,root.val);
        root.hd =0;
        while(!queue.isEmpty()){
            TreeNode node = queue.poll();
            if(node.left!=null){
                queue.add(node.left);

                int parentVerticalDistance = node.hd;
                lineNodeValues.put(parentVerticalDistance-1,node.left.val);
            }
            if (node.right!=null){
                queue.add(node.right);
                int parentVerticalDistance =node.hd;
                lineNodeValues.put(parentVerticalDistance+1,node.right.val);
            }
        }

        System.out.println(lineNodeValues);
        for(Map.Entry<Integer,Integer> map : lineNodeValues.entrySet()){
            output.add(map.getValue());
        }
        return output;
    }
}
