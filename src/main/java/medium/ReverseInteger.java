package main.java.medium;

/**
 * {@link https://leetcode.com/problems/reverse-integer/}
 */

public class ReverseInteger {
    public static void main(String[] args) {
        int x = 123;
        System.out.println(reverse(x));
    }

    public static int reverse(int x) {
        int result = 0;

        while (x != 0) {
            int remainder = x % 10;

            if (result > Integer.MAX_VALUE / 10 || (result == Integer.MAX_VALUE / 10 && remainder > 7)) {
                return 0;
            }
            if (result < Integer.MIN_VALUE / 10 || (result == Integer.MIN_VALUE / 10 && remainder < -8)) {
                return 0;
            }

            result = result * 10 + remainder;
            x = x / 10;
        }

        return result;
    }
}
