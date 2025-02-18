package main.java.medium;

import java.util.Arrays;

/**
 * {@link https://leetcode.com/problems/reverse-words-in-a-string/description}
 */

public class ReverseWordInAString {

    public static void main(String[] args) {
        String s = "a good   example";
        System.out.println(reverseWords(s));
    }

    public static String reverseWords(String s) {

        String[] stringArray = s.trim().split("\\s+");

        StringBuilder stringBuilder = new StringBuilder();

        for (int i = stringArray.length - 1; i >= 0 ; i--) {
            stringBuilder.append(stringArray[i]).append(i > 0 ? " " : "");
        }

        return stringBuilder.toString();
    }

}
