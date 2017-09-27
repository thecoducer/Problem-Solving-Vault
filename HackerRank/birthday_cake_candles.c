// https://www.hackerrank.com/challenges/birthday-cake-candles/problem

#include<stdio.h>
#define MAX 100000

int main(void)
{
    long long n, height[MAX], max;
    int i, count=0;

    scanf("%lld", &n);
    for(i=0;i<n;i++)
        scanf("%lld", &height[i]);
    
    max=height[0];
    for(i=0;i<n;i++)
        if(max<height[i])
            max=height[i];
        else if(max==height[i])
            ++count;

    printf("%d", count);
    return 0;
}