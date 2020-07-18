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

        long digit_sum = 0;
        for(long i=0;i<n;i++) {
            cin >> y;
            digit_sum += y;
        }

        long tot_permutations = factorial(n) / n;
        digit_sum *= tot_permutations;
        long result = 0;

        for(long i=1, j=1;i<=n;i++) {
            result += (j * digit_sum);
            j *= 10;
        }
        cout << result << endl;
    }
    return 0;
}