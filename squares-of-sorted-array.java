class Solution {

    public int[] sortedSquares(int[] nums) {
        int lastIndex, start, end;
        int[] result = new int[nums.length];

        start = 0;
        end = nums.length - 1;
        lastIndex = end;

        for (int i = 0; i < nums.length; i++) {
            int startNum = Math.abs(nums[start]);
            int endNum = Math.abs(nums[end]);

            if (startNum >= endNum) {
                result[lastIndex--] = startNum * startNum;
                start++;
            } else {
                result[lastIndex--] = endNum * endNum;
                end--;
            }
        }

        return result;
    }
}