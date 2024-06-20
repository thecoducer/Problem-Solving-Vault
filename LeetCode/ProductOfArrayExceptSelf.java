// https://leetcode.com/problems/product-of-array-except-self/

import java.util.Arrays;
import java.util.stream.Collectors;

public class ProductOfArrayExceptSelf {

    public static int[] productExceptSelfUsingExtraSpace(int[] nums) {
        int len = nums.length;

        // fill prefix array
        int[] prefix = new int[len];
        prefix[0] = 1;
        for (int i = 1; i < len; i++) {
            prefix[i] = prefix[i - 1] * nums[i - 1];
        }

        // fill suffix array
        int[] suffix = new int[len];
        suffix[len - 1] = 1;
        for (int i = len - 2; i >= 0; i--) {
            suffix[i] = suffix[i + 1] * nums[i + 1];
        }

        // multiply each prefix and suffix to get the ans array
        int[] ans = new int[len];
        for (int i = 0; i < len; i++) {
            ans[i] = prefix[i] * suffix[i];
        }

        return ans;
    }

    public static int[] productExceptSelf(int[] nums) {
        int len = nums.length;
        int ans[] = new int[len];
        ans[0] = 1;

        // calculating the prefix product and storing it in ans array
        for (int i = 1; i < len; i++) {
            ans[i] = ans[i - 1] * nums[i - 1];
        }

        // calculating the suffix product on the fly and refilling the ans array
        int curr = 1;
        for (int i = len - 1; i >= 0; i--) {
            ans[i] *= curr;
            curr *= nums[i]; // suffix product gets calculated here
        }

        return ans;
    }

    public static void main(String args[]) {
        System.out.println(Arrays.stream(productExceptSelf(new int[] { 1, 2, 3, 4 }))
                .mapToObj(String::valueOf)
                .collect(Collectors.joining(", ")));

        System.out.println(Arrays.stream(productExceptSelfUsingExtraSpace(new int[] { 1, 2, 3, 4 }))
                .mapToObj(String::valueOf)
                .collect(Collectors.joining(", ")));
    }
}
