class Solution {
    public void nextPermutation(int[] a) {
        int len = a.length;
        int breakpoint = -1;

        // find the first smaller element from the right
        for (int i = len - 1; i > 0; i--) {
            if (a[i - 1] < a[i]) {
                breakpoint = i - 1;
                break;
            }
        }

        if (breakpoint == -1) {
            reverse(a, 0);
            return;
        }

        // swap it with an element that is just larger than it from the right
        for (int i = len - 1; i > breakpoint; i--) {
            if (a[i] > a[breakpoint]) {
                swap(a, breakpoint, i);
                break;
            }
        }

        // at this point we have a number that is lexicographically
        // larger than the input number but we need the next permutation
        // so we need to reverse the number after the breakpoint
        // because we know that the number has a decreasing sequence after the breakpoint
        reverse(a, breakpoint + 1);
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