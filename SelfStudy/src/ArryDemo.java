/**
 * Created by Admin on 2017/9/20. 声明一个10个元素的整型数组，创建该数组对象并使用for循环为所有元素赋值（任意不同值）。然后使用增强型for循环遍历访问数组元素，并打印输出。
 *
 *
 * 数组的操作实际上就是对数组角标的操作
 *
 *
 */
public class ArryDemo {

  public static void main(String[] args) {
    int arr[] = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
    int i;
    for (i = 0; i < arr.length; i++) {
      System.out.print(arr[i]);
    }
    System.out.println();
    for (int element : arr) {
      System.out.println(element);
    }

  }
}
