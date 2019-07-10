/**
 * 
 * https://www.geeksforgeeks.org/modulo-1097-1000000007/
 */
import java.io.*;
import java.math.BigInteger;
import java.util.*;

class redone{
    static final int mod = 1000000007;
    public static void main(String args[]) throws IOException{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list = new ArrayList<Integer>();
        int t;
        int temp, size;
        long n;

        //t = Integer.parseInt(in.readLine());
        if(in.readLine()!=null){
            t = Integer.parseInt(in.readLine());
        }else{
            t=1;
        }

        while(t > 0){
            if(in.readLine()!=null){
                n = Long.parseLong(in.readLine());
            }else{
                n=1;
            }

            for(int i=1;i<=n;i++){
                list.add(i);
            }
            /* if user inputs the numbers in the list then write
              while(in.hasNextInt()){
                list.add(in.nextInt());
            }
            */
           
            for(int i=1;i<n;i++){ //repeat n-1 times
                size = list.size();
                int x = list.get(0);
                int y = list.get(size-1);
                list.remove(0);
                size = list.size();
                list.remove(size-1);
                int one = (x+y+(x*y))%mod;
                list.add(one);
            } 
            size = list.size();
            System.out.println(list.get(size-1));
            t--;
        }
        return;
    }
}