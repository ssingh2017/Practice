package org.example.Trees;

import java.util.*;

public class VerticalTraversal {
    public static void main(String[] args) {
        TreeNode root = TreeNode.getTree2();
        System.out.println( "output : "+verticalTraversing(root));
    }
    private static List<List<Integer>> verticalTraversing(TreeNode root){
        if(root ==null)
            return null;
        Queue<Pair> queue = new LinkedList<>();
        List<List<Integer>> listOfList = new ArrayList<>();
        queue.add(new Pair(root,0));
        Map<Integer,List<Integer>> nodeList = new TreeMap<>();
        nodeList.put(0, new ArrayList<>(root.val));
        while(!queue.isEmpty()){
            int hd = queue.peek().hd;
            TreeNode node = queue.poll().node;
            if(node.left!=null){
                //int hd = queue.poll().hd-1;
                queue.add(new Pair(node.left,hd-1));
                addToMap(nodeList, hd-1, node.left);

            }
            if(node.right!=null){
                //int hd = queue.poll().hd+1;
                queue.add(new Pair(node.right,hd+1));
                addToMap(nodeList,hd+1,node.right);
            }
        }
        System.out.println("map "+nodeList);
        for(Map.Entry<Integer,List<Integer>> map : nodeList.entrySet()){
            listOfList.add(map.getValue());
        }

        return listOfList;
    }

    private static void addToMap(Map<Integer, List<Integer>> nodeList, int hd, TreeNode node) {
        List<Integer> list =  nodeList.get(hd);
        if(list==null) {
            list = new ArrayList<>();
        }
        list.add(node.val);
        nodeList.put(hd,list);
    }
}

