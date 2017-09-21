// https://www.hackerearth.com/practice/data-structures/stacks/basics-of-stacks/tutorial/
#include<stdio.h>
#define MAX 1000
typedef struct stack
{
    int top;
    int arr[MAX];
}stack;
stack s;

void push();
void pop();

int main(void)
{
    int i, qr, choice;

    s.top=-1;

    scanf("%d", &qr);
    for(i=qr;i>=1;i--)
    {
        scanf("%d", &choice);
        switch(choice)
        {
            case 1:
            pop();
            break;

            case 2:
            push();
            break;
        }
    }
}
void pop()
{
    if(s.top==-1)
        printf("No Food");
    else
    {
        s.top=s.top-1;
        printf("\n%d", s.arr[s.top+1]);
    }

}
void push()
{
    int data;
    scanf("%d", &data);

    if(s.top==(MAX-1))
        printf("Pile can have no more plates.");
    else
    {
        s.top=s.top+1;
        s.arr[s.top]=data;
    }
}
