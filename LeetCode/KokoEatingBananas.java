class Solution {
    // We use binary search on answers technique to solve this.
    // We first need to find the range on which we are going to apply the binary search.
    // This range consists of possible answers.
    public int minEatingSpeed(int[] piles, int h) {
        int maxEatingSpeed = Arrays.stream(piles).max().getAsInt();
        return findMinEatingSpeed(piles, 1, maxEatingSpeed, h);
    }

    public int findMinEatingSpeed(int[] piles, int low, int high, int h) {
        while (low <= high) {
            int mid = low + (high - low) / 2;
            int totalHours = calculateTotalHours(piles, mid);
            if (totalHours > h) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return low;
    }

    public int calculateTotalHours(int[] piles, int mid) {
        int totalHours = 0;
        for (int i = 0; i < piles.length; i++) {
            totalHours += Math.ceil((double) piles[i] / (double) mid);
        }
        return totalHours;
    }
}
