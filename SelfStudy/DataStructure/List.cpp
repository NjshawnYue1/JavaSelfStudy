#include<stdio.h>
#include <malloc.h> 
#include <stdlib.h>

typedef struct Node{
	
	int data;//数据域 
	struct Node * pNext;//指针域 指向和他本身类型相同的下一个结点 
	
}NODE,*PNODE;//这是一个结点的结构 数据域和指针域 

PNODE creat_list(void);
void traverse_list(PNODE pHead);

 
int main(void){
	
	PNODE pHead = NULL;//等价于 struct Node * pHead = NULL;
	pHead = creat_list();//功能：创建一个非循环单链表 将头结点的地址赋给pHead  
	traverse_list(pHead);
	
	return 0;
}

PNODE creat_list(){//返回创建的链表的首地址 
 	int length;//有效结点的个数 
 	int i;//循环变量 
 	int val;//存放用户输入的值 
 
 //分配了一个不存放有效数据的头结点 
	 PNODE pHead = (PNODE)malloc(sizeof(NODE)); //PNODE 为这个类型申请空间 申请的大小和NODE一直 (int *)malloc(sizeof(int) * len); 
 		if(pHead == NULL){
 			printf("分配失败，程序终止\n");
 			exit(-1);
 		}
 	PNODE pTail = pHead;// pTail也指向了头结点 
 	pTail->pNext = NULL;//初始化的时候如果没有添加任何元素 则这个结点本身就是尾结点 所以pNext为空 
 
	printf("请输入您需要生产的链表节点的个数： ");
 	scanf("%d",&length);
 
 	for(i=0;i<length;i++){
 		printf("请输入第 %d 点的值：",i+1);
 		scanf("%d",&val);
 	
 		PNODE pNew = (PNODE)malloc(sizeof(NODE));//每循环一次就新增一个结点 
 		if(pNew == NULL){
 		printf("分配失败，程序终止\n");
 		exit(-1);
 }
 
	pNew->data = val;//输入的val的值存到结点的数据域中 
 	pTail->pNext = pNew;//让这个结点指向新生成的结点 
 	pNew->pNext = NULL;//新生成的结点指针域为空 
 	pTail = pNew; //pTail 指向 新生成的结点 即把新生成的结点的地址赋给pTail 
 }
 	return pHead; //返回头结点 
}

//遍历 需要的参数为头结点 
void traverse_list(PNODE pHead){
	PNODE p = pHead->pNext; 
	
	while(p != NULL){
		printf("%d  ",p->data);
		p = p->pNext;
	}
	printf("\n");
} 
