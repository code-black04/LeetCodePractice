package main.java.medium;

import main.java.easy.ValidAnagram;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * {@link https://leetcode.com/problems/group-anagrams/description}
 */
public class GroupAnagrams {

    public static void main(String[] args) {
        String[] strs = {"eat","tea","tan","ate","nat","bat"};
        System.out.println(groupAnagrams(strs));
    }

    public static List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> stringListHashMap = new HashMap<>();

        for (int i = 0; i < strs.length; i++) {
            String check = strs[i];
            boolean found = false;

            for (Map.Entry<String, List<String>> entry : stringListHashMap.entrySet()) {
                if (check.length() == entry.getKey().length()) {
                        boolean isValidAnagram = ValidAnagram.isAnagram(check, entry.getKey());
                        if (isValidAnagram) {
                            entry.getValue().add(check);
                            found = true;
                            break;
                        }
                }
            }

            if (!found) {
                stringListHashMap.put(check, new ArrayList<>(List.of(check)));
            }
        }
        return new ArrayList<>(stringListHashMap.values());
    }
}
