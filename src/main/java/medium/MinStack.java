package main.java.medium;

import java.util.Stack;

public class MinStack {

    Stack<Long> stack;
    Stack<Long> minimumStack;

    public static void main(String[] args) {
        int val = 2;
        MinStack obj = new MinStack();
        obj.push(val);
        obj.pop();
        int param_3 = obj.top();
        int param_4 = obj.getMin();
    }

    public MinStack() {
        stack = new Stack<>();
        minimumStack = new Stack<>();
    }

    public void push(int val) {
        stack.push((long) val);
        if (minimumStack.isEmpty() || val <= minimumStack.peek()) {
            minimumStack.push((long) val);
        }
    }

    public void pop() {
        if (!stack.isEmpty()) {
            long removed = stack.pop();
            if (!minimumStack.isEmpty() && removed == minimumStack.peek()) {
                minimumStack.pop();
            }
        }
    }

    public int top() {
        if (!stack.isEmpty()) {
            return Math.toIntExact(stack.peek());
        }
        return -1;
    }

    public int getMin() {
        if (!minimumStack.isEmpty()) {
            return Math.toIntExact(minimumStack.peek());
        }
        return -1;
    }
}
