class Solution {
    // we use bit operators
    // first XOR the input array
    // since we have distinct natural nos. from 1 to n in the array with one missing number
    // if we XOR the result from the first loop
    // then we cancel out all duplicates
    // and get the missing number
    public int missingNumber(int[] nums) {
        int x = nums[0];
        for(int i=1;i<nums.length;i++) {
            x = x ^ nums[i];
        }
        
        for(int i=1;i<=nums.length;i++) {
            x = x ^ i;
        }
        
        return x;
    }
}