package main.java.easy;

import java.util.HashMap;
import java.util.Map;

/**
 * {@link https://leetcode.com/problems/word-pattern/description}
 */
public class WordPattern {

    public static void main(String[] args) {
        String pattern = "abba";
        String s = "dog cat cat dog";

        System.out.println(wordPattern(pattern, s));
    }

    public static boolean wordPattern(String pattern, String s) {

        Map<Character, String> stringMap = new HashMap<>();
        Map<String, Character> wordMap = new HashMap<>();

        String[] stringArray = s.trim().split("\\s");

        if (pattern.length() != stringArray.length){
            return false;
        }

        for (int i = 0; i < pattern.length(); i++) {
            if (stringMap.containsKey(pattern.charAt(i))) {
                if (!stringMap.get(pattern.charAt(i)).equals(stringArray[i])) {
                    return false;
                }
            } else {
                    if (wordMap.containsKey(stringArray[i]) && wordMap.get(stringArray[i]) != pattern.charAt(i)) {
                        return false;
                    }
                    stringMap.put(pattern.charAt(i), stringArray[i]);
                    wordMap.put(stringArray[i], pattern.charAt(i));
                }
            }
        return true;
    }

}
