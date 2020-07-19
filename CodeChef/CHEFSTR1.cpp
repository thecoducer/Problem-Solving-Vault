// https://www.codechef.com/JULY20B/problems/CHEFSTR1

#include<bits/stdc++.h> 
using namespace std;
#define MAX 1000000

int main() {
    int t, n;
    long long s[MAX], skip = 0L;

    cin >> t;

    while(t--) {
        cin >> n;

        for(long long i=0;i<n;i++) {
            cin >> s[i];
        }

        for(long long i=1;i<n;i++) {
            skip += abs(s[i] - s[i-1]) - 1;
        }

        cout << skip << endl;

        skip = 0;
    }
}