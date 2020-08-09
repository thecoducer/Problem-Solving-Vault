// https://leetcode.com/problems/valid-palindrome/

class Solution {
public:
    bool isPalindrome(string s) {
        if(s.empty()) {
            return true;
        }
        
        int start = 0, end = s.length() - 1;
        
        while(start < end) {
            if(tolower(s[start]) == tolower(s[end])) {
                start++;
                end--;
            }else if(!isalpha(s[start]) && !isdigit(s[start])) {
                start++;
            }else if(!isalpha(s[end]) && !isdigit(s[end])) {
                end--;
            }else {
                return false;
            }
        }
        
        return true;
    }
};