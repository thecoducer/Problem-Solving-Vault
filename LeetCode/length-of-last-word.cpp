// https://leetcode.com/problems/length-of-last-word/

class Solution {
public:
    int lengthOfLastWord(string s) {
        int len = s.length();
        int count = 0, flag = 1;
        
        for(int i=len-1; i >= 0; i--) {
            if(s[i] == ' ' && flag) {
                continue; //skip the trailing whitespaces
            }
            
            if(isalpha(s[i])){
                count++;
                flag = 0;
                
                if(i-1 >= 0 && s[i-1] == ' ') {
                    break;
                }
            }
        }
        return count;
    }
};