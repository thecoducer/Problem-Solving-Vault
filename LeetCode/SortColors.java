// https://leetcode.com/problems/sort-colors/

import java.util.Arrays;

public class SortColors {

    public static void sortColors(int[] nums) {
        int len = nums.length;
        int start = 0;
        int end = len - 1;

        // using two pointers, start and end
        // along with an iterator, i
        for (int i = 0; i < len && i <= end;) {
            if (nums[i] == 0) {
                swap(nums, start, i);
                start++; // creating room for 0s
                i++;
            } else if (nums[i] == 2) {
                swap(nums, end, i);
                end--; // creating room for 2s
            } else {
                i++; // leave 1s in the mid region
            }
        }
    }

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String args[]) {
        int[] nums = new int[]{2,0,2,1,1,0};
        sortColors(nums);
        Arrays.stream(nums).forEach(System.out::println);
    }
}
