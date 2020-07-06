// https://www.hackerrank.com/challenges/strange-advertising/problem

#include<bits/stdc++.h>
using namespace std;

int viralAdvertising(int n) {
    int shared = 5, liked, total_likes = 0;

    for(int i=1; i<=n; i++) {
        liked = floor(shared/2);
        shared = liked * 3;
        total_likes += liked;
    }

    return total_likes;
}

int main()
{
    int n;
    cin >> n;
    cout << viralAdvertising(n);
    return 0;
}
