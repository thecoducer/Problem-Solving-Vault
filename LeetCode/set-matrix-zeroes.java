class Solution {
    /**
     * TC: O(N * M)
     * SC: O(1)
     */
    public void setZeroes(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int col0 = 1; // just a flag
        // matrix[0][0] is an overlapping cell for rows and cols
        // so we are using another variable as a flag if zeroth col contains any zero

        for(int i=0;i<rows;i++) {
            if(matrix[i][0] == 0) {
                col0 = 0;
            }
            for(int j=1;j<cols;j++) {
                if(matrix[i][j] == 0) {
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }

        // traversing in reverse direction
        for(int i=rows-1;i>=0;i--) {
            for(int j=cols-1;j>=1;j--) {
                if(matrix[i][0] == 0 || matrix[0][j] == 0) {
                    matrix[i][j] = 0;
                }
            }
            if(col0 == 0) {
                matrix[i][0] = 0;
            }
        }
    }
}