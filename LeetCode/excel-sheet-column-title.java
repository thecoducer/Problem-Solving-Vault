class Solution {
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