#include <stdio.h>
int main(void){
	int * p;//p�Ǳ��������֣�int * ��ʾp������ŵ���int���ͱ����ĵ�ַ 
	
	int i = 3;
	
	p = &i;
	
	*p = 4;
	
	printf("%d",i);
	 
	return 0;
}
