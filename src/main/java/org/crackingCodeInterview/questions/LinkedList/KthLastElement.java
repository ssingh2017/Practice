package org.crackingCodeInterview.questions.LinkedList;

public class KthLastElement {
    public static void main(String[] args) {
        int kth = 5;
        Node node = new Node(2);
        node.next = new Node(8);
        node.next.next = new Node(4);
        node.next.next.next = new Node(3);
        node.next.next.next.next = new Node(1);
        node.next.next.next.next.next = new Node(3 );
        node.next.next.next.next.next.next = new Node(2);

        lastKthElement(node,kth);
    }
    public static void lastKthElement(Node node, int kth){
        Node head = node;
        int length=0;
        while(node!=null){
            node = node.next;
            length++;
        }
        System.out.println("length is "+length);
        int l = length-kth+1;
        node = head;
        while(l>1){
            node = node.next ;
            l--;
        }
        System.out.println("value "+node.value);
    }
}
