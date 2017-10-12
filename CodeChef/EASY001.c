#include<stdio.h>
#define MAX 1000

int main(void)
{
  int num[MAX], i=0;

  /*while(1){
    scanf("%d", &num[i]);
    if(num[i]==42)
      break;
    i++;
  }*/

  for(i=0;num[i-1]!=42;i++)
    scanf("%d", &num[i]);

  for(i=0;num[i]!=42;i++)
    printf("%d\n", num[i]);

  return 0;
}
