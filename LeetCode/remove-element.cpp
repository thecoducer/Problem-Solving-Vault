// https://leetcode.com/problems/remove-element/

class Solution {
public:
    int removeElement(vector<int>& a, int val) {
        
        // using two pointers
        // i is the slow pointer
        // and j is the fast pointer
        
        int i = 0, j;
        for(j=0; j<a.size(); j++) {
            if(a[j] != val) {
                a[i] = a[j];
                i++;
            }
        }
        
        return i;
    }
};