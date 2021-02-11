package week1Arrays;

public class bestTimeToSellStock {
    // Time: O(N) --- Space: O(1)
    public static int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE;
        int maxProfitSoFar = 0;

        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < min) {
                min = prices[i];
            }
            else if (prices[i] - min > maxProfitSoFar) {
                maxProfitSoFar = prices[i] - min;
            }
        }

        return maxProfitSoFar;
    }
}
