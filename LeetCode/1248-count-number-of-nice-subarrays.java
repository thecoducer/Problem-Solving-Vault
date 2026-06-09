/**
 * Brute-force solution: O(n^2) time complexity
 * 
 * class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        int len = nums.length;
        int niceCount = 0;

        for (int i = 0; i < len; i++) {
            int count = 0;
            for (int j = i; j < len; j++) {
                if (nums[j] % 2 != 0) {
                    count++;
                }

                if (count == k) {
                    niceCount++;
                } else if (count > k) {
                    break;
                }
            }
        }

        return niceCount;
    }
}
 */

// Sliding window technique: O(n) time complexity
class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        int oddCount = 0, result = 0;
        int left = 0, middle = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 != 0) {
                oddCount++;
            }

            // oddCount has to be exactly k
            while (oddCount > k) {
                if (nums[left] % 2 != 0) {
                    oddCount--;
                }
                left++;
                middle = left;
            }

            if (oddCount == k) {
                // skipping all the even numbers in the front
                while (nums[middle] % 2 == 0) {
                    middle++;
                }
                // the distance between left and the middle pointers
                // tells us how many sub arrays can we get that have k
                // odd elements
                result += (middle - left) + 1;
            }
        }

        return result;
    }
}

