#include <stdio.h>

void f(int * p){// 定义了一个名字叫做p的形参 他的类型是int *  存放了整型变量地址 
	*p = 100;//操作的是i的地址 改变了i存储的值 
}

int main(void){
	
	int i =9;
	f(&i);//此时*p就是i  通过被调函数修改主调函数中变量的值 
	printf("i = %d\n",i);
	return 0;
	
}
