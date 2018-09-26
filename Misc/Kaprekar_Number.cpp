#include<iostream>
#include<cmath>
using namespace std;

bool check_kaprekar(long k);

int main(void){
    long n;
    cout<<"Enter a no.: ";
    cin>>n;
    if(check_kaprekar(n)){
        cout<<n<<" is a Kaprekar Number."<<endl;
    }else{
        cout<<n<<" is not a Kaprekar Number.\n";
    }
    return 0;
}

bool check_kaprekar(long k){
    /** 1^2 = 01
    0 + 1 = 1 **/
    if(k==1)
        return true;

    //find n^2
    unsigned long long sqr = k * k;
    //find the count of digits
    int len = floor(log10(sqr)) + 1;
    //split sqr at different points and check if sum equals to k
    for(int j=1;j<len;j++){
        int point = pow(10, j); //point is multiples of 10

        if(point == k){
            //multiples of 10 are not kaprekar nos.
            continue;
        }
        long sum = (sqr / point) + (sqr % point);
        if(sum == k)
            return true;
    }
    return false;
}