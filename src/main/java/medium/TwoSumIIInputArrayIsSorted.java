package main.java.medium;

/**
 * {@link https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/description}
 */
public class TwoSumIIInputArrayIsSorted {
    public static void main(String[] args) {
        int[] numbers = {-1, 0};
        int target = -1;
        twoSum(numbers, target);
    }

    public static int[] twoSum(int[] numbers, int target) {
        int[] finalArray = new int[2];
        int i = 0;
        int j = numbers.length - 1;
        while (i < j) {

            if (numbers[j] + numbers[i] > target) {
                j--;
            }
            else if (numbers[j] + numbers[i] == target){
                finalArray[0] = i+1;
                finalArray[1] = j+1;
                return finalArray;
            } else {
                i++;
            }
        }

        for (int i1 : finalArray) {
            System.out.println(i1);
        }

        return finalArray;
    }
}
