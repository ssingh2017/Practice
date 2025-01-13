package org.example.linkedList;

public class MergeSortedLinkedList {
    public static void main(String[] args){
//        ListNode list1 = null;
        ListNode list1 = new ListNode(2);
       // list1.next = new ListNode(5);
//        list1.next.next = new ListNode(4);
       // list1.next.next.next = new ListNode(4);

        ListNode list2 = new ListNode(1);
        //list2.next = new ListNode(2);
        //list2.next.next = new ListNode(5);
       // list2.next.next.next = new ListNode(4);

        ListNode node = mergeTwoLists(list1,list2);
        while(node!=null){
            System.out.print( node.val +" ");
            node = node.next;
        }
    }


    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        if(list1 == null )
            return list2;
        if(list2 == null)
            return list1;

        if(list1.val>list2.val){
            ListNode temp = list1;
            list1 = list2;
            list2 =temp;
        }
        ListNode head =list1;
        ListNode prev = list1;
        System.out.println("list1 "+list1.val+" list2 "+list2.val);
        while(list1!=null && list2!=null){

            if(list1.val < list2.val){
                prev = list1;
                list1 = list1.next;

            }else{
                //ListNode newNode = new ListNode(list2.val);
                ListNode newNode = list2;
                list2 = list2.next;
                newNode.next = prev.next;
                prev.next = newNode;
                list1 = newNode;


            }
            if(list1==null && list2!=null){
               // System.out.println("list2 "+list2.val);
                prev.next = list2;
            }

        }
        return head;
    }
}

