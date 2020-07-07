// https://www.codechef.com/JULY20B/problems/CRDGAME

#include<bits/stdc++.h> 
using namespace std;
#define MAX 1000000

int sum_of_digits(unsigned long long n) {
    unsigned long long sum = 0;

    while(n != 0) {
        sum += n % 10;
        n = n / 10;
    }

    return sum;
}

int main() {
    int t, n;
    unsigned long long chef_card, morty_card, chef_score = 0L, morty_score = 0L;

    cin >> t;

    while(t--) {
        cin >> n;

        for(int i=0;i<n;i++) {
            cin >> chef_card >> morty_card;

            if(sum_of_digits(chef_card) > sum_of_digits(morty_card)) {
                chef_score++;
            }else{
                morty_score++;
            }

            //cout << "cc" << sum_of_digits(chef_card) << endl;
            //cout << "mm" << sum_of_digits(morty_card) << endl;
        }

        if(chef_score > morty_score) {
            printf("0 %llu\n", chef_score);
        }else if(morty_score > chef_score) {
            printf("1 %llu\n", morty_score);
        }else if(chef_score == morty_score) {
            printf("2 %llu\n", chef_score);
        }

        //printf("hhhhhh %llu %llu hhhhhh", chef_score, morty_score);

        chef_score = morty_score = 0L;
    }

    return 0;
}