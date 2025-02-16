package main.java.easy;

/**
 * {@link https://leetcode.com/problems/is-subsequence/description}
 */

public class IsSubsequence {

    public static void main(String[] args) {
        String s = "b";
        String t = "abc";

        System.out.println(isSubsequence(s, t));
    }

    public static boolean isSubsequence(String s, String t) {
        boolean isSubsequence = false;
        String foundSubsequence = "";

        if (s.isEmpty())
            return true;

        if (s.equals(t)) {
            return true;
        }
        int j = 0;

        for (int i = 0; i < t.length(); i++) {
            if (t.charAt(i) == s.charAt(j)) {
                foundSubsequence = foundSubsequence.concat(String.valueOf(t.charAt(i)));
                if (j < s.length() - 1){
                    j++;
                } else {
                    break;
                }
            }
        }

        if (foundSubsequence.equals(s) && !s.isEmpty()){
            isSubsequence = true;
        }

        return  isSubsequence;
    }
}
