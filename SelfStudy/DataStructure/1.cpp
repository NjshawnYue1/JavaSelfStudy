#include <stdio.h>

int main(void){
	
	double * p;
	double x = 66.6;
	
	p = &x;//��������Ԫ�ص��׵�ַ
	
	double arr[3] = {1.1,2.2,3.3}; 
	double * q;
	q = &arr[0];
	printf(" %p\n ",q);//%p ��ʮ��������� 
	q = &arr[1];
	printf(" %p\n ",q);
	
	return 0;
}

