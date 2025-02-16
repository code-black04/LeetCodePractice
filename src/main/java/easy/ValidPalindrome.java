package main.java.easy;

/**
 * {@link https://leetcode.com/problems/valid-palindrome/description}
 */
public class ValidPalindrome {

    public static void main(String[] args) {
        String s = " ";
        System.out.println(isPalindrome(s));
    }

    public static boolean isPalindrome(String s) {
        boolean isValidPalindrome = false;

        if (s.isEmpty() || s.length() == 1)
            return true;

        s = s.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");

        for (int i = 0, j = s.length() - 1; i < j; i++, j--) {
            if (s.charAt(i) == s.charAt(j)) {
                isValidPalindrome = true;
            } else {
                return false;
            }
        }

        return isValidPalindrome;
    }
}
