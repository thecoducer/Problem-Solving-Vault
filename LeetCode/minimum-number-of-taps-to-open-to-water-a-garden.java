class Solution1 {

    // TC: O(N^2)
    // SC: O(1)
    public int minTaps(int n, int[] ranges) {
        int min, max, open;
        min = max = open = 0;

        while (max < n) {
            for (int i = 0; i < ranges.length; i++) {
                if (i - ranges[i] <= min && i + ranges[i] > max) {
                    max = i + ranges[i];
                }
            }

            if (min == max) {
                return -1;
            }

            min = max;
            open++;
        }

        return open;
    }
}

class Solution {

    /**
     * Using DP
     * TC: O(N)
     * SC: O(N)
     */
    public int minTaps(int n, int[] ranges) {
        int[] intervals = new int[n];
        Arrays.fill(intervals, -1);

        // Preparing the DP array.
        // The DP array stores the position of leftmost tap
        // that can water upto the rightmost tap.
        for (int i = 0; i < ranges.length; i++) {
            if (ranges[i] == 0) {
                continue;
            }
            int leftBound = Math.max(i - ranges[i], 0);
            int rightBound = Math.min(i + ranges[i], n);
            intervals[leftBound] = Math.max(intervals[leftBound], rightBound);
        }

        if (intervals[0] == -1) {
            return -1;
        }

        int open = 0, currEnd = 0, farthest = 0;
        
        // traverse through the length of the garden
        for (int i = 0; i < n; i++) {
            // if at any point i pointer crosses the farthest pointer
            // then whole garden cannot be watered
            if (farthest < i) {
                return -1;
            }

            // we get the rightmost location that can be watered
            // from our prefilled dp array
            farthest = Math.max(farthest, intervals[i]);

            // if each garden location i.e. ith point
            // matches with last reached point
            // then we can open a tap
            // this is like continuos line if you imagine the timeline diagram
            if (i == currEnd) {
                open++;
                currEnd = farthest;
            }
        }

        return farthest < n ? -1 : open;
    }
}

