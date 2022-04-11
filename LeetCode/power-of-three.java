// https://leetcode.com/problems/power-of-three/

public class Solution {
    public boolean isPowerOfThree(int n) {
        // integer limitations
        int log3OfIntMaxValue = (int) (Math.log(Integer.MAX_VALUE) / Math.log(3));
        int maxPowerOfThree = (int) Math.pow(3, log3OfIntMaxValue);
        return n > 0 && maxPowerOfThree % n == 0;
    }
}