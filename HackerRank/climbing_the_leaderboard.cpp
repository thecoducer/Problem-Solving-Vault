// https://www.hackerrank.com/challenges/climbing-the-leaderboard/problem

#include <bits/stdc++.h>
using namespace std;
#define MAX 200001

int main() {
    int n, m, alice[MAX], lb[MAX], rank[MAX], i, j, rank_len;

    // input
    cin >> n;
    for(i=0;i<n;i++) {
        cin >> lb[i];
    }

    cin >> m;
    for(i=0;i<m;i++) {
        cin >> alice[i];
    }

    // populate the rank array
    // also remove duplicates from the leaderboard
    j = 1; rank_len = 0;
    for(i=0;i<n;i++) {
        if(i < 1) {
            rank[j++] = lb[i];
            rank_len++;
        }

        if(rank[j-1] == lb[i]) {
            continue;
        }else{
            rank[j++] = lb[i];
            rank_len++;
        }
    }

    // find alice's rank after she finishes each game
    j = rank_len;
    for(i=0;i<m;i++) {

        while(alice[i] > rank[j] && j >= 0) {
            j--;
        }

        if(alice[i] == rank[j]) {
            cout << j << endl;
        }else if(alice[i] < rank[j]) {
            cout << j + 1 << endl;
        }else{
            cout << "1" << endl;
        }

    }

    return 0;
}
