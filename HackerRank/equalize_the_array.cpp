// https://www.hackerrank.com/challenges/equality-in-a-array/problem

#include <bits/stdc++.h>
using namespace std;

int main() {
    int n, t;
    unordered_map<int, int> map;

    cin >> n;

    for(int i=0;i<n;i++) {
        cin >> t;
        map[t]++;
    }

    int max = INT_MIN;
    for(auto e : map) {
        if(e.second > max) {
            max = e.second;
        }
    }

    cout << n - max;
    return 0;
    
}