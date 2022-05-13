/**
 * class Solution {
public:
    int hammingWeight(uint32_t n) {
        int count = 0;
        while(n > 0) {
            cout << n << endl;
            count++;
            n = n & (n-1);
        }
        return count;
    }
};
 */

public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int count = 0;
        
        // the passed n is a signed integer here in case of Java
        // therefore the number can be negative too
        // so we keep a check for n != 0
        while(n != 0) {
            count++;
            n = n & (n - 1);
        }
        
        return count;
    }
}