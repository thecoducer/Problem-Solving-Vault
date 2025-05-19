class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        /**
         * The rotation algorithm (the three-step reversal method) works by treating k 
         * as the effective number of positions to rotate. If k were larger than n, 
         * performing rotations k times would be redundant. By using k = k % n;, 
         * we reduce k to its effective value within the range [0, n-1].
         */
        k = k % n;
        reverse(nums, 0, n - 1); // reverse the entire array
        reverse(nums, 0, k - 1); // reverse the first k elements
        reverse(nums, k, n - 1); // reverse the the rest of the elements after k
    }

    private void reverse(int[] nums, int start, int end) {
        while (start <= end) {
            swap(nums, start, end);
            start++;
            end--;
        }
    }

    private void swap(int[] nums, int a, int b) {
        int t = nums[a];
        nums[a] = nums[b];
        nums[b] = t;
    }
}