package org.example.Trees;

public class P27_MirrorOfBT {
    public static void main(String[] args) {
        TreeNode root = TreeNode.getTree2();
        preOrder(root);
        mirrorOfBT(root);
        System.out.println();
        preOrder(root);
    }

    private static void preOrder(TreeNode root){
        if(root ==null)
            return;
        System.out.print(root.val+" ");
        preOrder(root.left);
        preOrder(root.right);
    }

    private static TreeNode mirrorOfBT(TreeNode root){
        if(root ==null)
            return null;
        else{
            TreeNode tmp  = root.left;
            root.left = root.right;
            root.right = tmp;
        }
        mirrorOfBT(root.left);
        mirrorOfBT(root.right);
        return root;
    }
}
