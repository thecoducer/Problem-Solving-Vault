/** Modulo operation for real number inputs **/
#include<stdio.h>
int main(void){
    double a, b, r;
    int q;
    printf("Enter a & b: ");
    scanf("%lf %lf", &a, &b);
    //q is a member of set Z i.e Integers
    q = a / b;
    r = a - (b*q);
    printf("%g mod %g = %g", a, b, r);
    return 0;
}