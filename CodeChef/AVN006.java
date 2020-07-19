import java.math.BigInteger;
import java.util.Scanner;

class station{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-- > 0){
            BigInteger n = in.nextBigInteger();
            BigInteger a = in.nextBigInteger();
            BigInteger b = in.nextBigInteger();
            BigInteger c = in.nextBigInteger();

            BigInteger[] s = new BigInteger[3];
            s[0] = n.subtract(a);
            s[1] = n.subtract(b);
            s[2] = n.subtract(c);

            if(s[0].compareTo(s[1]) <= 0 && s[0].compareTo(s[2]) <= 0){
                System.out.println(a);
            }else if(s[1].compareTo(s[2]) <= 0 && s[1].compareTo(s[0]) <= 0){
                System.out.println(b);
            }else{
                System.out.println(c);
            }
        }
    }
}