package org.example.Trees;

public class P25_SumOfAllElement {
    public static int sum =0;
    public static void main(String[] args) {
        TreeNode root = TreeNode.getTree2();
        sumOfBT(root);
        System.out.println("total sum is - "+ sum);
        System.out.println("total sum is - "+ addBT(root));

    }

    private static void sumOfBT(TreeNode root) {
        if(root==null)
            return;
        sum = sum + root.val;
        sumOfBT(root.left);
        sumOfBT(root.right);

    }

    private static int addBT(TreeNode root){
        if(root ==null)
            return 0;
        return root.val + addBT(root.left) + addBT(root.right);
    }
}
