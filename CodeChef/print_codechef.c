/* https://www.codechef.com/CCCO2017/problems/MED004 */

#include<stdio.h>
#include<string.h>
#define MAX 10000
int main()
{
        char str[MAX];
        int i, count[6]={0}, min, n;

        scanf("%d", &n);
        scanf("%s", str);

        for(i=0;str[i]!='\0';i++){
                if(str[i]=='c')
                        count[0]++;
                else if(str[i]=='o')
                        count[1]++;
                else if(str[i]=='d')
                        count[2]++;
                else if(str[i]=='e')
                        count[3]++;
                else if(str[i]=='h')
                        count[4]++;
                else if(str[i]=='f')
                        count[5]++;
        }
        min=count[0];
        for(i=0;i<6;i++)
                if(count[i]<min)
                        min=count[i];

        printf("%d\n", min);

        return 0;
}
