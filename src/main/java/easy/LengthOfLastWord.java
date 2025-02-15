package main.java.easy;

import java.util.Arrays;

/**
 * {@link https://leetcode.com/problems/length-of-last-word/description}
 */
public class LengthOfLastWord {

    public static void main(String[] args) {
        String s = "Hello World";
        System.out.println(lengthOfLastWord(s));
    }

    public static int lengthOfLastWord(String s) {
        s = s.trim();
        int lastSpace = s.lastIndexOf(" ");
        return lastSpace == -1 ? s.length() : s.substring(lastSpace + 1).length();

        /**
         * return Arrays.stream(s.split(" ")).toList().getLast().length();
         */
    }
}
