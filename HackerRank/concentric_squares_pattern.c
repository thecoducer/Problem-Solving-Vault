// https://www.hackerrank.com/challenges/printing-pattern-2/problem

#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>
#define min(a, b) ((a) < (b) ? (a) : (b))

int main() 
{
    int n, len, row, col, min;
    scanf("%d", &n);
  	
    len = (n*2) - 1;
    
    for(row = 0; row < len; row++) {
        for(col = 0; col < len; col++) {
            min = min(row, col);
            min = min(min, len-row-1);
            min = min(min, len-col-1);
            printf("%d ", n-min);
        }
        printf("\n");
    }

    return 0;
}