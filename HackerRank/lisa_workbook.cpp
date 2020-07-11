//https://www.hackerrank.com/challenges/lisa-workbook/problem

#include <bits/stdc++.h>
using namespace std;

int main() {
    int n, k, number_of_problems;

    cin >> n >> k;
    
    int page_num = 0, special_problem = 0, problem;

    for(int i=0;i<n;i++) {
        cin >> number_of_problems;

        problem = 1; // problems start from 1 for every new chapter
        page_num++;

        while(number_of_problems >= 1) {
            number_of_problems--;

            if(problem == page_num) {
                special_problem++;
            }

            // problem mod k = 0, when a page is full of k problems
            // number_of_problems != 0, because for the last problem in a chapter we don't need to increment page number count
            if(problem % k == 0 && number_of_problems != 0) {
                page_num++;
            }

            // tracks count of problems for each chapter
            problem++;
        }
    }

    cout << special_problem;
}
