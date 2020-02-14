/**
 *  https://www.hackerrank.com/challenges/gem-stones/problem
**/


#include<bits/stdc++.h>
using namespace std;

int main()
{
    int n, i, ans=0, ar[109][26]={}, j, flag;
    string s;

    cin >> n;

    for(i=0; i<n; i++){
        cin >> s;
        for(j=0; j<s.size(); j++)
            ar[i][s[j]-'a']++;
            //s[j]-'a' gets the index that is within 26
            //and the loop traverses through the string and count frequency of chars
    }

    //check each character and find out whether or not they are present in all of the n strings
    for(i=0; i<26; i++){ 
        flag=0;
        for(j=0; j<n; j++){ //checking each n strings
            if(ar[j][i]==0) //if it occurs at least once
                flag=1;
        }
        if(flag==0)
            ans++;
    }
    cout << ans << endl;
    return 0;
}