import java.util.*;

class Solution {
    public boolean isIsomorphic(String s, String t) {
        Map<Character, Character> map = new HashMap<>();
        Set<Character> set = new HashSet<>();

        int m = s.length();
        int n = t.length();

        // if the length of both the strings don't match then they cannot be isomorphic strings
        if(m != n) {
            return false;
        }

        for(int i=0;i<m;i++) {
            // if the character is already mapped
            if(map.containsKey(s.charAt(i))) {
                // if the mapped value of s[i] doesn't match t[i], it's not isomorphic
                if(map.get(s.charAt(i)) != t.charAt(i)) {
                    return false;
                }
                // if the character is not mapped
            }else{
                // if t[i] is already mapped to some other character in s
                // test case: 
                // s = "eggs"
                // t = "adda"
                if(set.contains(t.charAt(i))) {
                    return false;
                }

                map.put(s.charAt(i), t.charAt(i));
                set.add(t.charAt(i));
            }
        }
        return true;
    }
}