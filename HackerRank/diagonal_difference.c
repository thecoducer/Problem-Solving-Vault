// https://www.hackerrank.com/challenges/diagonal-difference/problem

#include<stdio.h>
#include<math.h>
#define MAX 100

int main(void)
{
    int n, arr[MAX][MAX], p_sum=0, s_sum=0, i, j;

    scanf("%d", &n);

    for(i=0;i<n;i++)
        for(j=0;j<n;j++)
            scanf("%d", &arr[i][j]);

    //sum of primary diagonal
    for(i=0;i<n;i++)
        p_sum+=arr[i][i];

    //sum of secondary diagonal
    j=n-1;
    for(i=0;i<n;i++)
    {
        s_sum+=arr[i][j];
        j--;
    }

    printf("%d", abs(p_sum-s_sum));
}
