// https://www.codechef.com/JULY20B/problems/CRDGAME

#include<bits/stdc++.h> 
using namespace std;
#define MAX 1000000

int sum_of_digits(int n) {
    int sum = 0;

    while(n != 0) {
        sum += n % 10;
        n = n / 10;
    }
    return sum;
}

int main() {
    int t, n;
    int chef_card, morty_card;

    cin >> t;

    while(t--) {
        cin >> n;

        int chef_score = 0, morty_score = 0;

        for(int i=0;i<n;i++) {
            cin >> chef_card >> morty_card;

            int sum_chef = sum_of_digits(chef_card);
            int sum_morty = sum_of_digits(morty_card);

            if(sum_of_digits(chef_card) > sum_of_digits(morty_card)) {
                chef_score++;
            }else if(sum_chef < sum_morty){
                morty_score++;
            }else{
                chef_score++;
                morty_score++;
            }
        }

        if(chef_score > morty_score) {
            printf("0 %d\n", chef_score);
        }else if(morty_score > chef_score) {
            printf("1 %d\n", morty_score);
        }else if(chef_score == morty_score) {
            printf("2 %d\n", chef_score);
        }
    }

    return 0;
}