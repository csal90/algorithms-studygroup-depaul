package Dynamic_Programming;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class WordBreak {
    // Time: O(N^3) --- Space: O(N)
    public boolean wordBreak(String s, List<String> wordDict) {
        int N = s.length();

        Set<String> set = new HashSet<>(wordDict);
        boolean[] dp = new boolean[N + 1];
        dp[0] = true;

        for (int i = 1; i <= N; i++) {
            for (int j = 0; j < i; j++) {
                if (dp[j] && set.contains(s.substring(j, i))) {
                    dp[i] = true;
                    break;
                }
            }
        }

        return dp[N];
    }
}