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

            if (digits[i] < digits[index]) {
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

        // Use a 0-9 fixed array to store rightmost indexes of digits in num
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

class Solution {
    public int maximumSwap(int num) {
        // space optimized greedy
        // use two pointers to store smallest and largest value indexes
        char[] digits = String.valueOf(num).toCharArray();
        int n = digits.length;
        int smallestDigitIndex = -1, largestDigitIndex = -1, maxDigitIndex = -1;

        // right to left
        for (int i = n - 1; i >= 0; i--) {
            if (maxDigitIndex == -1 || digits[i] > digits[maxDigitIndex]) {
                maxDigitIndex = i;
            } else if (digits[i] < digits[maxDigitIndex]) {
                largestDigitIndex = maxDigitIndex;
                smallestDigitIndex = i;
            }
        }

        if (smallestDigitIndex != -1 && largestDigitIndex != -1) {
            char t = digits[smallestDigitIndex];
            digits[smallestDigitIndex] = digits[largestDigitIndex];
            digits[largestDigitIndex] = t;
        }

        return Integer.parseInt(String.valueOf(digits));
    }
}

