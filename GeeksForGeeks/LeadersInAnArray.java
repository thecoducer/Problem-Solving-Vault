class Solution {
    static ArrayList<Integer> leaders(int nums[]) {
        int len = nums.length;
        ArrayList<Integer> leaders = new ArrayList<>();

        // The idea is to iterate the array backwards
        // and store the largest element found at each iteration
        int currentLead = nums[len - 1];
        leaders.add(currentLead);
        for(int i=len - 2; i>=0; i--) {
            if(nums[i] >= currentLead) {
                currentLead = nums[i];
                leaders.add(currentLead);
            }
        }

        Collections.reverse(leaders);
        return leaders;
    }
}