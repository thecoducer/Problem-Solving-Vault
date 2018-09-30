/**
https://www.codechef.com/problems/JDELAY
**/

#include<iostream>
using namespace std;
#define MAX 100

int main(void){
    int s[MAX], j[MAX], n, t, c=0;
    cin>>t;
    while(t--){
        cin>>n;
        for(int i=0;i<n;i++){
            scanf("%d %d", &s[i], &j[i]);
        }
        for(int i=0;i<n;i++){
            if((j[i]-s[i])>5){
                ++c;
            }
        }
        cout<<c<<"\n";
        c=0;
    }
}