class Solution {

    public int[][] construct2DArray(int[] original, int m, int n) {
        int len = original.length;

        // m * n gives us the counts of all cells in the matrix
        // if that count is not equal to the count of elements in the original array
        // then it is impossible to construct a 2D array out of the 1D array
        if (len != (m * n)) {
            return new int[0][0];
        }
        
        int result[][] = new int[m][n];

        // m = rows
        // n = columns

        for (int i = 0; i < len; i++) {
            result[i / n][i % n] = original[i];
        }

        return result;
    }
}
