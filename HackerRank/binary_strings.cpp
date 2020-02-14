/** 
 * https://www.hackerrank.com/challenges/beautiful-binary-string/problem?isFullScreen=false
 * **/


#include<bits/stdc++.h>
using namespace std;

int main(){
    int n;
    string B;
    int ans=0;
    cin >> n;
    cin >> B;
    for(int i=2; B[i]; i++){
        if(B[i-2] == '0' && B[i-1] == '1' && B[i] == '0'){
            B[i] = '1';
            ans++;
        }
    }
    printf("%d", ans);
    return 0;
}
