#include<bits/stdc++.h>
using namespace std;
#define MAX 200

int main(void){
    int t, n, goals[MAX], fouls[MAX], goals_p, fouls_p, total = 0, max = INT_MIN;
    cin >> t;
    while(t--){
        cin >> n;
        for(int i=0;i<n;i++){
            cin >> goals[i];
        }
        for(int i=0;i<n;i++){
            cin >> fouls[i];
        }

        for(int i=0;i<n;i++){
            goals_p = fouls_p = total = 0;

            goals_p = goals[i] * 20;
            fouls_p = fouls[i] * 10;
            total = goals_p - fouls_p;

            if(total < 0){
                total = 0;
            }

            if(total > max){
                max = total;
            }
        }
        cout << max << endl;
        max = 0;
    }
    return 0;
}