#include<stdio.h>
#include<string.h>
#define MAX 1000

void subsequence_equality(char *arr);

int main()
{
        int t, i;
        char arr[MAX];

        scanf("%d", &t);
        for(i=1;i<=t;i++){
                scanf("%s", arr);
                subsequence_equality(arr);
        }
        return 0;
}
void subsequence_equality(char *arr)
{
        int i, j, count=0;

        for(i=0;i<strlen(arr);i++){
                for(j=i+1;j<strlen(arr);j++){
                        if(arr[i]==arr[j])
                                count++;
                }
        }
        if(count==0)
                printf("no\n");
        else
                printf("yes\n");
}
