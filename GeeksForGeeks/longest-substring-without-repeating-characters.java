class Solution{
    static int longestSubstrDistinctChars(String str){
        int n = str.length();
        int left = 0, right = 0;
        int maxLength = 0;
        int maxLeft = 0, maxRight = 0;
        Set<Character> set = new HashSet<>();
        
        // sliding window with two pointers approach
        
        while(left < n && right < n) {
            if(!set.contains(str.charAt(right))) {
                // it's not a repeating character
                // let's also store the max left and max right indexes to print the substring
                if((right - left + 1) > maxLength) {
                    maxLength = Math.max(maxLength, right - left + 1);
                    maxLeft = left;
                    maxRight = right;
                }
                
                set.add(str.charAt(right));
                right++;
            } else {
                // it's a repeating character
                set.remove(str.charAt(left));
                left++;
            }
        }
        
        for(int i = maxLeft; i <= maxRight; i++) {
            //System.out.print(str.charAt(i));
        }
        
        return maxLength;
    }
}