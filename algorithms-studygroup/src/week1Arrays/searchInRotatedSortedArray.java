package week1Arrays;

public class searchInRotatedSortedArray {
    // Time: O(LOGN) --- Space: O(1)
    public int search(int[] nums, int target) {
        int low = 0, high = nums.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] >= nums[low]) { // check if the left side is increasing
                // check if our target is in the range from low -> mid point
                if (nums[low] <= target && target <= nums[mid]) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            }

            else { // right side is increasing
                if (target >= nums[mid] && target <= nums[high]) { // check range
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
        }
        return -1; // we never found an answer
    }
}
