class Solution {
public:
    bool isIsomorphic(string s, string t) {
        // map to store mapping from characters of s to t
        unordered_map<char, char> m;
        // set to store already mapped characters
        unordered_set<char> st;
        
        // if strings are of different length, then they cannot be isomorphic
        if(s.length() != t.length()) {
            return false;
        }
        
        for(int i=0;i<s.length();i++) {     
            
            // if the character is already mapped
            if(m.find(s[i]) != m.end()) 
            {
                // if the mapped value of s[i] don't match with t[i], it's not isomorphic
                if(m[s[i]] != t[i]) {
                    return false;
                }
            // if the character is not mapped, seen for the first time
            }else{
                // if t[i] is already mapped to some other character in s, return false
                if(st.find(t[i]) != st.end()) {
                    return false;
                }
                
                m[s[i]] = t[i];
                st.insert(t[i]);
            }
        }
        
        return true;
    }
};