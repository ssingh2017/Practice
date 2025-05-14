package org.crackingCodeInterview.questions.LinkedList;

public class RemoveDuplicate {
    public static void main(String[] args) {
        Node node = new Node(2);
        node.next = new Node(8);
        node.next.next = new Node(4);
        node.next.next.next = new Node(3);
        node.next.next.next.next = new Node(1);
        node.next.next.next.next.next = new Node(3 );
        node.next.next.next.next.next.next = new Node(2);


       Node list =  traversingList(node);
       //Node list = head;
       while(list!=null){
           System.out.print(list.value+" ");
           list = list.next;
       }

    }

    public static Node traversingList(Node node){
        Node head = node;
        Node head1 = node;
        Node prev = head1;
        while(head1!=null){
            Node head2 = head1.next;
            prev = head1;
            while(head2!=null){
                System.out.print("head1 = "+head1.value+" head2 = "+head2.value+"\n");
                if(head1.value == head2.value){
                    prev.next = head2.next;
                    head2.next = null;
                    head2 = prev.next;
                   // System.out.print("prev "+prev.value +" head2 - "+head2.value+"\n");
                }else {
                    prev = head2;
                    head2 = head2.next;
                }
            }
            head1 = head1.next;
        }
        return head;
    }
}
