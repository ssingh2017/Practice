package org.example.linkedList;

public class ReorderLinkedList {
    public static void main(String[] args){
        ListNode list = new ListNode(1);
//        list.next = new ListNode(2);
//        list.next.next = new ListNode(3);
//        list.next.next.next = new ListNode(4);
        //list.next.next.next.next = new ListNode(5);
        reorderList(list);
       // ListNode node = getMiddleNode(list);
      // System.out.println("middle node value is "+node.val);
    }
    public static void reorderList(ListNode head) {
        ListNode ptr = head;
        ListNode middlePtr = getMiddleNode(head);
        while(ptr!=middlePtr){
            ListNode prev =middlePtr;
            ListNode lastNode = middlePtr;
            while (lastNode.next != null) {
                prev = lastNode;
                lastNode = lastNode.next;
            }
            // check for lastNode and prevNode value.
           // System.out.println("prevNode "+prev.val+" LastNode "+lastNode.val);
            lastNode.next = ptr.next;
            ptr.next = lastNode;
           // System.out.println("ptr value "+ptr.val);
            ptr = ptr.next.next;
            prev.next = null;
        }
       // System.out.println("printing reordered list");
        while(head!=null){
            System.out.print(head.val+" ");
            head = head.next;
        }

    }

    public static ListNode getMiddleNode(ListNode head){
        ListNode ptr=head, middlePtr = head;
        int length = 0;
        while(ptr!=null){
            ptr = ptr.next;
            length++;
        }
       // System.out.println("length is "+length/2);
        int half = length%2==0 ? length/2 -1 : length/2;

        while(half>0){
            middlePtr = middlePtr.next;
            half--;
        }
        return middlePtr;
    }
}
