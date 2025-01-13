package org.example.linkedList;


public class ReverseLinkedList {
    public static void main(String[] args){
        ListNode node = null;
//        ListNode node = new ListNode(0);
//        node.next = new ListNode(1);
//        node.next.next = new ListNode(2);
//        node.next.next.next = new ListNode(3);
        ListNode head = node;
        while(node!=null){
            System.out.println(node.val);
            node = node.next;
        }

       ListNode reverseNode =  reverseList(head);
        while(reverseNode!=null){
            System.out.print(reverseNode.val+" ");
            reverseNode = reverseNode.next;
        }
    }

     static ListNode reverseList(ListNode head) {

        ListNode currNode = head;
        ListNode prevNode = null;
        ListNode nextNode = currNode;
       // System.out.println("head node "+ node.val);

        while(currNode!=null){
           // System.out.println("current node "+currNode.val);
            nextNode = currNode.next;
            currNode.next = prevNode;
            prevNode = currNode;
            currNode = nextNode;
        }

       //System.out.println("node "+prevNode.val);
        return prevNode;
    }

}

