package main.java.easy;

import java.awt.*;

/**
 * {@link https://leetcode.com/problems/merge-two-sorted-lists/description}
 */
public class MergeTwoSortedLists {

    public static void main(String[] args) {
        ListNode list1 = new ListNode(1, new ListNode(3, new ListNode(5)));
        ListNode list2 = new ListNode(2, new ListNode(4, new ListNode(6)));

        ListNode head = mergeTwoLists(list1, list2);

        while (head != null) {
            System.out.print(head.val + " -> ");
            head = head.next;
        }
        System.out.println("null");
    }

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode listNodeResult = new ListNode(-1);
        ListNode newNode = listNodeResult;

        while (list1 != null && list2!= null) {
            if (list1.val < list2.val) {
                newNode.next = list1;
                list1 = list1.next;
            } else {
                newNode.next = list2;
                list2 = list2.next;
            }

            newNode = newNode.next;
        }

        if (list1 != null) {
            newNode.next = list1;
        } else {
            newNode.next = list2;
        }

        return listNodeResult.next;
    }
}

