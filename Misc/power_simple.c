#include<stdio.h>
int main(void){
    long x, n, r=1;
    printf("Enter x and n: ");
    scanf("%ld %ld", &x, &n);
    printf("%ld ^ %ld ", x, n);
    while(n--){
        r = r * x;
    }
    printf("= %ld\n", r);
}