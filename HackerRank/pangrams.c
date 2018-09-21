#include<stdio.h>
#include<string.h>
#include<stdlib.h>
#include<stdbool.h>

int main(void)
{
    char s[1000];
    int i, index;
    bool alpha_26[26];
    
    fgets(s, 1000, stdin);
    for(i=0;i<strlen(s);i++){
        if(s[i]>='A' && s[i]<='Z'){
            index=s[i]-65;
        }else if(s[i]>='a' && s[i]<='z'){
            index=s[i]-97;
        }
        alpha_26[index]=true;
    }
    for(i=0;i<26;i++){
        if(alpha_26[i]==false){
            printf("not pangram\n");
            exit(0);
        }
    }
    printf("pangram\n");
    return 0;
}