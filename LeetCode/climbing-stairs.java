// https://leetcode.com/problems/climbing-stairs/

class Solution {
    /**
     * 
     * TC: O(N)
     * SC: O(1)
     */
    public int climbStairs(int n) {
        int justBeforePrev = 1, prev = 2, curr = 0;
        
        if(n <= 2) {
            return n;
        }
        
        for(int i=2;i<n;i++) {
            curr = prev + justBeforePrev;
            justBeforePrev = prev;
            prev = curr;
        }
        
        return curr;
    }
}
