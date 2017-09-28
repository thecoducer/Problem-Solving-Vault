// https://www.hackerrank.com/challenges/lowest-triangle/problem

#include<stdio.h>
#include<math.h>

int main(void)
{
    long a, b, h;

    scanf("%ld%ld", &b, &a);
    h=(a*2)/b;
    if((a*2)%b==0)
        printf("%ld", h);
    else
        printf("%ld", ++h);
    return 0;
}