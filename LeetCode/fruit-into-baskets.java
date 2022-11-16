class Solution {
    public int totalFruit(int[] fruits) {
        int lastFruit = -1;
        int secondLastFruit = -1;
        int lastFruitCount = 0;
        int currMax = 0;
        int max = 0;
        
        for(int fruit : fruits) {
            if(fruit == lastFruit || fruit == secondLastFruit) {
                currMax++;
            }else{
                // if get a new type of fruit
                // we discard the second last type of fruit from our window
                currMax = lastFruitCount + 1;
            }
            
            if(fruit == lastFruit) {
                lastFruitCount++;
            }else{
                // new fruit
                lastFruitCount = 1;
                secondLastFruit = lastFruit;
                lastFruit = fruit;
            }
            
            max = Math.max(currMax, max);
        }
        
        return max;
    }
}