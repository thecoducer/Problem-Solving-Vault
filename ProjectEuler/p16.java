import java.util.*;
import java.math.*;

class Solution{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-- > 0){
            int n = in.nextInt();
            BigInteger x = new BigInteger("2"); //we need to raise 2 to the power of n
            x = x.pow(n); //result of pow() can be large
            long result = SumDigits(x);
            System.out.println(result);
        }
        in.close();
    }

    static long SumDigits(BigInteger x){
        long sum = 0;
        char[] Digits = x.toString().toCharArray();
        for(char d:Digits){
            //convert characters in char array to digit using
            //radix. Use 10 for decimal
            //radix means base of a system of numeration
            sum = sum + Character.digit(d, 10);
        }
        return sum;
    }
}