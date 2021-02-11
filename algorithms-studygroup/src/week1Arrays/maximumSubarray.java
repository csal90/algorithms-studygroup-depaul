package week1Arrays;

public class maximumSubarray {
    // Time: O(N) --- Space: O(1)
    public int maxSubArray(int[] nums) {
        int maxSoFar = nums[0];
        int maxEndingHere = nums[0];

        for(int i = 1; i < nums.length; i++) {
            maxEndingHere = Math.max(nums[i] + maxEndingHere, nums[i]);
            maxSoFar = Math.max(maxSoFar, maxEndingHere);
        }

        return maxSoFar;
    }
}
