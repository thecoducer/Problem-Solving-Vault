class Solution {
public:
    string reverseWords(string s) {
        int start = 0;
        
        for(int i=0;i<s.length();i++) {
            int end = i;
            
            if(s[i] == ' ') {
                // reverse(start, end)
                // reverse from start till end-1
                reverse(s.begin()+start, s.begin()+end);
                // end here is pointing to whitespace
                // the next element is the first character of the next word
                start = end + 1;
            }
        }
        
        // for the last word
        reverse(s.begin()+start, s.end());
        
        return s;
    }
};