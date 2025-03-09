package main.java.medium;

import java.util.HashSet;
import java.util.Set;

/**
 * {@link https://leetcode.com/problems/valid-square/description/}
 */
public class ValidSquare {
    //d=√((x2 – x1)² + (y2 – y1)²).
    public static void main(String[] args) {
        int[] p1 = {0, 0};
        int[] p2 = {1, 1};
        int[] p3 = {1, 0};
        int[] p4 = {0, 1};

        System.out.println(validSquare(p1, p2, p3, p4));

    }

    public static boolean validSquare(int[] p1, int[] p2, int[] p3, int[] p4) {
        Set<Double> set = new HashSet<>();
        set.add(distanceBetweenTwoPoints(p1[0], p1[1], p2[0], p2[1]));
        set.add(distanceBetweenTwoPoints(p1[0], p1[1], p3[0], p3[1]));
        set.add(distanceBetweenTwoPoints(p1[0], p1[1], p4[0], p4[1]));
        set.add(distanceBetweenTwoPoints(p2[0], p2[1], p3[0], p3[1]));
        set.add(distanceBetweenTwoPoints(p2[0], p2[1], p4[0], p4[1]));
        set.add(distanceBetweenTwoPoints(p3[0], p3[1], p4[0], p4[1]));

        return !set.contains(0.0) && set.size() == 2;
    }

    private static Double distanceBetweenTwoPoints(int x1, int y1, int x2, int y2) {
        return Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
    }
}
