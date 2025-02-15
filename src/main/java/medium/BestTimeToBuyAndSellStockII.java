package main.java.medium;

/**
 * {@link https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/description}
 */
public class BestTimeToBuyAndSellStockII {

    public static void main(String[] args) {
        int[] prices = {7,6,4,3,1};
        System.out.println(maxProfit(prices));
    }

    public static int maxProfit(int[] prices) {
        int sum = 0;
        if (prices == null || prices.length == 0) return 0;

        int maxProfit = 0;
        int minPrice = Integer.MAX_VALUE;

        for (int price : prices) {
            if (price < minPrice) {
                minPrice = price;
            } else {
                maxProfit = Math.max(maxProfit, price - minPrice);
                sum = sum + maxProfit;
                maxProfit = 0;
                minPrice = price;
            }
        }

        return sum;
    }
}
