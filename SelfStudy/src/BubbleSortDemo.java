public class BubbleSortDemo {

  public static void main(String[] args) {
    int[] array = new int[10];
    for(int i=0;i<array.length;i++){
      array[i] = (int)(Math.random()*10)+1;
    }
    bubbleSort(array);
    for (int i=0;i<array.length;i++) {
      System.out.println(array[i] + "");
    }
  }
/*冒泡排序：
* 首先 外层循环在排序时控制的是循环的次数。
* 在控制交换的次数上应当比数组的长度少一次 因为在进行这一次的比较时 排序就已经完成了
* 内循环控制的是交换的元素 要区分于选择排序每次循环的元素是不同的
* 冒泡排序在于每次都是从第一个元素开始与后面的元素进行比较 循环次数增加一次 比较元素就减少一个
* 而控制循环次数的语句是自增操作 即可满足循环增加一次比较元素减少对应次数的条件
* 假设有4个元素 第一次遍历交换3次 第二次交换2次 第三次交换1次 交换次数与遍历次数之间的关系是 数组的长度-遍历的次数=交换的次数
* 所以内循环的控制语句为 array.length-1-i
* */
  public static void bubbleSort(int[] array){
    int i,j;
    for(i=0;i<array.length-1;i++){
      for(j=0;j<array.length-1-i;j++){
        int temp;
        if(array[j]>array[j+1]){
          temp = array[j];
          array[j]=array[j+1];
          array[j+1]=temp;
        }
      }
    }
  }

}
