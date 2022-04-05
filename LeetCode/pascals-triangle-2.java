import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> row = new ArrayList<>();
        List<Integer> prevRow = new ArrayList<>();

        for(int i=0;i<=rowIndex;i++) {
            for(int j=0;j<=i;j++) {
                if(j == 0 || j == i) {
                    row.add(1);
                }else{
                    row.add(prevRow.get(j-1) + prevRow.get(j));
                }
            }
            prevRow = row;
            row = new ArrayList<>();
        }

        return prevRow;
    }
}