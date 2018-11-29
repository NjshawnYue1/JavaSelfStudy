#include<stdio.h>
#include <malloc.h> 
#include <stdlib.h>

typedef struct Node{
	
	int data;//������ 
	struct Node * pNext;//ָ���� ָ���������������ͬ����һ����� 
	
}NODE,*PNODE;//����һ�����Ľṹ �������ָ���� 

PNODE creat_list(void);
void traverse_list(PNODE pHead);

 
int main(void){
	
	PNODE pHead = NULL;//�ȼ��� struct Node * pHead = NULL;
	pHead = creat_list();//���ܣ�����һ����ѭ�������� ��ͷ���ĵ�ַ����pHead  
	traverse_list(pHead);
	
	return 0;
}

PNODE creat_list(){//���ش�����������׵�ַ 
 	int length;//��Ч���ĸ��� 
 	int i;//ѭ������ 
 	int val;//����û������ֵ 
 
 //������һ���������Ч���ݵ�ͷ��� 
	 PNODE pHead = (PNODE)malloc(sizeof(NODE)); //PNODE Ϊ�����������ռ� ����Ĵ�С��NODEһֱ (int *)malloc(sizeof(int) * len); 
 		if(pHead == NULL){
 			printf("����ʧ�ܣ�������ֹ\n");
 			exit(-1);
 		}
 	PNODE pTail = pHead;// pTailҲָ����ͷ��� 
 	pTail->pNext = NULL;//��ʼ����ʱ�����û������κ�Ԫ�� �������㱾�����β��� ����pNextΪ�� 
 
	printf("����������Ҫ����������ڵ�ĸ����� ");
 	scanf("%d",&length);
 
 	for(i=0;i<length;i++){
 		printf("������� %d ���ֵ��",i+1);
 		scanf("%d",&val);
 	
 		PNODE pNew = (PNODE)malloc(sizeof(NODE));//ÿѭ��һ�ξ�����һ����� 
 		if(pNew == NULL){
 		printf("����ʧ�ܣ�������ֹ\n");
 		exit(-1);
 }
 
	pNew->data = val;//�����val��ֵ�浽������������ 
 	pTail->pNext = pNew;//��������ָ�������ɵĽ�� 
 	pNew->pNext = NULL;//�����ɵĽ��ָ����Ϊ�� 
 	pTail = pNew; //pTail ָ�� �����ɵĽ�� ���������ɵĽ��ĵ�ַ����pTail 
 }
 	return pHead; //����ͷ��� 
}

//���� ��Ҫ�Ĳ���Ϊͷ��� 
void traverse_list(PNODE pHead){
	PNODE p = pHead->pNext; 
	
	while(p != NULL){
		printf("%d  ",p->data);
		p = p->pNext;
	}
	printf("\n");
} 
