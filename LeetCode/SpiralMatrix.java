class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        int rowLen = matrix.length;
        int colLen = matrix[0].length;
        int startRow = 0;
        int startCol = 0;
        int endRow = rowLen - 1;
        int endCol = colLen - 1;

        while (startRow <= endRow && startCol <= endCol) {
            // traverse from left to right along the top row
            for (int i = startCol; i <= endCol; i++) {
                result.add(matrix[startRow][i]);
            }
            startRow++;

            // traverse from top to bottom along the right column
            for (int i = startRow; i <= endRow; i++) {
                result.add(matrix[i][endCol]);
            }
            endCol--;

            // traverse from right to left
            if (startRow <= endRow) {
                for (int i = endCol; i >= startCol; i--) {
                    result.add(matrix[endRow][i]);
                }
                endRow--;
            }

            // traverse bottom to top
            if (startCol <= endCol) {
                for (int i = endRow; i >= startRow; i--) {
                    result.add(matrix[i][startCol]);
                }
                startCol++;
            }
        }

        return result;
    }
}