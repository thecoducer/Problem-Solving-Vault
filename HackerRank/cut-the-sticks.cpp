#include <bits/stdc++.h>
using namespace std;

int main() {
    int n, len, max = 0, min = 0, count[100000] = {0};
    cin >> n;
    
    for(int i=0;i<n;i++) {
        cin >> len;
        
        // get the min and max value of stick
        if(!min || len < min) {
            min = len;
        }
        
        if(len > max) {
            max = len;
        }
        
        // storing the count of each sticks
        count[len]++;
    }
    
    for(int i=min;i<=max;i++) {
        if(count[i]) {
            cout << n << endl;
            n -= count[i];
        }   
    }
    
}

// Time - O(N)
// Space - O(1)




/* #include<bits/stdc++.h>
using namespace std;

void cutTheSticks(int n, int a[]) {
    sort(a, a+n);
    
    cout << n << endl;
    for(int i=1;i<n;i++) {
        if(a[i] != a[i-1]) {
            cout << n - i << endl;
        }
    }
}

int main() {
    int n;
    cin >> n;
    int a[n];
    for(int i=0;i<n;i++) {
        cin >> a[i];
    }
    
    cutTheSticks(n, a);
} */

// Time - O(nlogn)
// Space - O(1)