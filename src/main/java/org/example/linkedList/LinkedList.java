package org.example.linkedList;


public class LinkedList {

    static class Node{
        int data;
        Node next;

        Node(int d){
            data = d;
            next = null;
        }
    }
    public static void main(String[] args){
        Node head = null;
        Node node = null;
        head = insertNode(1,head);
        head =  insertNode(2,head);
        Node currNode = head;
        while(currNode!=null){
            System.out.print(currNode.data+" ");
            currNode = currNode.next;
        }

    }

    public static Node insertNode(int data,Node head){
        Node newNode = new Node(data);

        if (head == null) {
            return newNode;
        }

        Node currNode  = head;
            while(currNode.next!=null){
                System.out.println("current node "+currNode.data);
                currNode = currNode.next;
            }
            currNode.next= newNode;

        return head;
    }

}
