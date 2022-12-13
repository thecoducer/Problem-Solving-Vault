class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int max = 0;
        
        // put all elements to a hashset
        // for faster lookup
        for(int e : nums) {
            set.add(e);    
        }
        
        for(int e : nums) {
            if(!set.contains(e - 1)) {
                int j = e;
                
                int currMax = 1;
                while(set.contains(j + 1)) {
                    j++;
                    currMax++;
                }
                
                max = Math.max(currMax, max);
            }
        }
        
        return max;
    }
}