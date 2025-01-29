package main.java.medium;

/**
 * {@link https://leetcode.com/problems/string-to-integer-atoi/description/}
 */
public class StringToInteger {

    public static void main(String[] args) {
        myAtoi("1337kjgdhjkgdf");
    }

    public static int myAtoi(String s) {
        if (s == null || s.isEmpty()) return 0;

        s = s.trim();
        if (s.isEmpty()) return 0;

        int i =0;
        int n = s.length();
        boolean isPositive = true;

        if (s.startsWith("-")) {
            i++;
            isPositive = false;
        } else if (s.startsWith("+")){
            i++;
        }

        while (i < n && s.charAt(i) == '0') i++;

        int result = 0;

        while (i < n && Character.isDigit(s.charAt(i))) {
            int digit = s.charAt(i) - '0';

            if (result > (Integer.MAX_VALUE - digit) / 10) {
                return isPositive ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }

            result = result * 10 + digit;
            i++;
        }

        if (isPositive) {
            System.out.println(result);
            return result;
        } else {
            System.out.println(-result);
            result = result * -1;
            return result;
        }
    }
}
