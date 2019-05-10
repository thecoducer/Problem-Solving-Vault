//https://www.codechef.com/ACJQ2017/problems/ATMOQ1

#include<stdio.h>
#include<string.h>
#include<stdlib.h>
#define MAX 1000000

int main(){
    int t, n, k, gotone;
    char str[MAX], qstr[MAX];
    long letter[26], letter2[26], i, match;

    scanf("%d", &t);

    while(t--){
        scanf("%s", str); //main string
        gotone=0; //counter for at least one match
        /**
         * memset() is used to fill a block of memory with a particular value.
         * https://www.geeksforgeeks.org/memset-c-example/
         * https://www.geeksforgeeks.org/memset-in-cpp/
        **/
        memset(letter, 0, 26*sizeof(letter[0])); //initializing every cell of letter with value 0
        for(i=0;i<strlen(str);i++){
            letter[str[i]-'a']++;
        }

        scanf("%d %d", &n, &k);

        while(n--){
            //initialization on each iteration
            memset(letter2, 0, 26*sizeof(letter2[0]));
            match=0;

            scanf("%s", qstr);

            for(i=0;i<strlen(qstr);i++){
                letter2[qstr[i]-'a']++;
            }

            for(i=0;i<26;i++){
                if(letter[i]>0 && letter2[i]>0){ //if the letter is present in both the arrays
                    match++;
                }

                if(match>=k){
                    if(gotone==0){
                        gotone=1;
                        printf("Yes\n");
                    }
                    printf("%s\n", qstr);
                    break;
                }
            }            
        }

        if(gotone==0){
            printf("No\n");
        }
    }
    return 0;
}