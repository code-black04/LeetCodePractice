package main.java.medium;

/**
 * {@link https://leetcode.com/problems/container-with-most-water/}
 */
public class ContainerWithMostWater {
    public static void main(String[] args) {
        int height[] = {1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(height));
    }

    public static int maxArea(int[] height) {
        int maxVolume = 0;
        int leftPointer = 0;
        int rightPointer = height.length - 1;

        while(leftPointer < rightPointer) {
            int width = rightPointer - leftPointer;
            int currentVolume = Math.min(height[leftPointer], height[rightPointer]) * width;

            maxVolume = Math.max(currentVolume, maxVolume);

            if (height[leftPointer] < height[rightPointer]) {
                leftPointer ++;
            } else
                rightPointer--;
        }
        return maxVolume;
    }
}
