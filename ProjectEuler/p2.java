import java.util.*;

class Solution{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-- > 0){
            long n = in.nextLong();
            System.out.println(SumEvenFibo(n));
        }
        in.close();
    }

    static long SumEvenFibo(long n){
        long first = 1, second = 2, next = 3, sum = 2;

        while(second < n){
            if(next % 2 == 0){
                sum += next;
            }
            next = first + second;
            first = second;
            second = next;
        }
        return sum;
    }
}