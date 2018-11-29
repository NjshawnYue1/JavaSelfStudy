#include <stdio.h>
#include <malloc.h>
#include <stdlib.h>

//定义了一个数据类型 数据类型的名字是struct Arr,含有三个成员 
struct Arr{
	int * pBase;//存储数组第一个元素的地址 当结构体指向这个属性的时候操作就像数组一样 
	int len;//数组的最大元素的个数 
	int cnt;//当前数组有效元素的个数 
//	int increment;//自动增长因子 
};

void init_arr(struct Arr *pArr,int length);
bool append_arr(struct Arr *pArr,int val); // 追加
bool insert_arr(struct Arr *pArr,int index,int val);//index的值从1开始 在指定的位置插入元素 
bool delete_arr(struct Arr *pArr,int index,int * pVal);//pVal接受被删除的值 
bool get();
bool is_empty(struct Arr *pArr);
bool is_full(struct Arr *pArr);
void sort_arr(struct Arr *pArr);
void show_arr(struct Arr * pArr);
void inversion_arr(struct Arr *pArr);//倒置 


int main(void){
	struct Arr arr;
	int val;
	
	init_arr(&arr,6);
	append_arr(&arr,1);

	append_arr(&arr,5);
	append_arr(&arr,3);
	append_arr(&arr,8);//要操作的数组，要增加的元素，元素长度满后无法增加 
//	append_arr(&arr,5);
//	insert_arr(&arr,6,8);
//	if(delete_arr(&arr,2,&val)){//val的地址给了pVal 就可以在函数中通过pVal修改val的值 
//	
//	printf("删除成功，删除的元素是： %d\n",val);
//}else{
//	printf("删除失败！\n");
//}
	show_arr(&arr);
	
	inversion_arr(&arr);
	show_arr(&arr);
	sort_arr(&arr);
	show_arr(&arr);
	
//	printf("%d\n",arr.len);
	 
	return 0;
}

//初始化数组 
void init_arr(struct Arr *pArr,int length){	
	pArr->pBase = (int *)malloc(sizeof(int) * length); //sizeof()内写入具体的数据类型而不是具体的字节数 
	if(pArr->pBase == NULL){
		printf("内存分配失败!\n");
		exit(-1);//终止程序 
	}else{
		pArr->len = length;
		pArr->cnt = 0;
	}
}

//添加元素 
bool append_arr(struct Arr *pArr,int val){
	if(is_full(pArr)){
		return false;
	}else{
		pArr->pBase[pArr->cnt] = val;//有效长度可以方便用户操作具体位置的数据 
		(pArr->cnt)++; 
		return true;
	}
}

//判断数组是否已满，条件是：有效长度等于总长度 
bool is_full(struct Arr * pArr){
	if (pArr->cnt == pArr->len){
		return true;
	}else{
		return false;
	}
} 

//判断数组是否为空 即有效长度是不是0 
bool is_empty(struct Arr *pArr){
	if(pArr->cnt == 0){
		return true;
	}else{
		return false;
	}
}

//输出数组的前提条件是 数组不能为空 如果不为空 则将数组遍历输出 
void show_arr(struct Arr * pArr){
	if(is_empty(pArr)){
		printf("数组为空!\n");
	}else{
		for(int i=0;i<pArr->cnt;i++){
			printf("%d ",pArr->pBase[i]);
			if(i==pArr->cnt-1){
				printf("\n");
			}
		}
	}
}

//插入元素 需要提供下标和插入的值 先做健壮性判断 
bool insert_arr(struct Arr *pArr,int index,int val){
		
		if(is_full(pArr)){
			printf("数组已满 \n");
			return false;
		}
		if(index < 1 || index > pArr->cnt+1){
			printf("插入位置错误 \n");
			return false;
		}
		 for(int i = pArr->cnt-1;i>=index-1;i--){
		 	pArr->pBase[i+1] = pArr->pBase[i];//移动元素 从有效长度的位置 
		 }

		 pArr->pBase[index-1] = val;
		 (pArr->cnt)++;//插入之后有效长度增加 
		 
		 return true;	
}

//删除元素 首先做健壮性判断 *pVal 
bool delete_arr(struct Arr *pArr,int index,int * pVal){//index表示要删除第几个元素 所以下标是index-1 
	if(is_empty(pArr)){
		return false;//空则删除失败 
	}
	if(index < 1 || index > pArr->cnt){ 
		return false;//下标的值不合法 index必须从1开始 且不能大于有效长度 
	}
	
	*pVal = pArr->pBase[index-1];//删除的元素返回给这个指针指向的变量
	 
	for(int i = index ;i  <pArr->cnt; i++){
		pArr->pBase[i-1] = pArr->pBase[i];//把后一个元素赋给前一个 从删除的位置开始 
	} 
	
	pArr->cnt--;
	return true;
}

//数组逆置，控制的必要条件是i<j否则在逆序一次之后又会重新逆序 等于没有逆序输出 
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

//数组排序 
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


