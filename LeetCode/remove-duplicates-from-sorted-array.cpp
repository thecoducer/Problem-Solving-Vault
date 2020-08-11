// https://leetcode.com/problems/remove-duplicates-from-sorted-array/

class Solution {
public:
    int removeDuplicates(vector<int>& a) {
        
        // using slow and fast pointers approach
        
        int n, i, j;
        
        n = a.size();
        
        if(n == 0)
            return 0;
        
        i = 0;
        for(j=1; j<n; j++) {
            if(a[j] != a[i]) {
                a[++i] = a[j];
            }
        }
        
        return i+1;
    }
};