package main.java.medium;

import java.util.PriorityQueue;

/**
 * {@link https://leetcode.com/problems/kth-largest-element-in-an-array/description/}
 */
public class KthLargestElement {

    public static void main(String[] args) {
        int[] nums = {3,2,3,1,2,4,5,5,6};
        int k = 4;

        System.out.println(findKthLargest(nums, k));
    }

    public static int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(k);
        for (int i = 0; i < k; i++) {
            priorityQueue.add(nums[i]);
        }

        for (int i = k; i < nums.length; i++) {
            if (nums[i] > priorityQueue.peek()){
                priorityQueue.poll();
                priorityQueue.add(nums[i]);
            }
        }
        return priorityQueue.poll();
    }
}
