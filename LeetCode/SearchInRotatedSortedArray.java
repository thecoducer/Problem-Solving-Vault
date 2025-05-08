class Solution {
    public int search(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] == target)
                return mid;

            // left sorted portion
            if (nums[low] <= nums[mid]) {
                // confirming that our target doesn't lie in the left half
                if (target > nums[mid] || target < nums[low])
                    low = mid + 1; // so we move to right half
                else
                    high = mid - 1;
            } else { // right sorted position
                // confirming that our target doesn't lie in the right half
                if (target < nums[mid] || target > nums[high])
                    high = mid - 1; // so we move to left half
                else
                    low = mid + 1;
            }
        }

        return -1;
    }
}