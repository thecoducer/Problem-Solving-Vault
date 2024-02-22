class Solution {

    public int longestPalindrome(String s) {
        char[] str = s.toCharArray();
        Map<Character, Integer> charMap = new HashMap<>();

        // counting character occurrences
        for (int i = 0; i < str.length; i++) {
            charMap.put(str[i], charMap.getOrDefault(str[i], 0) + 1);
        }

        int sum = 0;
        boolean odd = false;

        // iterating through the map
        for (Map.Entry<Character, Integer> entry : charMap.entrySet()) {
            int count = entry.getValue();

            // if it's an even count, we add it to the sum
            if (count % 2 == 0) {
                sum += count;
            } else {
                // if it's an odd count, we subtract one from the odd count and make it even
                // also set the odd flag as true
                odd = true;
                sum += count - 1;
            }
        }

        // if we have encountered odd even once
        // we need to accomodate one character in our longest palindrome
        if (odd) {
            sum += 1;
        }

        return sum;
    }
}
