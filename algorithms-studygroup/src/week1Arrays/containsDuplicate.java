package week1Arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class containsDuplicate {
    // Time: O(NLOGN) --- Space: O(N)
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {
            if (set.contains(nums[i])) {
                return true;
            }
            set.add(nums[i]);
        }

        return false;
    }
}
