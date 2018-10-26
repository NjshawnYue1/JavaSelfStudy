#include <stdio.h>

void showArray(int *p,int length){
	int i = 0;
//	*p = -1;
for(i=0;i<length;i++){
	printf("%d\n",p[i]);
}
}
int main(void){
	
	int a[5]={1,2,3,4,5};
	showArray(a,5);
//	printf("%d\n",a[0]);
		
	return 0;
}

