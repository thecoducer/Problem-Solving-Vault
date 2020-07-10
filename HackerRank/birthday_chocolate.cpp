// https://www.hackerrank.com/challenges/the-birthday-bar/problem

#include <bits/stdc++.h>
using namespace std;
#define MAX 101

// used the sliding window technique

int birthday(int s[], int d, int m, int n) {
    int sum = 0, count = 0;

    for(int i=0;i<m;i++) {
        sum += s[i];
    }

    if(sum == d) {
        count++;
    }

    for(int i=m;i<n;i++) {
        sum -= s[i-m];
        sum += s[i];

        if(sum == d) {
            count++;
        }
    }

    return count;
}

int main()
{
    int s[MAX], d, m, n;

    cin >> n;
    for(int i=0;i<n;i++) {
        cin >> s[i];
    }
    cin >> d >> m;
    cout << birthday(s, d, m, n) << endl;
}
