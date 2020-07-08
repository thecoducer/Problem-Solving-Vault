//https://www.hackerrank.com/challenges/equality-in-a-array/problem

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

    int x = 0, max = INT_MIN;
    for(auto e : map) {
        x = x ^ e.second;
        
        if(e.second > max) {
            max = e.second;
        }
    }

    if(x == 0) {
        cout << n - 1;
    }else{
        cout << n - max;
    }
}
