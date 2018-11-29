package FirstStepSelfStudy;

import java.util.Scanner;

/**
 * Created by Admin on 2017/9/20. 声明一个10个元素的整型数组，创建该数组对象并使用for循环为所有元素赋值（任意不同值）。然后使用增强型for循环遍历访问数组元素，并打印输出。
 *
 *
 * 数组的操作实际上就是对数组角标的操作
 */
public class ArrayDemo {

  public static void main(String[] args) {

    int[] arr = new int[10];
    int[][] arr2 = new int[3][3];
    int[][] arr3 = new int[3][3];
    int[][] arr4 = new int[3][3];
    int k = 0;
//    for (int i = 0; i < 3; i++) {
//      for (int j = 0; j < 3; j++) {
//        arr[i][j] = 3;
//      }
//    }
//    for (int i = 0; i < 9; i++) {
//      arr[i/3][i % 3] = 5;
//    }
//    for (int i = 0; i < 3; i++) {
//      for (int j = 0; j < 3; j++) {
//        System.out.print(arr[i][j]);
//        if(j==2){
//          System.out.println();
//        }
//      }
//    }
    for (int i = 0; i < 10; i++) {
      arr[i] = 9;
    }
//    for(int i:arr){
//      System.out.println(i);
//    }

    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 3; j++) {
        arr2[i][j] = arr[k];
        k++;
//        System.out.print(arr2[i][j]);
//        if (j == 2) {
//          System.out.println();
//        }
      }
    }
    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 3; j++) {
        arr3[i][j] = 3;
      }
    }
    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 3; j++) {
        arr4[i][j] = arr2[i][j] * arr3[i][j];
        System.out.print(arr4[i][j]+" ");
        if(j==2){
          System.out.println();
        }
      }
    }
//    int sum = 0;
//    for(int i =0;i<9;i++){
//        sum += arr[i/3][i%3];
//    }
//    System.out.println(sum);

  }
}
