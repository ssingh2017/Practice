package org.crackingCodeInterview.questions.LinkedList;

public class PalindromeLinkedList {
    public static void main(String[] args) {
        Node node = new Node(1);
        node.next = new Node(2);
        node.next.next = new Node(3);
        node.next.next.next = new Node(4);
        node.next.next.next.next = new Node(5);
        node.next.next.next.next.next = new Node(3 );
        node.next.next.next.next.next.next = new Node(2);
        node.next.next.next.next.next.next.next = new Node(1);

        int length = lengthOfList(node);
        System.out.println("length is  "+length);
        System.out.println("is palindrome "+checkIfPalindrome(node,length));

    }

    private static boolean checkIfPalindrome(Node node, int length) {
        int [] arr = new int[length];
        Node nextNode = node;
        int i=0;
        arr[i]=node.value;
        while(nextNode!=null && nextNode.next!=null && nextNode.next.next!=null ){
            node = node.next;
            nextNode = nextNode.next.next;
            i++;
            arr[i] = node.value;
        }
        node = length%2==0 ? node.next:node;

        while(node!=null){
            if(arr[i]== node.value)
                i--;
            else
                return false;

            node = node.next;
        }

        return true;
    }

    private static int lengthOfList(Node node) {
        int length =0;
        while(node!=null){
            node = node.next;
            length++;
        }
        return length;
    }

}
