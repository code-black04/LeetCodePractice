package main.java.medium;

import java.text.DecimalFormat;

/**
 * {@link https://leetcode.com/problems/powx-n/description}
 */
public class PowerOfNToX {

    public static void main(String[] args) {
        double x = 2.00000;
        int n = -2147483648;

        System.out.println(myPow(x, n));
    }

    public static double myPow(double x, int n) {

        if (n == Integer.MIN_VALUE && x > 1) {
            return 0;
        }

        if (n == Integer.MIN_VALUE && x == 1) {
            return 1;
        }

        double number = 1;
        if (n == 0)
            return 1.00000;
        if (n == 1) {
            return x;
        }

        if (n < 0) {
            x = 1 / x;
            n = -n;
        }

        while (n > 0){
            if (n % 2 != 0) {
                number = number * x;
            }
            x *= x;
            n/=2;
        }

        return number;
    }
}
