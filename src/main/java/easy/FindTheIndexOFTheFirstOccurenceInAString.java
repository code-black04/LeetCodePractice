package main.java.easy;

/**
 * {@link https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/description}
 */

public class FindTheIndexOFTheFirstOccurenceInAString {

    public static void main(String[] args) {
        String haystack = "hello";
        String needle = "ll";

        System.out.println(strStr(haystack, needle));
    }

    public static int strStr(String haystack, String needle) {
        int needleIndex = -1;

        if (haystack.length() > needle.length()){
            for (int i = 0; i <= haystack.length() - needle.length(); i++) {
                if (haystack.substring(i, i+needle.length()).equals(needle)){
                    needleIndex = i;
                    return needleIndex;
                }
            }
        } else if (haystack.length() == needle.length() && haystack.equals(needle)) {
            needleIndex = 0;
            return needleIndex;
        }

        return needleIndex;
    }

}
