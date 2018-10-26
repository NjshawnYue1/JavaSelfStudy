#include <stdio.h>

int main(void){
	int a[5] = {1,2,3,4,5};
	//a[i]  µÈ¼ÛÓÚ   *(a+i) 
	printf("%p\n",a+2);
	printf("%p\n",a+3);
	printf("%p\n",a+4);
	printf("%d\n",*a+2);
	
	return 0;
}
