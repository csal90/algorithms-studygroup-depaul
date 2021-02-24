package Dynamic_Programming;

public class LCS {
    // Time: O(M * N) --- Space: O(M * N)
    // BOTTOM UP APPROACH
    public int lengthLCS(String text1, String text2) {
        int M = text1.length();
        int N = text2.length();

        int[][] dp = new int[M + 1][N + 1];

        for (int i = M - 1; i >= 0; i--) {
            for (int j = N - 1; j >= 0; j--) {
                if (text1.charAt(i) == text2.charAt(j)) {
                    dp[i][j] = 1 + dp[i + 1][j + 1];
                } else {
                    dp[i][j] = Math.max(dp[i][j - 1], dp[i - 1][j]);
                }
            }
        }

        return dp[0][0];
    }
}