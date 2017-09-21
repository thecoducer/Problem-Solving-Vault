// https://www.hackerrank.com/challenges/compare-the-triplets/problem

#include<stdio.h>
#define MAX 3

int main(void)
{
    int a[MAX], b[MAX];
    int alice=0, bob=0, i;

    scanf("%d%d%d", &a[0], &a[1], &a[2]);
    scanf("%d%d%d", &b[0], &b[1], &b[2]);

    for(i=0;i<3;i++)
    {
        if(a[i]>b[i])
            alice++;
        else if(a[i]<b[i])
            bob++;
    }
    printf("%d %d", alice, bob);
}
