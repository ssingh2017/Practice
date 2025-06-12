package org.example.Trees;

public class Pair {
    TreeNode node;
    int hd;

    public Pair(TreeNode node,int hd){
        this.node =node;
        this.hd=hd;
    }
}

// can also create custom class and use.

class Pair2<U, V> {
    public final U first;
    public final V second;

    Pair2(U first, V second) {
        this.first = first;
        this.second = second;
    }
}

