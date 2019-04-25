#include<stdio.h>
#define MAX 100000

int main(){
    int t, n, arr[MAX], i, first, second;

    scanf("%d", &n);

    //input elements
    for(i=0;i<n;i++){
        scanf("%d", &arr[i]);
    }
    
    //initialize
    first=arr[0];
    second=arr[1];
    
    for(i=1;i<n;i++){
        if(arr[i]>first){
            second=first;
            first=arr[i];
        }
        //update second if arr[i] is in between first and second
        else if(arr[i]>second && arr[i]!=first){
            second=arr[i];
        }
    }
    
    printf("%d\n",second%first);
    /* maximum of Ai%Aj comes out to be the modulus of two largest unique elements 
    i.e the largest no. and the second largest no. in the sequence */

    return 0;
}