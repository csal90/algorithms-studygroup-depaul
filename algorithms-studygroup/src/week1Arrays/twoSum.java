package week1Arrays;

import java.util.HashMap;

public class twoSum {
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        System.out.println(twoSum(nums, target));
    }

    // Time: O(N) --- Space: O(N)
    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int delta = target - nums[i];
            if (map.containsKey(delta)) {
                return new int[] {i, map.get(delta)};
            }
            map.put(nums[i], i);
        }
        return new int[] {-1, -1};
    }

    // Time: O(N^2) --- Space: O(1)
    public static int[] twoSumBF(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i , j};
                }
            }
        }
        return new int[] {-1, -1};
    }
}
