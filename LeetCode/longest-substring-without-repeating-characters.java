class Solution {

    // TC: O(N)
    // SC: O(N)
    // used sliding window technique
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int i, j, maxLen;
        i = j = maxLen = 0;

        while (j < s.length()) {
            if (!set.contains(s.charAt(j))) {
                set.add(s.charAt(j));
                j++;
                maxLen = Math.max(maxLen, set.size());
            } else {
                set.remove(s.charAt(i));
                i++;
            }
        }

        return maxLen;
    }
}
