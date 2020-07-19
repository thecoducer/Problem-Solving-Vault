#include <bits/stdc++.h>
#define ll long long
using namespace std;

int main()
{
    ll t, n;
    cin >> t;

    while(t--) {
        cin >> n;
        
        string s;
        cin >> s;

        map<char, ll> m;
        for(ll i=0;i<n;i++) {
            m[s[i]]++;
        }

        int flag = 0;
        for(ll i=0;i<n;i++) {
            if(m[s[i]] % 2 != 0) {
                flag = 1;
                break;
            }
        }

        if(flag) {
            cout << "NO" << endl;
        }else{
            cout << "YES" << endl;
        }
    }
    return 0;
}