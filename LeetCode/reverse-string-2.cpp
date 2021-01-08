class Solution {
public:
    string reverseStr(string s, int k) {
        int n = s.length();
        
        for(int i=0;i<n;i+=2*k) {
            int start = i, end = min(i + k - 1, n-1);
            
            while(start < end) {
                swap(s[start++], s[end--]);
            }
        }
        
        return s;
    }
};