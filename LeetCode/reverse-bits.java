public class Solution {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        int res = 0;
        
        // going through 32 bits
        for(int i=0;i<32;i++) {
            // right shifting the result and making room for new bits
            res = res << 1;
            
            // stamping the set bits in the result
            if((n & 1) == 1) {
                res = res + 1;
            }
            
            // left shifting the original number to discard off the already
            // processed bits
            n = n >> 1;
        }
        
        return res;
    }
}