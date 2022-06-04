class Solution {
    // negative indexing in-place
    // TC: O(N)
    // SC: O(1)
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> result = new ArrayList<>();
        int len = nums.length;
        
        for(int i=0; i<len; i++) {
            int x = Math.abs(nums[i]) - 1;
            // this prevents changing a negative element back to positive
            // we could've also used abs() instead of it
            // like this nums[x] = -Math.abs(nums[x])
            if(nums[x] > 0) { 
                nums[x] = -nums[x];
            }
        }
        
        for(int i=0;i<len;i++) {
            if(nums[i] > 0) {
                result.add(i+1);
            }
        }
        
        return result;
    }
}