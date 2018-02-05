// https://projecteuler.net/problem=1

#include<stdio.h>
int main()
{
        long n, sum, t, i, j=0;

        scanf("%ld", &t);
        for(i=1;i<=t;i++){
                scanf("%ld", &n);
                sum=j=0;
                while(j<n){ //natural nos. below 1000
                        if(j%3==0 || j%5==0) //finding multiples of 3 and 5
                        sum=sum+j;
                j++;
                }
                printf("%ld\n", sum);
        }
        return 0;
}