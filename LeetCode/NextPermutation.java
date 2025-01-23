import java.util.*;

class Solution {
    /**
     * [1,2,3] -> [1,3,2]
     * [2,1,5,3,4,0,0] -> [2,1,5,4,0,0,3]
     */
    public void nextPermutation(int[] A) {
        int len = A.length;
        int breakPoint = -1;

        // find the break point where A[i] is less than A[i+1]
        for (int i = len - 2; i >= 0; i--) {
            if (A[i] < A[i + 1]) {
                breakPoint = i;
                break;
            }
        }

        // we couldn't find a break point even after traversing the whole array
        // backwards
        // this means we have the last permutation number as input
        // so return the first lexicographically sorted permutation
        if (breakPoint == -1) {
            reverse(A, 0);
            return;
        }

        // find the next greater element backwards before the break point
        // swap it with element at the breakPoint
        for (int i = len - 1; i > breakPoint; i--) {
            if (A[i] > A[breakPoint]) {
                swap(A, i, breakPoint);
                break;
            }
        }

        // reverse the section after the break point
        reverse(A, breakPoint + 1);
    }

    private void reverse(int[] A, int start) {
        int end = A.length - 1;
        while (start < end) {
            swap(A, start, end);
            start++;
            end--;
        }
    }

    private void swap(int[] A, int m, int n) {
        int t = A[m];
        A[m] = A[n];
        A[n] = t;
    }
}

// TC: O(N)
// SC: O(1)