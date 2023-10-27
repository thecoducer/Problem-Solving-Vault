class Solution {

    public int numSubarrayProductLessThanK(int[] nums, int k) {
        // when k is less than or equal to 1, then no matter what we multiply
        // it will be greater than k
        // so the len in this case would be zero
        if (k <= 1) return 0;
        int prod = 1, left = 0, result = 0;

        // we have used sliding window technique here

        for (int right = 0; right < nums.length; right++) {
            prod = prod * nums[right];

            // shifting the left pointer when prod >= k
            while (prod >= k) {
                prod = prod / nums[left++];
            }

            // the number of new sub-arrays which gets generated on addition of element 
            // are equal to the number of elements in the array.
            result = result + right - left + 1;
        }

        return result;
    }
}
