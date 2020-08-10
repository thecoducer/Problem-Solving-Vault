// https://leetcode.com/problems/product-of-array-except-self/

class Solution {
public:
    vector<int> productExceptSelf(vector<int>& a) {
        vector<int> ans;
        
        // using ans vector as left product list
        ans.push_back(1);
        for(int i=1; i<a.size(); i++) {
            ans.push_back(a[i-1] * ans[i-1]);
        }
        
        int r = 1;
        for(int i=a.size()-1; i>=0; i--) {
            ans[i] = ans[i] * r;
            r = r * a[i];
            // calculating the right product on the fly
        }
        
        return ans;        
    }
};