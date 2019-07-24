#include <stdio.h>
#define MAX 100000

int main(void) {
    long t, n, i;
    int ones = 0;
    char str[MAX];
	scanf("%ld", &t);
	while(t--){
	    scanf("%ld", &n);
	    scanf("%s", str);
	    for(i=0;i<n;i++){
	        if(str[i] == '1'){
	            ones++;
	        }
	    }
	    printf("%ld", (long)(ones*(ones+1)) / 2);
	}
	return 0;
}

