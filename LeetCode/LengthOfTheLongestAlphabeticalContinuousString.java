class Solution {
    public int longestContinuousSubstring(String s) {
        int count = 1;
        int max = 1;

        for (int i = 1; i < s.length(); i++) {
            // The difference between any two consecutive characters in an
            // alphabetical continuous string should be 1.
            // This gurantees the continuity.
            if (s.charAt(i) - s.charAt(i - 1) == 1) {
                count++;
                max = Math.max(count, max);
            } else {
                count = 1;
            }
        }

        return max;
    }
}