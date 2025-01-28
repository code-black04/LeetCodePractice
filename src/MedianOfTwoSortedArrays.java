import java.util.Arrays;
import java.util.stream.Collectors;

public class MedianOfTwoSortedArrays {
    public static void main(String[] args) {
        int[] num1 = {2, 1};
        int[] num2 = {3, 4};

        System.out.println(findMedianSortedArrays(num1, num2));
    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {

        nums1 = Arrays.stream(nums1).sorted().toArray();
        nums2 = Arrays.stream(nums2).sorted().toArray();
        int m = nums1.length, n = nums2.length;
        int totalLength = m + n;
        int midIndex = totalLength / 2;
        boolean isEven = (totalLength % 2 == 0);

        int i = 0, j = 0, current = 0;
        double median = 0.0;

        for (int k = 0; k <= midIndex; k++) {
            int num;
            if (i < m && (j >= n || nums1[i] <= nums2[j])) {
                num = nums1[i++];
            } else {
                num = nums2[j++];
            }

            if (isEven && (k == midIndex - 1 || k == midIndex)) {
                median += num / 2.0;
            } else if (!isEven && k == midIndex) {
                median = num;
            }
        }

        return Double.parseDouble(String.format("%.5f", median));
    }
}
