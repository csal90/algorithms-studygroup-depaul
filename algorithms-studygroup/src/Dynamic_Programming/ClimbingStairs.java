package Dynamic_Programming;

public class ClimbingStairs {
    // Time: O(N) --- Space: O(1)
    public int climbStairsOPT(int n) {
        if (n == 1) {
            return 1;
        }
        int firstStair = 1;
        int secondStair = 1;
        for (int i = 2; i <= n; i++) {
            int nStair = firstStair + secondStair;
            firstStair = secondStair;
            secondStair = nStair;
        }
        return secondStair;
    }

    // Time: O(N) --- Space: O(N)
    public int climbStairsDP(int n) {
        if (n == 1) {
            return 1;
        }
        int[] dp = new int[n + 1];
        dp[0] = 1;
        dp[1] = 1;
        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 2] + dp[i - 1];
        }
        return dp[n];
    }
}