//https://www.codechef.com/problems/ATTND

#include<stdio.h>
#include<string.h>
#include<stdlib.h>
#define MAX 1000

int main(){
    int i, t, n, j, flag;
    typedef struct student{
        char first[MAX];
        char last[MAX];
        int done;
    }student;

    student s[MAX];

    scanf("%d", &t);

    while(t--){
        scanf("%d", &n); //no of students

        for(i=0;i<n;i++){
            scanf("%s %s", s[i].first, s[i].last);
        }

        for(i=0;i<n;i++){
            flag=0;
            for(j=0;j<n;j++){
                if(i!=j){ //avoid checking the same first and last name
                    if(strcmp(s[i].first, s[j].first) == 0){ //strcmp returns zero the both of the strings are equal
                        flag=1;
                    }
                }
            }
            if(flag==1){
                printf("%s %s\n", s[i].first, s[i].last);
            }else{
                printf("%s\n", s[i].first);
            }
        }
    }
}