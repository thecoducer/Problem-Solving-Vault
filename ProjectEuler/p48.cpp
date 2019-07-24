#include<iostream>
#include<cmath>
using namespace std;
#define ll unsigned long long

void findSum(int n);
long fastExp(ll base, ll exponent, ll mod);

    int main(void){
        int n;
        cin>>n;
        findSum(n);
        return 0;
    }
    void findSum(int n){
        ll sum = 0;
        for(int i=1;i<=n+1;i++){
            if(i % 10 == 0){
                sum += 0;
            }else{
                sum += fastExp(i, i, 10000000000);
            }
        }
        cout<<sum%100000000000;
    }

    long fastExp(ll base, ll exponent, ll mod){
        ll result = 1;
        while(exponent > 0){
            if(exponent % 2 == 1){
                result = (result * base) % mod;
            }
            base = (base * base) % mod;
            exponent = exponent / 2;
        }
        return result % mod;
    }