/**
https://www.codechef.com/problems/PRIME1
**/
#include <iostream>
using namespace std;

bool isprime(int p);

int main() {
	int t;
	long m, n;
	
	cin>>t;
	while(t--){
	    cin>>m;
	    cin>>n;
	    
	    for(int i=m;i<=n;i++){
	        if(i!=1 && isprime(i)){
	            cout<<i<<"\n";
	        }
	    }
	}
	return 0;
}

bool isprime(int p){
    for(int i=2;i*i<=p;i++){
        if(p%i==0){
           return false;
        }
    }
    return true;
}
