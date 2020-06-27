// https://www.hackerrank.com/challenges/breaking-best-and-worst-records/problem

#include <bits/stdc++.h>
using namespace std;

int main() {
    int n;
    int a[1001];

    cin >> n;

    for(int i=0;i<n;i++){
        cin >> a[i];
    }

    int highest = a[0], lowest = a[0], h_count = 0, l_count = 0;

    for(int i=0;i<n;i++){
        if(a[i] > highest){
            h_count++;
            highest = a[i];
        }
        
        if(a[i] < lowest){
            l_count++;
            lowest = a[i];
        }
    }

    cout << h_count << " " << l_count;

}
