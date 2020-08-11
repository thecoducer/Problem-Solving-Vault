// https://leetcode.com/problems/palindrome-number/
// I learned this different and interesting approach.

class Solution {
public:
    bool isPalindrome(int n) {
        
        // Negative numbers cannot be palindrome
        // Also if the last digit of the number is 0
        // the first digit of the number also needs to be 0
        // Only 0 satisfy this condition
        if(n < 0 || (n % 10 == 0 && n != 0)) {
            return false;
        }
        
        // if the reverse of half of the number is 
        // equal to the other half then it's a palindrome
        // When x > revnum, we've reached the middle of the number
        int revnum = 0;
        while(n > revnum) {
            revnum = (revnum * 10) + (n % 10);
            n = n / 10;
        }
        
        // when length is an odd number, we need to get rid of the middle digit
        // since the middle digit doesn't matter in palindrome
        return n == revnum || n == revnum / 10;
        
    }
};