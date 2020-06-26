// https://www.hackerrank.com/challenges/picking-numbers/problem

#include <bits/stdc++.h>
using namespace std;

int main() {
    int n, t, count[101] = {0}, max_subarray = INT_MIN;

    cin >> n;

    for(int i=0;i<n;i++){
        cin >> t;
        count[t]++;
        max_subarray = max(max_subarray, max(count[t]+count[t-1], count[t]+count[t+1]));
    }

    cout << max_subarray;
}