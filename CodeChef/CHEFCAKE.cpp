#include<bits/stdc++.h>
using namespace std;

long factorial(long num) {
    long fact = 1;

    if(num == 0 || num == 1) {
        return 1;
    }
    for(long i=2;i<=num;i++){
        fact = fact * i;
    }
    return fact;
}

int main() {
    long t, n, y;

    cin >> t;
    while(t--) {
        cin >> n;

        long digits_sum = 0;
        long ones = 0;

        for(long i=0;i<n;i++) {
            cin >> y;
            digits_sum += y;
            ones = (ones * 10) + 1;
        }
        
        cout << factorial(n-1) * digits_sum * ones << endl;
    }
    return 0;
}