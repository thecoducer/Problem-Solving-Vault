// https://www.hackerrank.com/challenges/repeated-string/problem

#include <stdio.h>
#include<string.h>
#define MAX 100

int main(void)
{
    char str[MAX];
    long n, count=0;
    int i;

    gets(str);
    scanf("%ld", &n);

    for(i=0;i<strlen(str);i++)
        if(str[i]=='a')
            count++;

    count*=(n/strlen(str));

    for(i=0;i<n%strlen(str);i++)
        if(str[i]=='a')
            count++;

    printf("%ld", count);
    return 0;
}
