#include <stdio.h>
#include <String.h>

struct Student{
	int sid;
	char name[200];
	int age;	
};
	void f(struct Student * pst);
//	void g(struct Student st);
	void g2(struct Student *pst);
int main(void){
	
	struct Student st;
	f(&st);//�ѵ�ַ���������е�ָ����� 
//	g(st);//�����úõĽṹ�����ݴ������������ 
	g2(&st);
	
//	printf("%d %s %d\n",st.sid,st.name,st.age);
	
	
	return 0;
}
//�����ڴ��ʱ�� 
void g(struct Student st){
	printf("%d %s %d\n",st.sid,st.name,st.age);
}
void g2(struct Student *pst){
	printf("%d %s %d\n",pst->sid,pst->name,pst->age);
}
void f(struct Student * pst){
	(*pst).sid = 99;
	strcpy(pst->name,"zhangsan");
	pst->age = 22;
}
