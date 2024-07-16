import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class AddTwoNumbers {

    public static void main(String[] args) {
        ListNode l1 = new ListNode(2);
        l1.next=new ListNode(4);
        l1.next.next=new ListNode(9);

        ListNode l2 = new ListNode(5);
        l2.next=new ListNode(6);
        l2.next.next=new ListNode(4);
        l2.next.next.next=new ListNode(9);

        ListNode node = addTwoNumbers(l1, l2);

        ListNode current = node;
        while (current != null) {
            System.out.print(current.val);
            if (current.next != null) {
                System.out.print(" -> ");
            }
            current = current.next;
        }
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        Integer[] array1 = reverseListNodeArray(l1);
        Integer[] array2 = reverseListNodeArray(l2);

        List<Integer> array = addArrays(array1, array2);
        return convertToLinkedList(array);
    }

    public static Integer[] reverseListNodeArray(ListNode listNode) {
        Stack<Integer> stack = new Stack<>();

        ListNode currentNode = listNode;
        while(currentNode != null) {
            stack.push(currentNode.val);
            currentNode = currentNode.next;
        }

        List<Integer> list = new ArrayList<>();
        while (!stack.isEmpty()) {
            list.add(stack.pop());
        }
        Integer[] array = list.toArray(new Integer[0]);
        System.out.println(Arrays.toString(array));
        return array;
    }

    public static List<Integer> addArrays(Integer[] array1, Integer[] array2) {
        int maxLength = Math.max(array1.length, array2.length);
        LinkedList<Integer> result = new LinkedList<>();
        int carry = 0;

        for (int i = 0; i < maxLength; i++) {
            int digit1 = i < array1.length ? array1[array1.length - 1 - i] : 0;
            int digit2 = i < array2.length ? array2[array2.length - 1 - i] : 0;
            int sum = digit1 + digit2 + carry;
            result.addFirst(sum % 10);
            carry = sum / 10;
        }

        if (carry > 0) {
            result.addFirst(carry);
        }

        return result;
    }

    public static ListNode convertToLinkedList(List<Integer> result) {
        return result.stream()
                .reduce(null, (head, num) -> new ListNode(num, head), (l1, l2) -> {
                    throw new UnsupportedOperationException("Parallel stream not supported");
                });
    }



    public static class ListNode {

        int val;

        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }
        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}

