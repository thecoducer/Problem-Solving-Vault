// https://leetcode.com/problems/plus-one/

class Solution {
public:
    vector<int> plusOne(vector<int>& digits) {
        int n = digits.size();
        
        // if last digit is not 9,increment it by 1
        if(digits[n-1] != 9) {
            digits[n-1] += 1;
        } else {
            // if last digit is 9
            for(int i=n-1; i>=0; i--) {
                if(digits[i] == 9 && i != 0) {
                    digits[i] = 0;
                }else if(digits[i] == 9 && i == 0) {
                    digits[i] = 0;
                    digits.insert(digits.begin(), 1);
                }else{
                    digits[i] += 1;
                    break;
                }
            }
        }        
        return digits;
    }
};