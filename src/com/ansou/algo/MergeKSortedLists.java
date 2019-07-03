package com.ansou.algo;

public class MergeKSortedLists {

    private static class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
    }

    private static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
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

    public static ListNode mergeKLists(ListNode[] lists) {
        if(lists.length == 0 || lists == null)
            return null;
        if(lists.length == 1)
            return lists[0];
        int left = 0;
        int right = lists.length - 1;
        while(right != 0)
        {
            left = 0;
            while(left < right) {
                lists[left] = mergeTwoLists(lists[left], lists[right]);
                left++;
                right--;
            }
        }
        return lists[0];
    }

    public static void main(String[] args) {
        ListNode test1 = new ListNode(1);
        ListNode test2 = new ListNode(4);
        ListNode test3 = new ListNode(5);

        ListNode test6 = new ListNode(1);
        ListNode test7 = new ListNode(3);
        ListNode test8 = new ListNode(4);

        ListNode test9 = new ListNode(2);
        ListNode test10 = new ListNode(6);

        test1.next = test2;
        test2.next = test3;

        test6.next = test7;
        test7.next = test8;

        test9.next = test10;

        ListNode[] lists = {test1, test6, test9};

        ListNode result = mergeKLists(lists);

        while (result != null) {
            System.out.println(result.val);
            result = result.next;
        }
    }
}
