// intuitive solution
class Solution {
    public String convertToTitle(int colNum) {
        StringBuilder sb = new StringBuilder();
        
        while(colNum > 0) {
            int asciiIndex = colNum % 26;
            
            // edge case
            if(asciiIndex == 0) {
                asciiIndex = 26;
                colNum -= 26;
            }
            
            char c = (char) (64 + asciiIndex);
            sb.insert(0, c);
            
            colNum /= 26;
        }
        
        return sb.toString();
    }
}


class Solution1 {
    public String convertToTitle(int columnNumber) {
        StringBuilder sb = new StringBuilder();
        
        while(columnNumber > 0) {
            char c = (char) ('A' + (columnNumber - 1) % 26);
            sb.insert(0, c);
            columnNumber = (columnNumber - 1) / 26;
        }
        
        return sb.toString();
    }
}