// https://www.hackerrank.com/challenges/the-hurdle-race/problem

#include <bits/stdc++.h>
using namespace std;

int main() {
    int n, k, t, max = INT_MIN;

    cin >> n >> k;

    for(int i=0;i<n;i++) {
        cin >> t;
        if(t > max) {
            max = t;
        }
    }

    if(k < max) {
        cout << max - k;
    }else{
        cout << "0";
    }

}
