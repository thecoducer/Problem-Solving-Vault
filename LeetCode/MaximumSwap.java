class Solution {
    public int maximumSwap(int num) {
        char[] digits = String.valueOf(num).toCharArray();
        int n = digits.length;

        // tracking the largest digit to the right for 
        // each position in digits
        int[] maxValueIndexToRight = new int[n];
        maxValueIndexToRight[n - 1] = n - 1;
        for (int i = n - 2; i >= 0; i--) {
            maxValueIndexToRight[i] = digits[i] > digits[maxValueIndexToRight[i + 1]] ? i : maxValueIndexToRight[i + 1];
        }

        // finding the leftmost position where a smaller digit
        // can be replaced by a larger digit from the right
        for (int i = 0; i < n; i++) {
            int index = maxValueIndexToRight[i];

            if (digits[index] > digits[i]) {
                //swap
                char t = digits[index];
                digits[index] = digits[i];
                digits[i] = t;
                return Integer.parseInt(String.valueOf(digits));
            }
        }

        return num;
    }
}

TC: O(N)
SC: O(N)


class Solution {
    public int maximumSwap(int num) {
        char[] digits = String.valueOf(num).toCharArray();
        int n = digits.length;

        int[] rightmostIndex = new int[10];
        for (int i = 0; i < n; i++) {
            rightmostIndex[digits[i] - '0'] = i;
        }

        for (int i = 0; i < n; i++) {
            for (int j = 9; j > digits[i] - '0'; j--) {
                if (rightmostIndex[j] > i) {
                    char t = digits[rightmostIndex[j]];
                    digits[rightmostIndex[j]] = digits[i];
                    digits[i] = t;
                    return Integer.parseInt(String.valueOf(digits));
                }
            }
        }

        return num;
    }
}

TC: O(N)
SC: O(1)

