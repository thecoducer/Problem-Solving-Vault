class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int len = flowerbed.length;
        for(int i=0;i<len;i++) {
            if(flowerbed[i] == 0) {
                boolean emptyLeftPlot = (i == 0) || flowerbed[i - 1] == 0;
                boolean emptyRightPlot = (i == flowerbed.length - 1) || flowerbed[i + 1] == 0;
                
                if(emptyLeftPlot && emptyRightPlot) {
                    flowerbed[i] = 1;
                    n--;
                    
                    // stopping the traversal to the end of the flowerbed
                    // as soon as the value of n is zero or less then zero
                    if(n <= 0) {
                        return true;
                    }
                }
            }
        }
        
        return n <= 0;
    }
}