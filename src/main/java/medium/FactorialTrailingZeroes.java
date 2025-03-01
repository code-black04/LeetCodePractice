package main.java.medium;

/**
 * {@link https://leetcode.com/problems/factorial-trailing-zeroes/description}
 */
public class FactorialTrailingZeroes {

    public static void main(String[] args) {
        int n = 10;
        System.out.println(trailingZeroes(n));
    }

    public static int trailingZeroes(int n) {
        if (n == 0) return 0;
        int count = 0;
        while (n >= 5) {
            n = n / 5;
            count+=n;
        }

        return count;
    }
}
