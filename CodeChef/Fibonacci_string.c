/*https://www.codechef.com/problems/CLFIBD*/

#include<stdio.h>
#define MAX 1000

int char_frequency();

int main()
{
    char str[MAX];
    int i, count[26]={0};

    

}

int char_frequency(char *str)
{
    for(i=0; i<strlen(str); i++){
        str[i] = tolower(str[i]);
    }

    i=0;
    while(str[i] != '\0'){
        if(str[i] >= 'a' && str[i] <= 'z'){ //check whether it is an alphabet or not
            s = str[i] - 'a'; //ascii of str[i] - ascii of 'a' gives the serial no. of the detected alphabet
            count[s]++; //sth room gets incremented
        }
        i++;
    }
}