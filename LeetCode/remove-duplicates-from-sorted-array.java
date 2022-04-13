class Solution {
    public int removeDuplicates(int[] nums) {
        int len = nums.length;
        
        if(len == 0) {
            return 0;
        }
        
        // using two pointers
        int a = 0;
        for(int b=1;b<len;b++) {
            if(nums[a] != nums[b]) {
                nums[++a] = nums[b];
            }
        }
        
        return a + 1;
    }
}