// https://www.hackerrank.com/challenges/plus-minus/problem

#include<stdio.h>
#define MAX 1000
int main(void)
{
    int arr[MAX], n, i;
    float positive_count, negative_count, zero_count;

    positive_count=negative_count=zero_count=0;

    scanf("%d", &n);
    for(i=0;i<n;i++)
        scanf("%d", &arr[i]);

    for(i=0;i<n;i++)
    {
        if(arr[i]==0)
            zero_count++;
        else if(arr[i]>0)
            positive_count++;
        else
            negative_count++;
    }

    printf("%.6f\n", (positive_count/n));
    printf("%.6f\n", (negative_count/n));
    printf("%.6f", (zero_count/n));
}

/**(experiment) instead of using linear search to scan the whole array can't we use binary search. Log n will help for large inputs.**/


