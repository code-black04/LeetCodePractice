import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
        int[] inputArray = {3, 2, 4};
        int target = 6;
        Arrays.stream(twoSum(inputArray, target));
    }

    public static int[] twoSum(int[] numArray, int target) {
        int outputArray[] = new int[2];
        outputArray = generateSumPair(numArray, target);
        System.out.println(Arrays.toString(outputArray));
        return outputArray;

    }

    private static int[] generateSumPair(int[] numArray, int target) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();

        for (int i =0; i < numArray.length; i++) {
            int number = target - numArray[i];
            if (hashMap.containsKey(number)){
                return new int[] {hashMap.get(number), i};
            }
            hashMap.put(numArray[i], i);
        }
        return null;
    }
}

