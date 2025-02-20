package main.java.easy;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * {@link https://leetcode.com/problems/linked-list-cycle/description}
 */
public class LinkedListCycle {

    public static void main(String[] args) {
        ListNode head = createLinkedListWithCycle(new int[]{1, 2}, -1);
        System.out.println(hasCycle(head));
    }

    private static ListNode createLinkedListWithCycle(int[] values, int pos) {
        if (values.length == 0) return null;

        ListNode head = new ListNode(values[0]);
        ListNode tail = head;
        ListNode cycleNode = null;

        for (int i = 1; i < values.length; i++) {
            ListNode newNode = new ListNode(values[i]);
            tail.next = newNode;
            tail = tail.next;
            if (i == pos) {
                cycleNode = tail;
            }
        }
        if (cycleNode != null) {
            tail.next = cycleNode;
        }
        return head;
    }

    public static boolean hasCycle(ListNode head) {

        if (head != null && head.next == null) {
            return false;
        }
        Set<ListNode> uniqueSet = new HashSet<>();

        while (head != null) {
            if (!uniqueSet.add(head)) {
                return true;
            }
            head = head.next;
        }
        return false;
    }

}

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
        next = null;
    }
    ListNode() {
    }
}
