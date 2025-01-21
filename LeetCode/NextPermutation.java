import java.util.*;

class Solution {
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

        // exhausted iterating the array still we couldn't find a break point
        // this means we are currently at the last permutation
        // so return the first lexicographically sorted permutation
        if (breakPoint == -1) {
            reverse(A, 0);
            return;
        }

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