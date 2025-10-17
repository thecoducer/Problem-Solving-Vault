class Solution {
    // similar to what we did for finding the next permutation
    // here we try to find a breakPoint where the value peaks
    public int[] prevPermOpt1(int[] arr) {
        int n = arr.length;
        int breakPoint = -1;

        for (int i = n - 1; i > 0; i--) {
            if (arr[i - 1] > arr[i]) {
                breakPoint = i - 1;
                break;
            }
        }

        if (breakPoint == -1) {
            return arr;
        }

        for (int i = n - 1; i > breakPoint; i--) {
            if (arr[i] < arr[breakPoint] && arr[i] != arr[i - 1]) {
                swap(arr, i, breakPoint);
                break;
            }
        }

        return arr;
    }

    private void swap(int[] a, int m, int n) {
        int t = a[m];
        a[m] = a[n];
        a[n] = t;
    }
}