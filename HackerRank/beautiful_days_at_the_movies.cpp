// https://www.hackerrank.com/challenges/beautiful-days-at-the-movies/problem

#include <bits/stdc++.h>
using namespace std;

int reverseNum(int n) {
    int rev = 0, temp;

    while(n != 0) {
        temp = n % 10;
        rev = (rev * 10) + temp;
        n = n / 10;
    }

    return rev;
}

int beautifulDays(int start, int end, int k) {
    int bDays = 0, rev;

    for(int i=start; i<=end; i++) {
        rev = reverseNum(i);

        if((i-rev) % k == 0) {
            bDays++;
        }
    }

    return bDays;
}

int main()
{
    int i, j, k;

    cin >> i >> j >> k;

    cout << beautifulDays(i, j, k) << endl;

    return 0;
}
