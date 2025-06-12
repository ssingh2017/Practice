package org.example.Trees;

import java.util.*;

public class TopViewOfBT {
    public static void main(String[] args) {
        TreeNode root = TreeNode.getTree2();
        System.out.println("output "+topView(root));
    }

    private static List<Integer> topView(TreeNode root){
        Queue<Pair2> queue = new LinkedList<>();
        queue.add(new Pair2<>(root,0));
        Map<Integer,Integer> nodesHdValues = new HashMap<>();
        nodesHdValues.put(0,root.val);
        List<Integer> listOfNode = new ArrayList<>();
        while(!queue.isEmpty()){
            Pair2<TreeNode,Integer> curr = queue.poll();
            TreeNode node = curr.first;
            int hd = curr.second;
            if(node.left!=null){
                queue.add(new Pair2<>(node.left,hd-1));
                if(!nodesHdValues.containsKey(hd-1)){
                    nodesHdValues.put(hd-1,node.left.val);
                }
            }
            if(node.right!=null){
                queue.add(new Pair2<>(node.right,hd+1));
                if(!nodesHdValues.containsKey(hd+1)){
                    nodesHdValues.put(hd+1,node.right.val);
                }
            }
        }
        for(Map.Entry<Integer,Integer> map : nodesHdValues.entrySet()){
            listOfNode.add(map.getValue());
        }
        return listOfNode;
    }
}
