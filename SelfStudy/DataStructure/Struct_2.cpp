#include <stdio.h>

	struct Student {
	int sid;
	char name[200];
	int sage;
}; 


int main(void){
	Student student = {1000,"aa",20};
//	student.sid = 99;//��һ�ַ�ʽ 
	struct Student *pst;
	
	pst = &student;
	pst -> sid = 99;//pst->studentid�� ���� ��*pst).sid 
	return 0;
}

