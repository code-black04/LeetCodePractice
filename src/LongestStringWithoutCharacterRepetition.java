import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.IntStream;

public class LongestStringWithoutCharacterRepetition {

    public static void main(String[] args) {
        String string = "pwwkew"; //" ", "c", "bbbbb", "abcabcr"
        int length = lengthOfLongestSubstring(string);
        System.out.println(length);
    }

    public static int lengthOfLongestSubstring(String s) {

        if (s.equals("") || s.equals(" ")){
            return s.length();
        }
        Map<Character, Integer> characterIntegerMap = new LinkedHashMap<>();
        int[] maxLength = {0};
        int[] start = {0};

        IntStream.range(0, s.length())
                        .forEach(i ->{
                            char c = s.charAt(i);
                            if (characterIntegerMap.containsKey(c)) {
                                start[0] = Math.max(characterIntegerMap.get(c)+1, start[0]);
                            }
                            characterIntegerMap.put(c, i);
                            maxLength[0] = Math.max(maxLength[0], i - start[0] + 1);
                      });

        return maxLength[0];
    }
}
