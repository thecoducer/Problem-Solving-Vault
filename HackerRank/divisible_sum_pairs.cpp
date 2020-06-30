// https://www.hackerrank.com/challenges/divisible-sum-pairs/problem
//
// Solution explained here: https://youtu.be/9qPtxAY9bKA

#include <bits/stdc++.h>
using namespace std;
#define MAX 101

int main() {
    int n, k, a[MAX], rem[MAX] = {0}, pairs_count = 0;

    cin >> n >> k;
    for(int i=0;i<n;i++) {
        cin >> a[i];
    }

    int mod, comp;
    for(int i=0;i<n;i++) {
        mod = a[i] % k;
        comp = (mod == 0 ? 0 : (k - mod));
        if(rem[comp] > 0){
            pairs_count += rem[comp];
        }
        rem[mod]++;
    }

    cout << pairs_count;
}