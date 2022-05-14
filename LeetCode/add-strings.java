class Solution {
    public String addStrings(String num1, String num2) {
        final int base = 10;
        int carry = 0, sum = 0;
        int a = num1.length() - 1, b = num2.length() - 1;
        StringBuilder sb = new StringBuilder();
        
        while(a >= 0 || b >= 0 || carry > 0) {
            sum = carry;
            
            if(a >= 0) {
                sum += num1.charAt(a) - '0';
                a--;
            }
            
            if(b >= 0) {
                sum += num2.charAt(b) - '0';
                b--;
            }
            
            carry = sum / base;
            sb.insert(0, (sum % base));
        }
        
        return sb.toString();
    }
}