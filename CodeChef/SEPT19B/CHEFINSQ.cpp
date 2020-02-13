#include <bits/stdc++.h>
using namespace std;
#define MAX 50

int main(){
    int t, n, k, num[MAX];

    cin >> t;

    while(t--){
        
        scanf("%d %d", &n, &k);

        for(int i=0;i<n;i++){
            cin >> num[i];
        }

        cout << sol(num, n, k) << endl;
    }
}

int sol(int num[], int n, int k){
    int count = 0, min, sum = 0;

    for(int i=0; i<n; i++){
        for(int j=i; j<n; j+=(k-1)){
            for(int m=j; m<k; m++){
                
            }
        }
    }
}