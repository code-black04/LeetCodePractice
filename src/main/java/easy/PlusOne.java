package main.java.easy;

/**
 * {@link https://leetcode.com/problems/plus-one/description}
 */
public class PlusOne {
    public static void main(String[] args) {
        int[] digits = {1, 2, 3};
        System.out.println(plusOne(digits));
    }

    public static int[] plusOne(int[] digits) {
        if (digits[digits.length - 1] < 9) {
            digits[digits.length - 1]+=1;
            return digits;
        } else {
            int i = digits.length - 1;
            while (digits[i] == 9 && i > 0) {
                digits[i] = 0;
                i--;
            }

            if (digits[i] < 9) {
                digits[i] += 1;
                return digits;
            } else {
                int[] newDigits = new int[digits.length + 1];
                newDigits[0] = 1;
                return newDigits;
            }
        }
    }
}
