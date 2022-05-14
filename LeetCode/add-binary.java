class Solution {
    public String addBinary(String a, String b) {
        final int base = 2;
        int carry = 0, sum = 0;
        int i = a.length() - 1, j = b.length() - 1;
        StringBuilder sb = new StringBuilder();
        
        while(i >= 0 || j >= 0 || carry == 1) {
            sum = carry;
            
            if(i >= 0) {
                sum += a.charAt(i) - '0';
                i--;
            }
            
            if(j >= 0) {
                sum += b.charAt(j) - '0';
                j--;
            }
            
            carry = sum / base;
            // sum >> 1 will yield same result because (right shift) divides a number by 2
            sb.insert(0, (sum % base));
            // sum & 1 will also yield same result because (and) gives us the remainder after dividing by 2
        }
        
        return sb.toString();
    }
}