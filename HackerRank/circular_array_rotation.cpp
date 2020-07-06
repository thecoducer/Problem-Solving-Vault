// https://www.hackerrank.com/challenges/circular-array-rotation/problem

#include <bits/stdc++.h>
using namespace std;
#define MAX 100000

void reverse(int* arr, int start, int end){
    int temp;
    while(start < end){
        temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        start++;
        end--;
    }
}

void rotateArray(int* arr, int d, int n){
    d = d % n; //handles corner cases; when d > n
    reverse(arr, 0, n-1);
    reverse(arr, 0, d-1);
    reverse(arr, d, n-1);
}

int main() {
    int arr[MAX], k, m, n, q;

    cin >> n >> k >> q;

    for(int i=0;i<n;i++) {
        cin >> arr[i];
    }

    rotateArray(arr, k, n);

    for(int i=0;i<q;i++) {
        cin >> m;
        cout << arr[m] << endl;
    }
}
