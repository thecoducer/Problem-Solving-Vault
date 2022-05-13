class Solution {
    // TC: O(n)
    // SC: O(n+1)
    // using DP
    public int[] countBits(int n) {
        int[] result = new int[n+1];
        result[0] = 0;
        
        for(int i=1;i<=n;i++) {
            // (i - 1) flips all the bits of i starting from the rightmost set bit, including it too
            // i & (i - 1) turns off the rightmost set bit of i
            // the number that the above expression would return is definitely present in our result array
            // this is the overlapping subproblem scenario
            result[i] = 1 + result[i & (i - 1)];
        }
        
        return result;
    }
}

class Solution1 {
    // TC: O(n log v)
    // SC: O(1)
    public int[] countBits(int n) {
        int[] result = new int[n+1];
        
        for(int i=0;i<=n;i++) {
            result[i] = countSetBits(i);
        }
        
        return result;
    }
    
    // using Brian Kernighan's algorithm
    // log(v)
    int countSetBits(int v) {
        int count = 0;
        
        while(v > 0) {
            if((v & 1) == 1) {
                count++;
            }
            v = v >> 1;
        }
        
        return count;
    }
}