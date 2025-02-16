package main.java.easy;

/**
 * {@link https://leetcode.com/problems/longest-common-prefix/description}
 */

public class LongestCommonPrefix {

    public static void main(String[] args) {
        String[] strs = {"flower","flow","flight"};
        System.out.println(longestCommonPrefix(strs));
    }

    public static String longestCommonPrefix(String[] strs) {

        if (strs == null || strs.length == 0) {
            return "";
        }

        String finalString = "";
        char firstChar;
        int i = 0;

        while(true) {

            if (i >=strs[0].length()) {
                break;
            }

            firstChar = strs[0].charAt(i);

            for (String str : strs) {
                if (i >= str.length() || str.charAt(i) != firstChar) {
                    return finalString;
                }
            }
            finalString = finalString.concat(String.valueOf(firstChar));
            i++;
        }

        return finalString;
    }
}
