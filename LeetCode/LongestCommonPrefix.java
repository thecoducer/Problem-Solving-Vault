class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }

        // vertical scanning technique
        // imagine the original array as a 2D matrix
        // the idea here is to check characters in a single column matches or not
        // we pick the 0th string because we know that there is at least one string in strs
        var atLeastOneString = strs[0];
        // traversing columns
        for (int i = 0; i < atLeastOneString.length(); i++) {
            char currentChar = atLeastOneString.charAt(i);
            // traversing rows
            // j = 0 means the char in first row, ith column
            // so we can start from the second column and check that entire column
            // contains same char value
            for (int j = 1; j < strs.length; j++) {
                if (i == strs[j].length() || currentChar != strs[j].charAt(i)) {
                    return strs[0].substring(0, i);
                }
            }
        }
        return atLeastOneString;
    }
}