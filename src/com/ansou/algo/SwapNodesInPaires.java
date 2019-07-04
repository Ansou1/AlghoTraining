package com.ansou.algo;

public class SwapNodesInPaires {

    private static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    private static void swap(ListNode l1, ListNode l2) {
        int tmp = l1.val;
        l1.val = l2.val;
        l2.val = tmp;
    }

    public static ListNode swapPairs(ListNode head) {
        if (head != null && head.next != null)
        {
            swap(head, head.next);
            swapPairs(head.next.next);
        }
        return head;
    }

    public static void main(String[] args) {
        ListNode test1 = new ListNode(1);
        ListNode test2 = new ListNode(2);
        ListNode test3 = new ListNode(3);
        ListNode test4 = new ListNode(4);

        test1.next = test2;
        test2.next = test3;
        test3.next = test4;

        ListNode result = swapPairs(test1);

        while (result != null) {
            System.out.println(result.val);
            result = result.next;
        }
    }
}
