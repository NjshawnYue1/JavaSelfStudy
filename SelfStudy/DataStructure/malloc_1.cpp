#include <stdio.h>
#include <malloc.h>

int main(void){
	
		int a[5] = {2,4,6,8,10};
	
		int len;
		int i,j;
		printf("enter your length ");
		scanf("%d",&len);
	
		int * pArr = (int *)malloc(sizeof(int) * len);
	//sizeof���ػ���������ռ���ֽ��� ����� * ��ʾ��
	//malloc���ص�һ���ֽڵĵ�ַ ���ص��׵�ַ��û�а취�ж���ʲô�������͵� Ҳ���ǵ����ж��ٸ��ֽ� ������Ҫǿ��ת���ɶ�Ӧ�������͵ĵ�ַ
//	 	*pArr = 4;//������a[0] = 4;
//	 	pArr[1] = 10; //������a[1] = 10;
//	 	printf("%d %d\n",*pArr,pArr[1]);
		for(i=0;i<len;i++){
			scanf("%d",&pArr[i]);
		}
		for(j=0;j<len;j++){
			printf("%d\n",*(pArr+j));
		}
	 
	 	free(pArr);
	 
	
		return 0;
}
