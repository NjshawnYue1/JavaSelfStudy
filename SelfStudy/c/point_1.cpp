#include <stdio.h>
int main(void){
	int * p;//p是变量的名字，int * 表示p变量存放的是int类型变量的地址 
	
	int i = 3;
	
	p = &i;
	
	*p = 4;
	
	printf("%d",i);
	 
	return 0;
}
