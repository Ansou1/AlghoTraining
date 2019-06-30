package com.ansou.algo;

public class MergeTwoSortedLists {

    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null || l2 == null)
            return (l1 == null) ? l2 : l1;

        if (l1.val <= l2.val) {
            l1.next = mergeTwoLists(l1.next, l2);
            return l1;
        } else {
            l2.next = mergeTwoLists(l1, l2.next);
            return l2;
        }
    }

    /*
    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null || l2 == null)
            return l1 == null ? l2 : l1;
        ListNode cur = new ListNode(0);
        ListNode dummy;
        dummy = cur;
        while (l1 != null && l2 != null){
            if (l1.val <= l2.val){
                cur.next = l1;
                l1 = l1.next;
            }
            else {
                cur.next = l2;
                l2 = l2.next;
            }
            cur = cur.next;
        }
        cur.next = (l1 == null) ? l2 : l1;
        return dummy.next ;
    }
    */

    public static void main(String[] args) {
        ListNode test1 = new ListNode(1);
        ListNode test2 = new ListNode(2);
        ListNode test3 = new ListNode(4);

        ListNode test6 = new ListNode(1);
        ListNode test7 = new ListNode(3);
        ListNode test8 = new ListNode(4);

        test1.next = test2;
        test2.next = test3;

        test6.next = test7;
        test7.next = test8;



        ListNode result = mergeTwoLists(test1, test6);

        while (result != null) {
            System.out.println(result.val);
            result = result.next;
        }
    }
}
