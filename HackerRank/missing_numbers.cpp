#include <bits/stdc++.h>
using namespace std;
#define MAX 1000000

int main() {
    int a[MAX] = {0}, n, m, t;

    cin >> n;
    for(int i=0;i<n;i++){
        cin >> t;
        a[t]--;
    }

    cin >> m;
    for(int i=0;i<m;i++){
        cin >> t;
        a[t]++;
    }

    for(int i=0;i<MAX;i++){
        if(a[i] > 0){
            cout << i << " ";
        }
    }

}