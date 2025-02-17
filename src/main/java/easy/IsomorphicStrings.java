package main.java.easy;

import java.util.HashMap;
import java.util.Map;

/**
 * {@link https://leetcode.com/problems/isomorphic-strings/description}
 */

public class IsomorphicStrings {

    public static void main(String[] args) {
        String s = "ab";
        String t = "ac";

        System.out.println(isIsomorphic(s, t));
    }

    public static boolean isIsomorphic(String s, String t) {

        if (s.length() != t.length()) {
            return false;
        }

        if (s.equals(t)) {
            return true;
        }

        Map<Character, Character> characterMap = new HashMap<>();
        Map<Character, Character> reverseCharacterMap = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {

            if (characterMap.containsKey(s.charAt(i))) {
                if (characterMap.get(s.charAt(i)) != t.charAt(i)) {
                    return false;
                }
            } else {
                if (reverseCharacterMap.containsKey(t.charAt(i))){
                    return false;
                }
                characterMap.put(s.charAt(i), t.charAt(i));
                reverseCharacterMap.put(t.charAt(i), s.charAt(i));
            }
        }

        return true;
    }

}
