#include<stdio.h>
#include<string.h>
#define MAX 500000

int check_chef(char *str, int i);

int main()
{
    int count=0;
    long t, i;
    char str[MAX];

    scanf("%ld", &t);
    while(t--){
        scanf("%s", &str);
        for(i=0;str[i]!='\0';i++){
            if(check_chef(str, i))
                count++;            
        }
        if(count>0)
            printf("lovely %d\n", count);
        else
            printf("normal\n");
        count=0;
    }
}

int check_chef(char *str, int i)
{
    int j, c, h, e, f;
    c=h=e=f=0;

    for(j=i;j<=(i+4-1);j++){  //for the 1st word check, from 0 to 4-1 since 'chef' word is of length 4
        if(str[j]=='c')
            c++;
        else if(str[j]=='h')
            h++;
        else if(str[j]=='e')
            e++;
        else if(str[j]=='f')
            f++;
    }
    if(c==1&&h==1&&e==1&&f==1)
            return 1;
        else
            return 0;
}
