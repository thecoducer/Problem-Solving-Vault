// https://www.hackerrank.com/challenges/a-very-big-sum/problem

#include<stdio.h>
#define MAX 100
int main(void)
{
    long long arr[MAX], sum=0;
    int n, i;

    scanf("%d", &n);
    for(i=0;i<n;i++)
        scanf("%lld", &arr[i]);

    for(i=0;i<n;i++)
        sum=sum+arr[i];
    
    printf("%lld", sum);
    return 0;
}