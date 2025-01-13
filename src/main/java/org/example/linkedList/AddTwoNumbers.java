package org.example.linkedList;

public class AddTwoNumbers {
    public static void main(String[] args){
        ListNode l1 = new ListNode(9);
        l1.next = new ListNode(9);
//        l1.next.next = new ListNode(4);

        ListNode l2 = new ListNode(9);
//        l2.next = new ListNode(6);
//        l2.next.next = new ListNode(8);

        ListNode l3 = addTwoNumbers(l1,l2);
        System.out.println();
        while(l3!=null){
            System.out.print(l3.val+" ");
            l3 = l3.next;
        }
    }
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode h1 = l1;
        ListNode h2 = l2;
        ListNode p1 = l1;
        ListNode p2 = l2;
        while(l1!=null || l2!=null){
            if(l1 == null){
                p1.next = new ListNode(0);
                l1 = p1.next;
            }
            if(l2 == null){
                p2.next = new ListNode(0);
                l2 = p2.next;
            }
            l1.val = l1.val + l2.val;
            p1 = l1;
            p2 = l2;
            l1 = l1.next;
            l2 = l2.next;
        }
        l1=h1;
//       ListNode l3 = h1;
//        System.out.println("Before");
//        while(l3!=null){
//            System.out.print(l3.val+" ");
//            l3 = l3.next;
//        }

        int lastDigit=0;
        int firstDigit=0;
        while(l1!=null){
            //if(isCarry){
                l1.val = l1.val +firstDigit;
            //}

            if(l1.val>9 && l1.next!=null){
                lastDigit = l1.val%10; //2
                firstDigit = l1.val / 10; //1;
               // isCarry = true;
                l1.val = lastDigit;
            }else{
                firstDigit =0;
                if (l1.next == null && l1.val>9) { // for last node.

                    lastDigit = l1.val%10; //2
                    firstDigit = l1.val / 10; //1;
                   // System.out.println("\n firstDigit .val "+firstDigit +" l1.val "+l1.val);
                    l1.val = lastDigit;
                    l1.next = new ListNode(firstDigit);
                    break;
                }
            }
            l1 = l1.next;
        }
        return h1;
    }
}
