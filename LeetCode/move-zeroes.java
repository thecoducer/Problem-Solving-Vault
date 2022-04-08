class Solution {
    public void moveZeroes(int[] nums) {
        for(int lastNonZeroFoundAt = 0, curr = 0; curr < nums.length; curr++) {
            if(nums[curr] != 0) {
                swap(nums, lastNonZeroFoundAt, curr);
                lastNonZeroFoundAt++;
            }
        }
    }
    
    private void swap(int[] nums, int first, int second) {
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}