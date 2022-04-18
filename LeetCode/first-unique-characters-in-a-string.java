class Solution {
    /**
     * 
     * TC: O(N)
     * SC: O(26) ~ O(1)
     */
    public int firstUniqChar(String s) {
        int[] freq = new int[26];
        
        for(int i=0;i<s.length();i++) {
            int index = s.charAt(i) - 'a';
            freq[index]++;
        }
        
        for(int i=0;i<s.length();i++) {
            int index = s.charAt(i) - 'a';
            if(freq[index] == 1) {
                return i;
            }
        }
        
        return -1;
    }
}