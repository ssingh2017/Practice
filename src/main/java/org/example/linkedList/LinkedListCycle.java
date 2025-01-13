package org.example.linkedList;

public class LinkedListCycle {
    public static void main(String[] args){

        ListNode list = new ListNode(2);
        list.next = new ListNode(5);
        list.next.next = new ListNode(4);
        list.next.next.next = new ListNode(8);
         list.next.next.next.next = list;

        System.out.println("Output "+hasCycle(list));
    }

    public static boolean hasCycle(ListNode head) {
        ListNode ptr = head;
        ListNode nextPtr = head.next;
        while(ptr != nextPtr){
            if(ptr.next == null || nextPtr.next==null)
                return false;
            ptr = ptr.next;
            nextPtr = nextPtr.next.next;

        }
        return true;
    }
}
