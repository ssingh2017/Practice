package org.example.Trees;

public class TreeNode {
      public int val;
      public TreeNode left;
      public  TreeNode right;
     public TreeNode() {}
     public TreeNode(int val) { this.val = val; }
      public TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }

      public static TreeNode getTree(){
          TreeNode node = new TreeNode(1);
          node.left = new TreeNode(9);
          node.right = new TreeNode(2);
          node.left.left = new TreeNode(8);
          node.left.right = new TreeNode(6);
          node.right.left = new TreeNode(29);
          node.right.right = new  TreeNode(17);

          return node;
      }

      public static TreeNode getSkewTree(){
          TreeNode node = new TreeNode(1);
          node.left = new TreeNode(2);
         // node.right = new TreeNode(2);
//          node.left.left = new TreeNode(3);
//          node.left.left.left = new TreeNode(7);
//          node.left.left.right = new TreeNode(4);
//          node.left.left.right.right = new  TreeNode(5);

          return node;
      }

      public static TreeNode getTree2(){
          TreeNode node = new TreeNode(1);
          node.left = new TreeNode(2);
          node.right = new TreeNode(3);
          node.left.left = new TreeNode(4);
          node.left.right = new TreeNode(5);
          node.right.left = new TreeNode(7);
          return node;
      }

    public static TreeNode subTree(){
        TreeNode node = new TreeNode(2);
        node.left = new TreeNode(4);
        node.right = new TreeNode(5);
        return node;
    }

    public static TreeNode getLeftTree(){
        TreeNode node = new TreeNode(1);
        node.right = new TreeNode(2);
         node.right.left = new TreeNode(3);
        node.right.left.left = new TreeNode(4);
       node.right.right = new TreeNode(5);
        node.right.right.right = new TreeNode(6);

        return node;
    }
}
