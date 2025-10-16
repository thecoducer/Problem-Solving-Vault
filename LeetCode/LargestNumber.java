class Solution {
    public String largestNumber(int[] nums) {
        // convert nums to array of strings
        String[] numStrings = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            numStrings[i] = String.valueOf(nums[i]);
        }

        // nums = [10, 2]
        // 10 + 2 = 102
        // 2 + 10 = 210
        // 210 > 102
        // Sorting the numStrings using custom comparator
        Arrays.sort(numStrings, (a, b) -> (b + a).compareTo(a + b));

        // if the first element is zero then there are no larger elements to the right
        if (numStrings[0].equals("0")) {
            return "0";
        }

        // concatenate and build the result string
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < numStrings.length; i++) {
            sb.append(numStrings[i]);
        }
        return sb.toString();
    }
}