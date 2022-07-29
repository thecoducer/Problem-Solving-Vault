public class Solution {
    // you need to treat n as an unsigned value
    public int reverseBits(int n) {
        if(n == 0) {
            return 0;
        }
        
        int res = 0;
        
        // going through 32 bits
        for(int i=0;i<32;i++) {
            // right shifting the result and making room for new bits
            res <<= 1;

            // stamping the set bits in the result
            res += (n & 1);
    
            // left shifting the original number to discard the LSB
            n >>= 1;
        }
        
        return res;
    }
}