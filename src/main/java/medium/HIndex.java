package main.java.medium;

import java.util.Arrays;

/**
 * {@link https://leetcode.com/problems/h-index/description}
 */

public class HIndex {

    public static void main(String[] args) {
        int[] citations = {0, 0, 2};
        System.out.println(hIndex(citations));
    }

    public static int hIndex(int[] citations) {
        int hIndex = 0;
        citations = Arrays.stream(citations).sorted().toArray();
        int arrayLength = citations.length;

        for (int i = 0; i < arrayLength; i++) {
            hIndex = arrayLength - i;
            if (citations[i] >= hIndex) {
                return hIndex;
            }
        }

        return 0;
    }

}
