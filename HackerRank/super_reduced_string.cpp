// https://www.hackerrank.com/challenges/reduced-string/problem
// The editorial for this problem has an interesting solution that used regular expressions

#include <bits/stdc++.h>
using namespace std;

string superReducedString(string s) {
    for(int i=1;i<s.length();i++){
        if(s[i] == s[i-1]){
            s = s.substr(0, i-1) + s.substr(i+1);
            i = 0;
        }
    }

    if(s.length() == 0){
        return "Empty String";
    }else{
        return s;
    }

}

int main()
{
    string s;
    cin >> s;
    cout << superReducedString(s);
}
