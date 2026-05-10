class Solution {
    public int beautySum(String s) {
        int len = s.length();
        int beautySum = 0;

        for (int i = 0; i < len; i++) {
            Map<Character, Integer> freq = new HashMap<>();
            for (int j = i; j < len; j++) {
                freq.put(s.charAt(j), freq.getOrDefault(s.charAt(j), 0) + 1);

                int maxFreqChar = Integer.MIN_VALUE;
                int minFreqChar = Integer.MAX_VALUE;

                for (int f : freq.values()) {
                    maxFreqChar = Math.max(f, maxFreqChar);
                    minFreqChar = Math.min(f, minFreqChar);
                }

                beautySum += (maxFreqChar - minFreqChar);
            }
        }

        return beautySum;
    }
}