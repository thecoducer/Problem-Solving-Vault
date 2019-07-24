import java.math.*;
import java.util.*;

class Solution{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        findSum(n);
        in.close();
    }
    static void findSum(int n){
        long sum = 0;
        for(int i=1;i<=n;i++){
            if(i % 10 == 0){
                sum += 0;
            }else{
                sum += fastExp(i, i, 10000000000L);
            }
        }
        System.out.println(sum);
    }

    static long fastExp(long base, long exponent, long mod){
        long result = 1;
        while(exponent > 0){
            if(exponent % 2 == 1){
                result = (result * base) % mod;
            }
            base = (base * base) % mod;
            exponent = exponent / 2;
        }
        return result % mod;
    }
}