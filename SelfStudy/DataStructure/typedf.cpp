#include<stdio.h>

typedef struct Student{
	int sid;
	char name[20];
	char sex;
}*PST,ST;
int main(void){
	
	ST st;
	st.sid = 100;
	printf("%d\n",st.sid);
	
	return 0;
}
