package main.java.easy;

/**
 * {@link https://leetcode.com/problems/reverse-bits/description}
 */
public class ReverseBits {

    public static void main(String[] args) {
        System.out.println(reverseBits(Integer.parseInt("00000010100101000001111010011100")));
    }

    public static int reverseBits(int n) {
        int result = 0;
        for (int i = 0; i < 32; i++) {
            result = result + (n & 1);
            n >>>= 1;
            if (i < 31)
                result <<= 1;
        }

        return result;
    }
}
