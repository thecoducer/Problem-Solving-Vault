class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int heaviestPackage = Arrays.stream(weights).max().getAsInt();
        int totalWeightOfAllPackages = Arrays.stream(weights).sum();
        return findLeastCapacity(weights, days, heaviestPackage, totalWeightOfAllPackages);
    }

    public int findLeastCapacity(int[] weights, int days, int low, int high) {
        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (calculateNumberOfDaysTaken(weights, mid) > days) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return low;
    }

    public int calculateNumberOfDaysTaken(int[] weights, int capacity) {
        int days = 1, load = 0;

        for (int i = 0; i < weights.length; i++) {
            if (load + weights[i] > capacity) {
                // start aggregating load for the next day
                days++;
                load = weights[i];
            } else {
                load += weights[i];
            }
        }

        return days;
    }
}