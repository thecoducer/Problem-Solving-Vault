class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        // we've seen in two sum II problem that sorted array
        // makes it easier to solve the problem
        Arrays.sort(nums);
        int n = nums.length;
        
        List<List<Integer>> result = new ArrayList<>();
        
        for(int i=0;i<n;i++) {    
            // to skip duplicates in the sorted array
            if(i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            
            // We have to solve a+b+c = 0
            // We get the value of 'a' from i
            // Using the two pointer approach that we used in
            // two sum II, we'll try to find 'b' and 'c'
            int start = i + 1, end = n - 1, sum = 0;
            
            while(start < end) {
                // sum = a + b + c
                sum = nums[i] + nums[start] + nums[end];
                
                if(sum > 0) {
                    end--;
                } else if(sum < 0) {
                    start++;
                } else {
                    result.add(Arrays.asList(nums[i], nums[start], nums[end]));
                    
                    // to skip duplicates present in between the start and end pointers
                    start++;
                    while(nums[start] == nums[start - 1] && start < end) {
                        start++;
                    }
                }
            }
        }
        return result;
    }
}