package com.ansou.algo;

public class RemoveNthNodeFromEndofList {

    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    public static ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode p = head, cur = head;
        for (int i = 0; i < n; i++) cur = cur.next;
        if (cur == null) return (n==1) ? null : head.next;
        cur = cur.next;
        while (cur != null) {
            cur = cur.next;
            p = p.next;
        }
        p.next = p.next.next;
        return head;
    }

    public static void main(String[] args) {
        ListNode test1 = new ListNode(1);
        ListNode test2 = new ListNode(2);
        ListNode test3 = new ListNode(3);
        ListNode test4 = new ListNode(4);
        ListNode test5 = new ListNode(5);

        test1.next = test2;
        test2.next = test3;
        test3.next = test4;
        test4.next = test5;

        ListNode result = removeNthFromEnd(test1, 2);

        while (result != null) {
            System.out.println(result.val);
            result = result.next;
        }
    }
}
