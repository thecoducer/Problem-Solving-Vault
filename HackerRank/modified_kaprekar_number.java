// https://www.hackerrank.com/challenges/kaprekar-numbers/problem

import java.util.*;
class ModifiedKaprekar{
    public static void main(String[] args){
        boolean found = false;
        Scanner in = new Scanner(System.in);
        long p = in.nextInt();
        long q = in.nextInt();
        for(long i=p;i<=q;i++){
            if(isModKaprekar(i)!=0){
                System.out.print(i + " ");
                found = true;
            }
        }
        if(!found)
            System.out.println("INVALID RANGE");
    }
    
    static long isModKaprekar(long n){
        if(n==1)
            return n;
        
        long sqr = n * n;
        String num = String.valueOf(sqr);
        int sqrlen = num.length();
        String right = num.substring(sqrlen / 2);
        String left  = num.substring(0, sqrlen / 2);
        int l = (left.isEmpty())  ? 0 : Integer.parseInt(left);
        int r = (right.isEmpty()) ? 0 : Integer.parseInt(right);
        if(l+r == n){
            return n;
        }
        return 0;
    }
}
