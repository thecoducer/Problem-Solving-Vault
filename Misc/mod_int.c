/** Modulo operation for int inputs **/
#include<stdio.h>
int main(void){
    int a, b, r, q;
    printf("Enter a & b: ");
    scanf("%d %d", &a, &b);
    //q is a member of set Z i.e Integers
    q = a / b;
    r = a - (b*q);
    printf("%d mod %d = %d", a, b, r);
    return 0;
}