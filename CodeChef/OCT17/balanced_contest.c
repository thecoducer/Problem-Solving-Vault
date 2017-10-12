/* https://www.codechef.com/OCT17/problems/PERFCONT */

#include<stdio.h>
#define MAX 10000

void check_balanced_test(long n, long *arr, long p);

int main()
{
        long t, p, n, arr[MAX];
        int i, j;

        scanf("%ld", &t);
        for(i=1;i<=t;i++){
                scanf("%ld %ld", &n, &p);
                for(j=0;j<n;j++)
                        scanf("%ld", &arr[j]);
                        check_balanced_test(n, arr, p);
        }
        return 0;
}
void check_balanced_test(long n, long *arr, long p)
{
        int i, cw, ha;
        cw=ha=0;
        //cw for cakewalk, ha for hard

        for(i=0;i<n;i++){
                if(arr[i]>=p/2)
                        cw++;
                else if(arr[i]<=p/10)
                        ha++;
        }
        if(cw==1&&ha==2)
                printf("yes\n");
        else
                printf("no\n");
}
