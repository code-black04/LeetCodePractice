package main.java.medium;

import java.util.*;

/**
 * {@link https://leetcode.com/problems/letter-combinations-of-a-phone-number/description}
 */
public class LetterCombinationOfAPhoneNumber {

    public static void main(String[] args) {
        String digits = "";
        System.out.println(letterCombinations(digits));
    }

    public static List<String> letterCombinations(String digits) {
        if (digits.isEmpty())
            return new ArrayList<>();

        Map<Character, String> keyPad = new HashMap<>();
        keyPad.put('2', "abc");
        keyPad.put('3', "def");
        keyPad.put('4', "ghi");
        keyPad.put('5', "jkl");
        keyPad.put('6', "mno");
        keyPad.put('7', "pqrs");
        keyPad.put('8', "tuv");
        keyPad.put('9', "wxyz");

        Queue<String> queue = new LinkedList<>();
        queue.add("");
        for (char digit : digits.toCharArray()) {
            int queueSize = queue.size();
            String letters = keyPad.get(digit);

            for (int i = 0; i < queueSize; i++) {
                String prefix = queue.poll();
                for (char letter : letters.toCharArray()) {
                    queue.add(prefix + letter);
                }
            }
        }
        
        return new ArrayList<>(queue);
    }
    
}
