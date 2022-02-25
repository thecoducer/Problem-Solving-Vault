// https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/

class Solution {
public:
    vector<int> twoSum(vector<int>& nums, int target) {
        vector<int> res;
        
        // as we are given a sorted array, we can use the two pointers approach
        
        int start = 0;
        int end = nums.size() - 1;
        
        while(start < end) {
            int sum = nums[start] + nums[end];
            
            if(sum > target) {
                end--;
            }else if(sum < target) {
                start++;
            }else{
                return vector<int>{start + 1, end + 1};
            }
        }
        
        return vector<int>{start + 1, end + 1};
    }
};
