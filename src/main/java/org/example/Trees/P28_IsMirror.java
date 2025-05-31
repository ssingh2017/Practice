package org.example.Trees;

public class P28_IsMirror {
    public static void main(String[] args) {
        TreeNode root1 = TreeNode.getTree2();
        TreeNode root2 = TreeNode.getTree3();
        System.out.println("is mirror image "+isMirror(root1,root2));
    }
// TODO : Looked into solution , output is not correct.
    public static boolean isMirror(TreeNode root1,TreeNode root2){
        if(root1 ==null && root2==null)
            return true;
        if(root1 == null || root2 == null)
            return false;
        if(root1.val != root2.val)
            return false;
        else return (isMirror(root1.left,root2.right) && isMirror(root1.right,root2.left));
    }
// TODO : Try the iterative approach

}
