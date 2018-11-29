package Lesson;

import java.util.Scanner;

/**
 * @author ShawnYue
 * @date 2018-11-20 21:37
 */
public class ArraySortDemo {

  public static void main(String[] args) {
//    sortArray();
    sortArray1();
  }

  private static void sortArray1() {
    int[] a = new int[5];
    int[] b = new int[5];
    Scanner scanner = new Scanner(System.in);
    for (int i = 0; i < a.length; i++) {
      System.out.println("为数组a赋五个值：");
      a[i] = scanner.nextInt();
    }
    for (int j = 0; j < b.length; j++) {
      System.out.println("为数组b赋五个值：");
      b[j] = scanner.nextInt();
    }
//    对a数组排序
    sort(a);
    System.out.println("数组a为： ");
    for (int i : a) {
      System.out.print(i + " ");
    }
    System.out.println();
    //对数组b排序
    sort(b);
    System.out.println("数组b为： ");
    for (int j : b) {
      System.out.print(j + " ");
    }
    System.out.println();
    int i = a.length - 1;
    int l = 0;
    int[] c = new int[10];
    //若a数组的最大值仍然小于等于b数组的最小值 则无须比较一次性全部插入长数组中
    if (a[i] <= b[0]) {
      for (int j = 0; j < 5; j++) {
        c[j] = a[j];
      }
      for (int k = 5; k < c.length; k++) {
        c[k] = b[l];
        l++;
      }
//若a数组的最小值仍然大于等于b数组的最大值 则无须比较一次性全部插入长数组中
    } else if (a[0] >= b[i]) {
      l = 0;
      for (int j = 0; j < 5; j++) {
        c[j] = b[j];
      }
      for (int k = 5; k < c.length; k++) {
        c[k] = a[l];
        l++;
      }
    }
    for (int m : c) {
      System.out.print(m);
    }
  }
  /*全部放入长数组然后重新比较的情况*/
  @SuppressWarnings("unused")
  private static void sortArray() {
    int[] a = new int[5];
    int[] b = new int[5];
    Scanner scanner = new Scanner(System.in);
    for (int i = 0; i < a.length; i++) {
      System.out.println("为数组a赋五个值：");
      a[i] = scanner.nextInt();
    }
    for (int j = 0; j < b.length; j++) {
      System.out.println("为数组b赋五个值：");
      b[j] = scanner.nextInt();
    }

    //创建一个长度是两个数组长度之和的数组
    int[] c = new int[10];
    int j = 0;
    //将a中的元素隔开插入c数组中
    for (int i = 1; i <= c.length; i = i + 2) {
      c[i] = a[j];
      j++;
    }
    j = 0;
    for (int i = 0; i < c.length - 1; i = i + 2) {
      c[i] = b[j];
      j++;
    }
    System.out.println("排序前： ");
    for (int i : c) {
      System.out.print(i + " ");
    }
    System.out.println();
    sort(c);
    System.out.println("排序后： ");
    for (int i : c) {
      System.out.print(i + " ");
    }
  }

  private static void sort(int[] ints) {
    for (int i = 0; i < ints.length - 1; i++) {
      for (int j = 0; j < ints.length - i - 1; j++) {
        int temp = 0;
        if (ints[j] > ints[j + 1]) {
          temp = ints[j];
          ints[j] = ints[j + 1];
          ints[j + 1] = temp;
        }
      }
    }
  }

  @SuppressWarnings("unused")
  /*大小无规律拿出比较的情况*/
  public static void sortArray3() {
    int[] a = {2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
    int[] b = {0, 20};
    int[] result = new int[a.length + b.length];
    /**
     * k用来自增长result下标
     * m用来控制内层循环的起始位置
     */
    int k = 0;
    int m = 0;
    boolean flag = false;
    // 以'A'数组为基准
    for (int i = 0; i < a.length; i++) {
      int index = i;
      if (m >= b.length - 1) {
        // 说明B数组已全部在结果集中，这时将A剩余元素全部一次插入
        flag = false;
      }
      for (int j = m; j < b.length; j++) {
        if (a[i] >= b[j]) {
          index = j;
          flag = true;
          break;
        } else {
          flag = false;
          break;
        }
      }
      // 当b[j]数字小的时候 让i--仍作为下一次的比较对象 但b的起始位置需要修改否则死循环
      if (index != i || flag) {
        i--;
        m++;
        result[k++] = b[index];
      } else {
        // 相反，i的位置自然改变，但m不变仍作为下一次的比较对象
        result[k++] = a[i];
      }
    }

    // 如果result没有填满，则将B中元素填入
    int dis = (a.length + b.length) - k;
    for (int i = b.length - dis; i < b.length; i++) {
      result[k++] = b[i];
    }

    for (int thisOne : result) {
      System.out.print(thisOne + "    ");
    }
  }

}
