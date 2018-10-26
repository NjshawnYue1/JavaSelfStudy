#include <stdio.h>

 int main(void){
 int * p; //只能存放地址 
 int i = 10;
 int j;
 // p可以保存整型变量的地址  如果不给他确定的地址 则会指向任意一个整型变量的地址 只能保存整型数据的地址 
 
 p = &i;// p里现在存放i的地址  *p表示i变量 即代表了i  不赋值会指向任意一个整型地址
 j = *p; // 两个语句将i的值赋给j 等价于j=i; 
 printf("i = %d,j = %d,*p = %d\n",i,j,*p);
 return 0;
 }
