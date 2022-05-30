class Solution {
    public int searchInsert(int[] nums, int target) {
        int low = 0, high = nums.length - 1;
        
        while(low <= high) {
            int mid = (low + high) / 2;
            
            if(nums[mid] == target) {
                return mid;
            }else if(target < nums[mid]) {
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }
        
        return low;

        // the low pointer can go upto high + 1
        // at this point low is equal to high + 1
        // that's where we need to insert the target value
    }
}