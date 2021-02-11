package week1Arrays;

public class findMinInRotatedSortedArray {
    // Time: O(LOGN) --- Space: O(1)
    public int findMin(int[] nums) {
        int low = 0, high = nums.length - 1;

        // already sorted
        if (nums[0] <= nums[high]) {
            return nums[0];
        }

        while (low <= high) {
            int mid = low + (high - low) / 2;

            // The pivot point is between mid -> mid + 1
            if (nums[mid] > nums[mid + 1]) {
                return nums[mid + 1];
            }

            // The pivot point is between mid - 1 -> mid
            if (nums[mid] < nums[mid - 1]) {
                return nums[mid];
            }

            // Pivot point is between low and mid
            // in that case we update the high because we are looking for pivot
            if (nums[low] > nums[mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return -1;
    }
}
