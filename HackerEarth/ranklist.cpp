/** https://www.hackerearth.com/practice/algorithms/sorting/quick-sort/practice-problems/algorithm/rank-list/description/ **/

#include<bits/stdc++.h>
using namespace std;

struct db{
    string name;
    int marks;
    int scholarno;
};

void printRanklist(db results[], int n){
    for(int i=0;i<n;i++){
        cout << results[i].name << " " << results[i].scholarno << " " << results[i].marks << endl;
    }
}

bool cmp(db lhs, db rhs){
    if(lhs.marks > rhs.marks){
        return true;
    }else if(lhs.marks == rhs.marks){
        if(lhs.name < rhs.name){
            return true;
        }else if(lhs.name == rhs.name){
            if(lhs.scholarno < rhs.scholarno){
                return true;
            }else{
                return false;
            }
        }else{
            return false;
        }
    }else{
        return false;
    }
}

int main(){
    int n, marks, scholarno;
    string name;
    cin >> n;
    db results[n];
    for(int i=0;i<n;i++){
        cin >> name;
        cin >> scholarno;
        cin >> marks;
        results[i].name = name;
        results[i].scholarno = scholarno;
        results[i].marks = marks;
    }
    sort(results, results+n, cmp);
    printRanklist(results, n);
    return 0;
}