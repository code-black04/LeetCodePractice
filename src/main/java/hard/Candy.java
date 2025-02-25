package main.java.hard;

import java.util.Arrays;

/**
 * {@link https://leetcode.com/problems/candy/description}
 */
public class Candy {
    public static void main(String[] args) {
        int[] ratings = {1,2,87,87,87,2,1};
        System.out.println(candy(ratings));
    }

    public static int candy(int[] ratings) {
        int n = ratings.length;
        int[] totalCandies = new int[n];
        Arrays.fill(totalCandies, 1);

        for (int i = 1; i < n; i++) {
            if (ratings[i] > ratings[i - 1]) {
                totalCandies[i] = totalCandies[i-1] + 1;
            }
        }

        for (int i = n-2; i >= 0; i--) {
            if (ratings[i] > ratings[i + 1]) {
                totalCandies[i] = Math.max(totalCandies[i], totalCandies[i+1]+1);
            }
        }

        int sum = Arrays.stream(totalCandies).sum();

        return sum;
    }
}
