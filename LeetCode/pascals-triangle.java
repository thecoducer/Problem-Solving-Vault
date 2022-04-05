import java.util.ArrayList;
import java.util.List;

class Solution {
    /**
     * 
     * TC: O(numRows ^ 2)
     * SC: O(numRows ^ 2)
     */
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> matrix = new ArrayList<List<Integer>>();
        List<Integer> row, prevRow = null;

        for(int i=0;i<numRows;i++) {
            row = new ArrayList<>();
            for(int j=0;j<=i;j++) {
                // edges should have 1
                if(j == 0 || j == i) {
                    row.add(1);
                }else{
                    // inner elements
                    row.add(prevRow.get(j-1) + prevRow.get(j));
                }
            }
            prevRow = row;
            matrix.add(row);
        }

        return matrix;
    }
}