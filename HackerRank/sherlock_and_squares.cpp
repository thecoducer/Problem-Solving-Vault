// https://www.hackerrank.com/challenges/sherlock-and-squares/problem

#include <bits/stdc++.h>
using namespace std;

int main()
{
    long long int q, a, b;

    cin >> q;

    while(q--) {
        cin >> a;
        cin >> b;

        // to find number of digits between a given range, a to b
        // we do b - a + 1
        // similarly to find the number of squares between a range
        // we do sqrt(b) - sqrt(a) + 1

        cout << floor(sqrt(b)) - ceil(sqrt(a)) + 1 << endl;

        // take floor of b because we need to consider numbers before b
        // and take ceil of a because we need to consider numbers after a 
    }

    return 0;
}
