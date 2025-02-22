package main.java.easy;

public class PalindromeNumber {

    public static void main(String[] args) {
        int x = -121;
        System.out.println(isPalindrome(x));
    }


    public static boolean isPalindrome(int x) {
        String str = String.valueOf(x);

        for (int i = 0, j = str.length() - 1; i < j; i++, j--) {
            if (str.charAt(i) != str.charAt(j))
                return false;
        }

        return true;
    }
}
