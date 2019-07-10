#include<stdio.h>
#include<string.h>
#define MAX 100

int main(void) {
	int t, i, n, marks=0;
	char s[MAX], u[MAX];

	scanf("%d", &t);

	while(t--){
	    scanf("%d", &n);
        scanf("%s", &s);
	    scanf("%s", &u);
	    
	    for(i=0;i<n;i++){
	        if(s[i] == u[i]){
	            marks++; //got 1 marks
	        }else if(s[i] != u[i] && u[i] != 'N'){
	            i++; //skip (i+1)
	        }
	    }
	    
	    printf("%d\n", marks);
	    marks = 0;
	}
	return 0;
}

