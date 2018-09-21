#include<iostream>
#include<cmath>
using namespace std;
int main(void){
    double a, b;
    cout<<"Enter a & b: ";
    cin>>a>>b;
    printf("%g mod %g = %g", a, b, fmod(a, b));
    return 0;
}