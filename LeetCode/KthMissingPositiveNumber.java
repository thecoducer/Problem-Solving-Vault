/*
 * O(log N) solution
 */
class Solution {
    public int findKthPositive(int[] arr, int k) {
        int low = 0, high = arr.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            // Suppose you're iterating through the array.
            // At any ith position in the 0-indexed array, the expected value is (i + 1).
            // We know that the array is sorted in an increasing order.
            // Hence, arr[i] - (i + 1) will give us the number of missing elements
            // in the number sequence before ith position.
            int missingBeforeMid = arr[mid] - (mid + 1);

            // if the number of missing elements is greater than k
            // we then need to move to the left half of the array
            if (missingBeforeMid > k) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        // after the binary search ends, low is the first index where missing count >= k
        // example: [1, 2, 3, 4], k = 2
        // after BS, low will be at 4.
        // the array has no missing elements
        // therefore we return low + k = 4 + 2 = 6
        return low + k;
    }
}


/*
 * O(N) Solution
 * 
 * suppose the array starts with 8, and you are told to find 5th missing element.
 * Now since array starts with 8 ,it means number 1 to 7 are missing.
 * so 5th missing element is 5 itself (because all numbers before 5 are missing)
 * (1,2,3,4,5). similar is the case for 1st to 7th missing element.
 * 
 * Now what if the array starts with 2 i.e for ex [2,8] and ur told to find 5the missing element.
 * here 5 is not the answer, because all number before 5 are not missing, one number is found i.e 2, 
 * so the 5th number is actually 6 (1,3,4,5,6) (5 incremented by 1 since one number is found)
 * 
 * but what if array had a number <= 6 , ex 3 i.e [2,3,8] then 6 wont be the answer 
 * since one more number <=6 is found , the missing numbers are [1,4,5,6,7] so again we increment 6 to 7.
 * so we need to keep incrementing K unless all elements in array are less than K,
 * with this K shifts by one for each element <= K found in the list.
 */
class Solution {
    public int findKthPositive(int[] arr, int k) {
        for (int a : arr) {
            if (a <= k) {
                k++;
            } else {
                break;
            }
        }
        return k;
    }
}