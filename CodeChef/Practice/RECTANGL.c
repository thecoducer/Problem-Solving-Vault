/*
#include<stdio.h>
int main()
{
    long a, b, c, d, t;
    int i, flag;

    scanf("%d", &t);
    for(i=1;i<=t;i++){
        flag=0;
        scanf("%ld %ld %ld %ld", &a, &b, &c, &d);
        if(a==b)
            if(c==d)
                flag=1;

        if(a==c)
            if(b==d)
                flag=1;

        if(a==d)
            if(b==c)
                flag=1;

        if(flag==1)
            printf("YES\n");
        else
            printf("NO\n");
    }
    return;
}
*/

#include<stdio.h>
int main()
{
    int a[4], i, j, t, temp;

    scanf("%d", &t);
    while(t--){
        scanf("%d %d %d %d", &a[0], &a[1], &a[2], &a[3]);
        for(i=1;i<4;i++){
            for(j=0;j<4-i;j++){
                if(a[j]<a[j+1]){
                    temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
        if(a[0]==a[1]&&a[2]==a[3])
            printf("YES\n");
        else
            printf("NO\n");
    }
    return 0;
}
