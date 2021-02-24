package Dynamic_Programming;

import java.util.Arrays;

// Time: O(N) --- Space: O(N)
public class HouseRobberII {
    public int rob(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }

        if (nums.length == 1) {
            return nums[0];
        }

        int[] a1 = Arrays.copyOfRange(nums, 0, nums.length - 1);
        int[] a2 = Arrays.copyOfRange(nums, 1, nums.length);

        int r1 = robHelper(a1);
        int r2 = robHelper(a2);

        return Math.max(r1, r2);
    }

    public int robHelper(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }

        if (nums.length == 1) {
            return nums[0];
        }
        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        dp[1] = Math.max(nums[0], nums[1]);

        for (int i = 2; i < nums.length; i++) {
            dp[i] = Math.max(nums[i] + dp[i - 2], dp[i - 1]);
        }

        return dp[nums.length - 1];
    }
}
