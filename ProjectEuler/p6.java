import java.util.*;
import java.math.*;

class Solution{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-- > 0){
            int n = in.nextInt();
            long Sum = (n * (n + 1)) / 2;
            long SumSquares = (n * (n + 1) * ((2 * n) + 1)) / 6;
            long AbsDiff = Math.abs((Sum * Sum) - SumSquares);
            System.out.println(AbsDiff);
        }
        in.close();
    }
}
