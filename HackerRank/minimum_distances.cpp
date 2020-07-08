// https://www.hackerrank.com/challenges/minimum-distances/problem

#include <bits/stdc++.h>
using namespace std;
#define MAX 1001

int main() {
    int n, a[MAX];
    unordered_map<int, int> map;

    cin >> n;

    for(int i=0;i<n;i++) {
        cin >> a[i];
        map[a[i]] = i; // stores the index for the last occurence of an element
    }

    int result = INT_MAX;

    for(int i=0;i<n;i++) {
        if(map.find(a[i]) != map.end() && i != map[a[i]]) {
            result = min(result, abs(i - map[a[i]]));
        }
    }

    if(result == INT_MAX) {
        cout << "-1";
    }else{
        cout << result;
    }

}
