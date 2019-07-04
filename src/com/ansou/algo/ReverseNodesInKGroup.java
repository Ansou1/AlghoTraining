package com.ansou.algo;

public class ReverseNodesInKGroup {

    private static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    private void swap(ListNode l1, ListNode l2) {
        int tmp = l1.val;
        l1.val = l2.val;
        l2.val = tmp;
    }

    private ListNode swapPairs(ListNode head) {
        if (head != null && head.next != null) {
            swap(head, head.next);
            swapPairs(head.next.next);
        }
        return head;
    }

    public static ListNode reverseKGroup(ListNode head, int k) {
        ListNode curr = head;
        int count = 0;

        while (curr != null && count != k) {
            curr = curr.next;
            count++;
        }

        if (count == k) {
            ListNode pre = reverseKGroup(curr, k);
            while(count-->0){
                ListNode next = head.next;
                head.next = pre;
                pre = head;
                head = next;
            }
            head = pre;
        }

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

        ListNode result = reverseKGroup(test1, 2);

        while (result != null) {
            System.out.println(result.val);
            result = result.next;
        }
    }
}
