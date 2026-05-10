class Solution {
    // iterative + 2 variables solution
    // optimization is much similar to fibonacci sequence creation
    public int rob(int[] nums) {
        int rob1 = 0, rob2 = 0;

        // [rob1, rob2, num, num+1, num+2, ...]
        for (int num : nums) {
            int temp = Math.max(rob1 + num, rob2);
            rob1 = rob2;
            rob2 = temp;
        }
        return rob2;
    }
}