class Solution {
    public void setZeroes(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int col0 = 1;

        /*
         * Intuition: We traverse the original matrix and mark
         * rows and columns need to be filled with zero. We use the 0th row
         * and column of the original matrix to store this information instead
         * of some extra space. That's the catch here to have O(1) space complexity.
         * 
         * matrix[0][0] is an overlapping cell for both rows and cols.
         * So we set col0 to zero if 0th column contains a zero element.
         */

        for (int i = 0; i < rows; i++) {
            // if 0th column contains a zero element
            if (matrix[i][0] == 0) {
                col0 = 0;
            }

            for (int j = 1; j < cols; j++) {
                // if a cell is zero
                // mark cells in first row and column
                if (matrix[i][j] == 0) {
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }

        // Traverse the matrix backwards
        // The first row and column know which rows and columns 
        // need to be entirely filled with zeros.
        for (int i = rows - 1; i >= 0; i--) {
            for (int j = cols - 1; j >= 1; j--) {
                // we check the first row and column
                // and set the matrix[i][j] as zero
                if (matrix[i][0] == 0 || matrix[0][j] == 0) {
                    matrix[i][j] = 0;
                }
            }
            if (col0 == 0) {
                matrix[i][0] = 0;
            }
        }
    }
}

// TC: O(N * M)
// SC: O(1)