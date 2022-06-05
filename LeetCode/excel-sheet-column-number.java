class Solution1 {
    /** similar to binary to decimal conversion
     * example: columnTitle = "BCM"
     * (13 * 26^0) + (3 * 26^1) + (2 * 26^2)
     * = 1443
     **/ 
    
    public int titleToNumber(String columnTitle) {
        int len = columnTitle.length();
        int colNum = 0;
        int pow = 1;
        
        for(int i = len - 1; i >= 0; i--) {
            char c = columnTitle.charAt(i);
            colNum += (c - 64) * pow;
            pow *= 26;
        }
        
        return colNum;
    }
}

class Solution {
    /**
     * integer representation using its base
     * suppose for integer, n = 254
     *  = (2 * 10 * 10) + (5 * 10) + (4)
     * and for columnTitle = "BCM"
     * = (2 * 26 * 26) + (3 * 26) + (13)
     * = 1443
     */
    public int titleToNumber(String columnTitle) {
        int len = columnTitle.length();
        int columnNumber = 0;
        
        for(int i = 0; i < len; i++) {
            int currentColumn = columnTitle.charAt(i) - 'A' + 1;
            columnNumber = columnNumber * 26 + currentColumn;
        }
        
        return columnNumber;
    }
}