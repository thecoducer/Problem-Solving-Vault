// https://www.hackerrank.com/challenges/mini-max-sum/problem

#include<stdio.h>
#define MAX 100000
int main(void)
{
    long long arr[MAX], min=0, max=0;
    int i, j, temp;

    for(i=1;i<=5;i++)
        scanf("%lld", &arr[i]);

    //bubble sort
    for(i=1;i<=5;i++)
        for(j=i+1;j<=5;j++)
            if(arr[i]>arr[j]){
                temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;}

    min=arr[1]+arr[2]+arr[3]+arr[4];
    max=arr[2]+arr[3]+arr[4]+arr[5];
    printf("%lld %lld", min, max);
}