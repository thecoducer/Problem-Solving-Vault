/**
 * https://www.hackerearth.com/practice/data-structures/stacks/basics-of-stacks/practice-problems/algorithm/a-game-of-numbers-1-5d3a8cb3/
 **/



#include<bits/stdc++.h>
using namespace std;
#define MAX 1000000

int main(){
    long long int n, arr[MAX];
    
    cin >> n;
    
    for(int i=0;i<n;i++)
        cin >> arr[i];
        
    //finding the next greater element
    //and storing the index
    stack<long long int> s1;
    long long int nge[n];
    
    for(int i=n-1;i>=0;i--){
        while(!s1.empty() && arr[i]>=arr[s1.top()]){
            s1.pop();
        }
        
        if(s1.empty()){
            nge[i] = -1;
        }else{
            nge[i] = s1.top();
        }
        
        s1.push(i);
    }
    
    //finding the next smaller element
    //and storing the index
    stack<long long int> s2;
    long long int nse[n];
    
    for(int i=n-1;i>=0;i--){
        while(!s2.empty() && arr[i]<=arr[s2.top()]){
            s2.pop();
        }
        
        if(s2.empty()){
            nse[i] = -1;
        }else{
            nse[i] = s2.top();
        }
        
        s2.push(i);
    }
    
    for(int i=0;i<n;i++){
        if(nge[i] != -1 && nse[nge[i]] != -1){
            cout << arr[nse[nge[i]]] << " ";
        }else{
            cout << "-1 ";
        }
    }
    
    
}