// https://www.hackerrank.com/challenges/counting-valleys/problem

#include <bits/stdc++.h>
using namespace std;
#define MAX 1000000

int countingValleys(int n, string s) {
    int level = 0, valley = 0;

    for(int i=0;i<n;i++) {
        if(s[i] == 'U') {
            level++;
        }else{
            level--;
        }

        if(level == 0 && s[i] == 'U') {
            valley++;
        }
    }

    return valley;
}

int main()
{
    int n;
    string s;
    cin >> n;
    cin >> s;
    cout << countingValleys(n, s);
    return 0;
}
