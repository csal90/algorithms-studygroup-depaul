package Dynamic_Programming;

import java.util.Arrays;

public class LIS {
    // Time: O(N^2) --- Space: O(N)
    public int lengthOfLIS(int[] nums) {
        int N = nums.length;

        if (N == 1) {
            return 1;
        }

        int max = 0;
        int[] LIS = new int[N];
        Arrays.fill(LIS, 1);

        for (int i = 1; i < N; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[i] > nums[j]) {
                    LIS[i] = Math.max(LIS[i], 1 + LIS[j]);
                }
                max = Math.max(max, LIS[i]);
            }
        }
        return max;
    }
}