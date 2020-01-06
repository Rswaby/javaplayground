package javaplay.CTCI;
// linked List

import java.util.HashSet;
import java.util.Set;

public class Chapter2 {

    public static ListNode deleteNode(ListNode head, int target) {

        if (head.val == target)
            return head.next;
        ListNode curr = head;

        while (curr.next != null) {
            if (curr.val == target) {
                curr.next = curr.next.next;
                return head;
            }
        }
        return head;

    }

    public static ListNode removeDuplicates(ListNode head) {

        Set<Integer> buff = new HashSet<>();
        ListNode curr = head;
        while (curr.next != null) {
            if (buff.contains(curr.val)) {
                curr.next = curr.next.next;
            } else {
                buff.add(curr.val);
            }
        }
        return head;

    }

    public static int KthtoLast(ListNode head, int k) {

        ListNode fast = head;
        ListNode slow = head;

        for (int _ = 0; _ < k + 1; _++) {
            fast = fast.next;
        }

        while (fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }

        return slow.val;

    }

    public static Boolean deleteMiddleNode(ListNode middle) {
        /*
         * given the middle ListNode return the list that makes it appears to be deletedd
         * 
         */

         if (middle == null || middle.next == null) return false; 
         

         ListNode next = middle.next;
         middle.val = next.val;
         middle.next = next.next;

         return true;
    }

}