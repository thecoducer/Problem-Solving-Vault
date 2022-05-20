class Solution {

    // TC: O(N)
    // SC: O(N)
    // used sliding window technique
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int i, j, maxLen;
        i = j = maxLen = 0;
        
        // i points to the start of the window
        // and j points to the end of the window

        while (j < s.length()) {
            if (!set.contains(s.charAt(j))) {
                set.add(s.charAt(j));
                j++;
                maxLen = Math.max(maxLen, (j - i));
            } else {
                set.remove(s.charAt(i));
                i++;
            }
        }
        
        // prints the longest substring
        System.out.println(s.substring(i, j));

        return maxLen;
    }
}
