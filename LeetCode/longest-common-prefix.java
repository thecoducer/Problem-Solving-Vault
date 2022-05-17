class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length == 0 || strs == null) {
            return "";
        }
        
        // used the vertical scanning technique
                
        // column
        for(int i=0;i<strs[0].length();i++) {
            char c = strs[0].charAt(i);
            // row
            for(int j=1;j<strs.length;j++) {
                if(i == strs[j].length() || c != strs[j].charAt(i)) {
                    return strs[0].substring(0, i);
                }
            }
        }
        
        return strs[0];
    }
}