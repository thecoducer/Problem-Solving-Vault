class Solution {
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
