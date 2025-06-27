class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        if ((m * k) > bloomDay.length) {
            return -1;
        }
        int earliestDay = Arrays.stream(bloomDay).min().getAsInt();
        int latestDay = Arrays.stream(bloomDay).max().getAsInt();
        return findMinimumViableDay(bloomDay, earliestDay, latestDay, m, k);
    }

    public int findMinimumViableDay(int[] bloomDay, int low, int high, int m, int k) {
        int resultDay = -1;
        while (low <= high) {
            int midDay = low + (high - low) / 2;
            int bouquets = countBouquetsOnOrBeforeDay(bloomDay, midDay, k);
            if (bouquets >= m) {
                resultDay = midDay; // viable day found
                high = midDay - 1; // try to find an even earlier viable day
            } else {
                low = midDay + 1; // need more bloom time
            }
        }
        return resultDay;
    }

    public int countBouquetsOnOrBeforeDay(int[] bloomDay, int targetDay, int k) {
        int consecutiveBloomed = 0, totalBouquets = 0;
        for (int day : bloomDay) {
            if (day <= targetDay) {
                consecutiveBloomed++;
                if (consecutiveBloomed == k) {
                    totalBouquets++;
                    consecutiveBloomed = 0;
                }
            } else {
                // we reset the counter if we encounter an unbloomed flower
                consecutiveBloomed = 0;
            }
        }
        return totalBouquets;
    }
}
