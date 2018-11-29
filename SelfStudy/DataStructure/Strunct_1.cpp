//
// Created by Admin on 2018/10/31.
//
#include <stdio.h>
#include <String.h>

struct Student {
	int sid;
	char name[200];
	int sage;
};//分号不能省略  

int main(void) {

	Student student = {1000,"aa",20};
	printf("%d %s %d\n",student.sid,student.name,student.sage);
	strcpy(student.name,"bb");
	printf("%d %s %d\n",student.sid,student.name,student.sage);
	
	struct Student *p;


	return 0;
}
