// https://www.hackerrank.com/challenges/utopian-tree/problem

#include <bits/stdc++.h>
using namespace std;

int main() {
    int t, n, height = 1;

    cin >> t;

    while(t--) {
        cin >> n;

        if(n == 0) {
            cout << "1" << endl;
        }else{
            bool spring = true, summer = false;
            height = 1;

            for(int i=1;i<=n;i++) {
                if(spring) {
                    height = height * 2;
                    spring = false;
                    summer = true;
                }else {
                    height = height + 1;
                    summer = false;
                    spring = true;
                }
            }
            cout << height << endl;
        }
    }
    return 0;
}