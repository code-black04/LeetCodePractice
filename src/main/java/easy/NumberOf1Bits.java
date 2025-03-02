package main.java.easy;

/**
 * {@link https://leetcode.com/problems/number-of-1-bits/description}
 */
public class NumberOf1Bits {

    public static void main(String[] args) {
        int n = 11;
        System.out.println(hammingWeight(n));
    }

    public static int hammingWeight(int n) {
        int count = 0;

        while (n > 0) {
            int temp = n % 2;
            if (temp == 1) {
                count++;
            }
            n/=2;
        }

        return count;
    }
}
