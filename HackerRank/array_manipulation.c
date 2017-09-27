// https://www.hackerrank.com/challenges/crush/problem

#include<stdio.h>
#define MAX 10000

int update(long* arr, int a, int b, long k);

int main(void)
{
    long arr[MAX]={0}, m, n, k;
    int a, b, i, max;

    scanf("%ld%ld", &n, &m);

    for(i=1;i<=m;i++)
    {
        scanf("%d%d%ld", &a, &b, &k);
        update(arr, a, b, k);
    }

    max=arr[1];
    for(i=1;i<=n;i++)
        if(arr[i]>max)
            max=arr[i];

    printf("%d", max);
    return 0;
}

int update(long* arr, int a, int b, long k)
{
    int i;

    for(i=a;i<=b;i++)
        arr[i]=arr[i]+k;

    return 0;
}