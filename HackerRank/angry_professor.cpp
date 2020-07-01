// https://www.hackerrank.com/challenges/angry-professor/problem

#include <bits/stdc++.h>
using namespace std;
#define MAX 1001

int main() {
    int t, n, k, x, c = 0;

    cin >> t;

    while(t--) {
        cin >> n >> k;
        for(int i=0;i<n;i++) {
            cin >> x;
            if(x <=0){
                c++;
            }
        }

        if(c < k){
            cout << "YES\n";
        }else{
            cout << "NO\n";
        }

        c=0;
    }
}