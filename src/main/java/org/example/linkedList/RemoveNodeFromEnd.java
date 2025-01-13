package org.example.linkedList;

public class RemoveNodeFromEnd {
    public static void main(String[] args){
        ListNode list = new ListNode(1);
        list.next = new ListNode(2);
        list.next.next = new ListNode(3);
        list.next.next.next = new ListNode(4);
//        list.next.next.next.next = new ListNode(5);
        System.out.println("Length is "+listLength(list));
        ListNode node = removeNthFromEnd(list,2);

        while(node!=null){
            System.out.print(node.val+" ");
            node = node.next;
        }

    }

    public  static ListNode removeNthFromEnd(ListNode head, int n) {
        int length = listLength(head);
        int removeNode = length -n + 1;
        ListNode ptr = head;
        ListNode prev = head;
        System.out.println("remove node "+removeNode);// removeNode = 5;
        if(removeNode ==1){
            prev = head;
            head = head.next;
            prev.next = null;
            return head;
        }
        while(removeNode>1){
            prev = ptr;
            ptr = ptr.next;
            removeNode --;
        }
        System.out.println("removing node "+ptr.val);

        prev.next = ptr.next;
        ptr.next = null;

        return head;
    }

    public static int listLength(ListNode head){
        int length =0;
        while(head!=null){
            length++;
            head = head.next;
        }
        return length;
    }
}
