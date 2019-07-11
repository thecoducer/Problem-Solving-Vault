import java.util.*;
class Solution{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-- > 0){
            int n = in.nextInt();
            System.out.println(findLCM(n));
        }
        in.close();
    }
    static long findLCM(int n){
        long result = 1;
        for(int i=2; i<=n; i++){
            result = (result * i) / findGCD(result, i);
        }
        return result;
    }
    static long findGCD(long a, long b){
        //Finding GCD using Euclid's Algorithm
        if(b == 0){
            return a;
        }
        return findGCD(b, a % b);
    }
}