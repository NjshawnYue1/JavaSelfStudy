#include <stdio.h>

int main(void){
	
	double * p;
	double x = 66.6;
	
	p = &x;//存放了这个元素的首地址
	
	double arr[3] = {1.1,2.2,3.3}; 
	double * q;
	q = &arr[0];
	printf(" %p\n ",q);//%p 以十六进制输出 
	q = &arr[1];
	printf(" %p\n ",q);
	
	return 0;
}

