#include <stdio.h>
#include <malloc.h>

int main(void){
	
		int a[5] = {2,4,6,8,10};
	
		int len;
		int i,j;
		printf("enter your length ");
		scanf("%d",&len);
	
		int * pArr = (int *)malloc(sizeof(int) * len);
	//sizeof返回基本类型所占的字节数 里面的 * 表示乘
	//malloc返回第一个字节的地址 返回的首地址并没有办法判断是什么数据类型的 也就是到底有多少个字节 所以需要强制转换成对应数据类型的地址
//	 	*pArr = 4;//类似于a[0] = 4;
//	 	pArr[1] = 10; //类似于a[1] = 10;
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
