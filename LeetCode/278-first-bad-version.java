/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

      public class Solution extends VersionControl {

        // used binary search technique

        public int firstBadVersion(int n) {
            return findFirstBadVersion(0, n);
        }
    
        public int findFirstBadVersion(int low, int high) {
            if (low > high) {
                return low;
            }
    
            int mid = low + (high - low) / 2; // prevents integer overflow
    
            // remember our goal here is to find the first bad version
            // so even if we found the bad version we have to find the first one
            if (isBadVersion(mid)) {
                return findFirstBadVersion(low, mid - 1);
            } else {
                return findFirstBadVersion(mid + 1, high);
            }
        }
    }
    