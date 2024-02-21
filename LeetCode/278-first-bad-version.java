/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

      public class Solution extends VersionControl {

        public int firstBadVersion(int n) {
            return findFirstBadVersion(0, n);
        }
    
        public int findFirstBadVersion(int low, int high) {
            if (low > high) {
                return low;
            }
    
            int mid = low + (high - low) / 2;
    
            if (isBadVersion(mid)) {
                return findFirstBadVersion(low, mid - 1);
            } else {
                return findFirstBadVersion(mid + 1, high);
            }
        }
    }
    