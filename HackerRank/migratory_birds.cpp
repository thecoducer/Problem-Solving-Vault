// https://www.hackerrank.com/challenges/migratory-birds/problem

#include <bits/stdc++.h>
using namespace std;

int main() {
    int n, t;
    int nm[6]={0};

    cin >> n;

    for(int i=0;i<n;i++) {
        cin >> t;
        nm[t]++;
    }

    int max = nm[1], result = 1;
    for(int i=2;i<6;i++) {
        if(nm[i] > max) {
            max = nm[i];
            result = i;
        }else if(nm[i] == max) {
            result = result < i ? result : i;
        }
    }

    cout << result;
}