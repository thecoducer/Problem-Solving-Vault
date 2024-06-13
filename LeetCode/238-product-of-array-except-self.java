class Solution {

    public int[] productExceptSelf(int[] nums) {
        int len = nums.length;
        int ans[] = new int[len];
        ans[0] = 1;

        // calculating the prefix product and storing it in ans array
        for (int i = 1; i < len; i++) {
            ans[i] = ans[i - 1] * nums[i - 1];
        }

        // calculating the suffix product on the fly and refilling the ans array
        int curr = 1;
        for (int i = len - 1; i >= 0; i--) {
            ans[i] *= curr;
            curr *= nums[i];
        }

        return ans;
    }
}
