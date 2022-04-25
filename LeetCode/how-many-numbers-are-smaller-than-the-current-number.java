class Solution {
    /**
     * 
     * TC: O(N)
     * SC: O(1)
     */
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] temp = new int[101];
        
        // storing frequency of elements
        // element indexed
        for(int i=0;i<nums.length;i++) {
            temp[nums[i]]++;
        }
        
        // sum of frequencies
        // "how many numbers" are counted by prefix sum technique
        for(int i=1;i<temp.length;i++) {
            temp[i] += temp[i-1];
        }
        
        // getting the "smaller than the current number" count
        for(int i=0;i<nums.length;i++) {
            int v = nums[i];
            
            if(v == 0) {
                nums[i] = 0;
            }else{
                nums[i] = temp[nums[i] - 1];
            }
        }
        
        return nums;
    }
}