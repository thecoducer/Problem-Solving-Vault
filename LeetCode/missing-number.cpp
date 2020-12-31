// https://leetcode.com/problems/missing-number/

class Solution {
public:
    int missingNumber(vector<int>& nums) {
        int sum = 0;
        
        for(int i=1;i<=nums.size();i++) {
            sum += i;
            sum -= nums[i-1];
        }
        
        return sum;
    }
};