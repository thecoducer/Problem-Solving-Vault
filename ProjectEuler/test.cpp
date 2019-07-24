//takes a lot of time
#include <iostream>
using namespace std;
# define ll long long int
int a[100000001];
int main() {
int n;
cin>>n;
for(ll i=3;i<=100000000;i+=2) 
    a[i]=1;
for(ll i=3;i<=100000000;i+=2)
{
    if(a[i])
    {
        for(ll j=i*i;j<=100000000;j+=2*i) a[j]=0;
    }
}
int prime=1;
for(ll i=2;i<=100000000;i++){ 
    if(a[i]) prime++;
    if(prime==n) {cout<<i<<endl;break;} }

}
