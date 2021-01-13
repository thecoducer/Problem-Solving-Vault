class Solution {
public:
    bool backspaceCompare(string s, string t) {
        
        // if we traverse the strings from the start we will come
        // to know later that which characters will get deleted and which won't.
        // So, the idea here is to traverse the string from the back.
        // This way we get to know which characters will get deleted and we skip them
        
        int i = s.length() - 1, j = t.length() - 1;
        int skipS = 0, skipT = 0;
        
        while(i >= 0 || j >= 0) { // both strings can be of different lengths
            
            // find next possible char in s that doesn't get deleted
            while(i >= 0) {
                if(s[i] == '#') {
                    skipS++; i--;
                }else if(skipS > 0) {
                    skipS--; i--;
                }else break;
            }
            
            // find next possible char in t that doesn't get deleted
            while(j >= 0) {
                if(t[j] == '#') {
                    skipT++; j--;
                }else if(skipT > 0) {
                    skipT--; j--;
                }else break;
            }
            
            // after processing the backspaces if the characters are different
            if(i >= 0 && j >= 0 && s[i] != t[j]) {
                return false;
            }
            
            // if we've finished traversing a string
            // and still have some characters to traverse in another string
            if((i >= 0) != (j >= 0)) {
                return false;
            }
            
            i--; j--;
        }
        
        return true;
    }
};
