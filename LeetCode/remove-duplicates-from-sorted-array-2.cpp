// https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/

class Solution {
public:
    int removeDuplicates(vector<int>& a) {
        
        int n = a.size();
        
        if(n <= 1) {
            return n;
        }
        
        // using two pointers and a counter approach
        
        int i = 0, j, count = 0;
        
        for(j=0; j<n; j++){
            
            if(j == 0 || a[j] == a[j-1]) {
                count++;
            }else{
                count = 1;
            }
            
            // if count is 1 or 2
            if(count < 3) {
                a[i++] = a[j];
            }
        }
        
        return i;
    }
};