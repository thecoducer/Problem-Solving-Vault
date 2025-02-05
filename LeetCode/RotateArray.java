class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n; // ensure k is within the range [0, n]
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