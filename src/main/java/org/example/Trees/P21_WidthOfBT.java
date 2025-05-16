package org.example.Trees;

// Width of BT - maximum number of node at a level.

import java.util.LinkedList;
import java.util.Queue;

public class P21_WidthOfBT {
    public static void main(String[] args) {
        TreeNode root = TreeNode.getTree();
        System.out.println("Width of tree is - "+widthOfBt(root));
    }

    // Will use level order traversal.
    private static int widthOfBt(TreeNode root) {
        if(root==null)
            return 0;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int max =0;
        while(!queue.isEmpty()) {
            int length = queue.size();
            for (int i = 0; i < length; i++) {
                TreeNode ptr = queue.poll();
                if (ptr.left != null)
                    queue.add(ptr.left);
                if (ptr.right != null)
                    queue.add(ptr.right);
            }
            if(length>max)
                max=length;
        }
        return max;
    }
}
