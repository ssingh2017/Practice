package org.example.Trees.NeetCode;

import org.example.Trees.TreeNode;

public class SameBT {
    public static void main(String[] args) {
        TreeNode root = TreeNode.getTree();
        TreeNode root2 = TreeNode.getSkewTree();
        System.out.println("is tree identical "+ isSameTree(root,root2));
    }

    private static boolean isSameTree(TreeNode p, TreeNode q) {
        if(p==null && q==null)
            return true;
        if(p==null || q==null || p.val!=q.val)
            return false;

        return isSameTree(p.left,q.left) && isSameTree(p.right,q.right);
    }
}
