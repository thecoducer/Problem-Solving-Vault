class Solution {
    // We are using sliding window technique using two pointers
    // left and right points to 0th position initially
    // right moves rightwards and countZeroes keeps count of zeroes
    // if countZeroes > k, our window becomes invalid
    // we then shift left pointer rightwards and eliminate zeroes to make our window valid again (countZeroes <= k)
    public int longestOnes(int[] nums, int k) {
        int left = 0, countZeroes = 0, maxWindow = 0;
        int n = nums.length;

        for (int right = 0; right < n; right++) {
            if (nums[right] == 0) {
                countZeroes++;
            }

            while (countZeroes > k) {
                if (nums[left] == 0) {
                    countZeroes--;
                }
                left++;
            }

            int window = right - left + 1;
            maxWindow = Math.max(maxWindow, window);
        }

        return maxWindow;
    }
}