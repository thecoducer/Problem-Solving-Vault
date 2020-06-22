// https://www.hackerrank.com/challenges/missing-numbers/problem

#include <bits/stdc++.h>
using namespace std;
#define MAX 1000000

int main() {
    unordered_map<long, int> bmap;
    unsigned long long int n, m;
    long arr[MAX], temp;

    cin >> n;

    for(unsigned long long int i=0;i<n;i++){
        cin >> arr[i];
    }

    cin >> m;

    for(unsigned long long int i=0;i<m;i++){
        cin >> temp;
        if(bmap.find(temp) == bmap.end()){
            bmap[temp] = 1;
        }else{
            bmap[temp]++;
        }
    }

    for(unsigned long long int i=0;i<n;i++){
        if(bmap.find(arr[i]) != bmap.end()){
            bmap[arr[i]]--;
        }
    }
    vector<long> nv;

    for(auto i : bmap){
        if(i.second != 0){
            nv.push_back(i.first);
        }
    }

    sort(nv.begin(), nv.end());

    for(auto i : nv){
        cout << i << " ";
    }
}