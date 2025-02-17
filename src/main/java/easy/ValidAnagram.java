package main.java.easy;

import java.util.HashMap;
import java.util.Map;

/**
 * {@link https://leetcode.com/problems/valid-anagram/description}
 */
public class ValidAnagram {

    public static void main(String[] args) {
        String s = "rat";
        String t = "car";

        System.out.println(isAnagram(s, t));
    }

    public static boolean isAnagram(String s, String t) {

        if (s.length() != t.length())
            return false;

        int[] count = new int[26];

        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a']++;
            count[t.charAt(i) - 'a']--;
        }

        for (int num : count) {
            if (num != 0){
                return false;
            }
        }

        return true;

//        Map<Character, Integer> hashMap = new HashMap<>();
//        for (char ch : s.toCharArray()) {
//            hashMap.put(ch, hashMap.getOrDefault(ch, 0) + 1);
//        }
//
//        for (char ch : t.toCharArray()) {
//            if (!hashMap.containsKey(ch) || hashMap.get(ch) == 0) {
//                return false;
//            }
//
//            hashMap.put(ch, hashMap.get(ch) - 1);
//        }
//
//        return true;
    }
}
