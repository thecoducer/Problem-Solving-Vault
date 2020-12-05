// https://leetcode.com/problems/two-sum/

class Solution {
public:
    vector<int> twoSum(vector<int>& a, int target) {
        unordered_map<int, int> m; // element and its index mapping
        vector<int> res;
        
        m[a[0]] = 0; // first index
        
        for(int i=1; i<a.size(); i++) {
            int diff = target - a[i];
            
            if(m.find(diff) != m.end()) {
                res.push_back(m[diff]);
                res.push_back(i);
            }
            
            m[a[i]] = i;
        }
        
        return res;
    }
};