/* https://www.codechef.com/CCCO2017/problems/EXP007 */
/* Problem Code - EXP007 */

#include<stdio.h>
#define MAX 1000

int cbsa(int n, int *arr);
int append(int x, int y);

int main()
{
        int arr[MAX], i, n, t, j;

        scanf("%d", &t); //test case
        for(j=1;j<=t;j++){
                scanf("%d", &n);
                for(i=0;i<n;i++){
                        scanf("%d", &arr[i]);
                }
                cbsa(n, arr); //comparison-based sorting algorithm
        }
}

int cbsa(int n, int *arr)
{
        int i, j, temp;

        for(i=1;i<n;i++)
                for(j=0;j<n-i;j++){
                        if(append(arr[j], arr[j+1])<append(arr[j+1], arr[j])){
                                temp=arr[j];
                                arr[j]=arr[j+1];
                                arr[j+1]=temp;
                        }
                }
        for(i=0;i<n;i++)
                printf("%d", arr[i]);
        printf("\n");
}
int append(int x, int y)
{
        int pow=10;
        while(y>=10){
                pow=pow*10;
                y=y/10;
        }
        return (x*pow+y);
}
