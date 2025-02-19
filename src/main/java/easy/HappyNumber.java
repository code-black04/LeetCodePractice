package main.java.easy;

/**
 * {@link https://leetcode.com/problems/happy-number/description}
 */
public class HappyNumber {

    public static void main(String[] args) {
        int n = 19;
        System.out.println(isHappy(n));
    }

    public static boolean isHappy(int n) {
        if (n == 1 || n == 7){
            return true;
        } else if (n == 0 || (n > 1 && n < 9)) {
            return false;
        } else {
            int sum = 0;
            while (n > 0) {
                int temp = n % 10;
                sum += Math.pow(temp, 2);
                n = n / 10;
            }

            return isHappy(sum);
        }
    }

}
