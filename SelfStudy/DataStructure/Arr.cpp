#include <stdio.h>
#include <malloc.h>
#include <stdlib.h>

//������һ���������� �������͵�������struct Arr,����������Ա 
struct Arr{
	int * pBase;//�洢�����һ��Ԫ�صĵ�ַ ���ṹ��ָ��������Ե�ʱ�������������һ�� 
	int len;//��������Ԫ�صĸ��� 
	int cnt;//��ǰ������ЧԪ�صĸ��� 
//	int increment;//�Զ��������� 
};

void init_arr(struct Arr *pArr,int length);
bool append_arr(struct Arr *pArr,int val); // ׷��
bool insert_arr(struct Arr *pArr,int index,int val);//index��ֵ��1��ʼ ��ָ����λ�ò���Ԫ�� 
bool delete_arr(struct Arr *pArr,int index,int * pVal);//pVal���ܱ�ɾ����ֵ 
bool get();
bool is_empty(struct Arr *pArr);
bool is_full(struct Arr *pArr);
void sort_arr(struct Arr *pArr);
void show_arr(struct Arr * pArr);
void inversion_arr(struct Arr *pArr);//���� 


int main(void){
	struct Arr arr;
	int val;
	
	init_arr(&arr,6);
	append_arr(&arr,1);

	append_arr(&arr,5);
	append_arr(&arr,3);
	append_arr(&arr,8);//Ҫ���������飬Ҫ���ӵ�Ԫ�أ�Ԫ�س��������޷����� 
//	append_arr(&arr,5);
//	insert_arr(&arr,6,8);
//	if(delete_arr(&arr,2,&val)){//val�ĵ�ַ����pVal �Ϳ����ں�����ͨ��pVal�޸�val��ֵ 
//	
//	printf("ɾ���ɹ���ɾ����Ԫ���ǣ� %d\n",val);
//}else{
//	printf("ɾ��ʧ�ܣ�\n");
//}
	show_arr(&arr);
	
	inversion_arr(&arr);
	show_arr(&arr);
	sort_arr(&arr);
	show_arr(&arr);
	
//	printf("%d\n",arr.len);
	 
	return 0;
}

//��ʼ������ 
void init_arr(struct Arr *pArr,int length){	
	pArr->pBase = (int *)malloc(sizeof(int) * length); //sizeof()��д�������������Ͷ����Ǿ�����ֽ��� 
	if(pArr->pBase == NULL){
		printf("�ڴ����ʧ��!\n");
		exit(-1);//��ֹ���� 
	}else{
		pArr->len = length;
		pArr->cnt = 0;
	}
}

//���Ԫ�� 
bool append_arr(struct Arr *pArr,int val){
	if(is_full(pArr)){
		return false;
	}else{
		pArr->pBase[pArr->cnt] = val;//��Ч���ȿ��Է����û���������λ�õ����� 
		(pArr->cnt)++; 
		return true;
	}
}

//�ж������Ƿ������������ǣ���Ч���ȵ����ܳ��� 
bool is_full(struct Arr * pArr){
	if (pArr->cnt == pArr->len){
		return true;
	}else{
		return false;
	}
} 

//�ж������Ƿ�Ϊ�� ����Ч�����ǲ���0 
bool is_empty(struct Arr *pArr){
	if(pArr->cnt == 0){
		return true;
	}else{
		return false;
	}
}

//��������ǰ�������� ���鲻��Ϊ�� �����Ϊ�� ������������ 
void show_arr(struct Arr * pArr){
	if(is_empty(pArr)){
		printf("����Ϊ��!\n");
	}else{
		for(int i=0;i<pArr->cnt;i++){
			printf("%d ",pArr->pBase[i]);
			if(i==pArr->cnt-1){
				printf("\n");
			}
		}
	}
}

//����Ԫ�� ��Ҫ�ṩ�±�Ͳ����ֵ ������׳���ж� 
bool insert_arr(struct Arr *pArr,int index,int val){
		
		if(is_full(pArr)){
			printf("�������� \n");
			return false;
		}
		if(index < 1 || index > pArr->cnt+1){
			printf("����λ�ô��� \n");
			return false;
		}
		 for(int i = pArr->cnt-1;i>=index-1;i--){
		 	pArr->pBase[i+1] = pArr->pBase[i];//�ƶ�Ԫ�� ����Ч���ȵ�λ�� 
		 }

		 pArr->pBase[index-1] = val;
		 (pArr->cnt)++;//����֮����Ч�������� 
		 
		 return true;	
}

//ɾ��Ԫ�� ��������׳���ж� *pVal 
bool delete_arr(struct Arr *pArr,int index,int * pVal){//index��ʾҪɾ���ڼ���Ԫ�� �����±���index-1 
	if(is_empty(pArr)){
		return false;//����ɾ��ʧ�� 
	}
	if(index < 1 || index > pArr->cnt){ 
		return false;//�±��ֵ���Ϸ� index�����1��ʼ �Ҳ��ܴ�����Ч���� 
	}
	
	*pVal = pArr->pBase[index-1];//ɾ����Ԫ�ط��ظ����ָ��ָ��ı���
	 
	for(int i = index ;i  <pArr->cnt; i++){
		pArr->pBase[i-1] = pArr->pBase[i];//�Ѻ�һ��Ԫ�ظ���ǰһ�� ��ɾ����λ�ÿ�ʼ 
	} 
	
	pArr->cnt--;
	return true;
}

//�������ã����Ƶı�Ҫ������i<j����������һ��֮���ֻ��������� ����û��������� 
void inversion_arr(struct Arr *pArr){
	int i =0;
	int j = pArr->cnt-1;
	int temp;
	
	while(i < j){
	temp =	pArr->pBase[i];
	pArr->pBase[i] = pArr->pBase[j];
	pArr->pBase[j] = temp;
	i++;
	j--;
	}
}

//�������� 
void sort_arr(struct Arr *pArr){
	int i,j,temp;
	for(i=0;i<pArr->cnt;i++){
		for(j=i+1;j<pArr->cnt;j++){
			if(pArr->pBase[i]>pArr->pBase[j]){
				temp = pArr->pBase[i];
				pArr->pBase[i] = pArr->pBase[j];
				pArr->pBase[j] = temp;
			} 
		}
	} 
} 


