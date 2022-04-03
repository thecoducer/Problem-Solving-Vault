// https://leetcode.com/problems/valid-palindrome-ii/

class Solution {
    public boolean validPalindrome(String s) {
        int len = s.length();
        int start = 0;
        int end = len - 1;
        
        while(start <= end) {
            if(s.charAt(start) == s.charAt(end)) {
                start++;
                end--;
            }else{
                return isPalindrome(s, start + 1, end) || isPalindrome(s, start, end - 1);
            }
        }

        return true;
    }

    boolean isPalindrome(String s, int start, int end) {
        while(start <= end) {
            if(s.charAt(start) != s.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        
        return true;
    }
}