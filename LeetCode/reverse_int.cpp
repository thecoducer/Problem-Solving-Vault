/** https://leetcode.com/problems/reverse-integer/ **/


class Solution {
public:
    int reverse(int x) {
        long long int temp, rev=0;
        while(x!=0){
            temp = x % 10;
            rev = rev*10 + temp;
            if(rev > INT_MAX || rev < INT_MIN) //return 0 when integer overflows
                    return 0;
            x = x/10;
        }
        return rev;
    }
};