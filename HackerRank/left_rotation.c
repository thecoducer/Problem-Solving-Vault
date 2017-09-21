// https://www.hackerrank.com/challenges/array-left-rotation/problem

#include<stdio.h>
#define MAX 100000

int main(void)
{
    int a[MAX], i, n, d;

    scanf("%d%d", &n, &d);

    for(i=0;i<n;i++)
        scanf("%d", &a[i]);

    for(i=0;i<n;i++)
        printf("%d ", a[(i+d)%n]);

    return 0;
}
