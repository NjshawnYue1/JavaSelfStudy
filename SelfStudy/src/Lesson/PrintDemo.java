package Lesson;

import java.util.Scanner;

/**
 * @author ShawnYue
 * @date 2018-11-01 10:40
 */
public class PrintDemo {

  public static void main(String[] args) {
//    testPrint1();
//    testPrint2();
//    testResult();
//    testNum();
//    testPrint3();
//    testPrint4();
//    getOddSum();
//    getSumModThree();
//    getNumModThree();
//    testPrint5();
  }

  private static void testPrint1() {
    for (int i = 0; i < 4; i++) {
      for (int j = 0; j < i; j++) {
        System.out.print(" ");
      }
      for (int k = 0; k < 7; k++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }

  private static void testPrint2() {
    for (int i = 1; i < 8; i++) {
      for (int j = i; j > 0; j--) {
        System.out.print(j);
      }
      System.out.println();
    }
    System.out.println();
  }

  // 设S=1*2*3*...*n,求S不大于400000时的最大n.
  private static void testResult() {
    long result = 1;
    int i = 1;
    while (result < 400000) {
      result *= i;
      i++;
    }
    System.out.println(i);
    System.out.println();
  }

  //找出1~1000间的全部”同构数”.如果一个数出现在其平方数右端,则称此数为同构数,如1在12=1的右端,5在52=25的右端,25在252=625的右端等.
  private static void testNum() {
    int i = 1;
    while (i < 1000) {
      int d = i * i;

      if (d % 10 == i || d % 100 == i || d % 1000 == i) {
        System.out.println(i);
      }
      i++;
    }
  }

  private static void testPrint3() {

    for (int i = 0; i < 9; i = i + 2) {
      for (int j = 1; j < i; j = j + 2) {//空格的数量和行数一致
        System.out.print(" ");
      }
      for (int k = i; k < 9; k++) {
        System.out.print("*");
      }
      for (int l = i; l >= i; l = l - 2) {
        System.out.print(" ");
      }
      for (int m = i; m >= 0; m--) {
        System.out.print("*");
      }
      System.out.println();
    }


  }


  private static void testPrint4() {
    for (int i = 1; i < 7; i++) {
      for (int k = 7; k > i; k--) {
        System.out.print(" ");
      }
      for (int j = 1; j <= i; j++) {

        System.out.print(j + " ");

      }
      for (int m = i - 1; m > 0; m--) {
        System.out.print(m + " ");
      }
      System.out.println();
    }
  }

  private static void testPrint5() {
    for (int i = 5; i > 0; i--) {
      for (int j = i; j > 0; j--) {
        System.out.print(" ");
      }
      if (i == 5) {
        System.out.print(" *");
      } else {
        System.out.print("*");
      }

      for (int a = 5; a > i; a--) {
        System.out.print("  ");
      }
      if (i < 5) {
        System.out.print(" *");
      }
      System.out.println();
    }

    for (int k = 0; k < 5; k++) {
      for (int m = 0; m < k; m++) {
        System.out.print(" ");
      }
      if (k == 4) {
        System.out.print("  *");
      } else {
        System.out.print(" *");
      }
      for (int b = 4; b > k; b--) {
        System.out.print("  ");
      }
      if (k < 4) {
        System.out.print(" *");
      }
      System.out.println();
    }
  }

  //输出101--500之间的所有奇数,奇数之和.
  private static void getOddSum() {
    int num, sum = 0;
    for (num = 101; num < 500; num++) {
      if (num % 2 != 0) {
        sum += num;
      }
    }
    System.out.println(sum);
  }

  //输出100--200间不能被3整除的数
  private static void getSumModThree() {
    int num, sum = 0;
    for (num = 100; num < 200; num++) {
      if (num % 3 != 0) {
        sum += num;
      }
    }
    System.out.println(sum);
  }

  //输入初值,输出100个不能被3整除的数
  private static void getNumModThree() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("输入你想要输出的不能被三整除的数的个数： ");
    int n = scanner.nextInt();
    int num;
    for (num = 1; num < Integer.MAX_VALUE; num++) {
      if (num % 3 != 0 && n-- > 0) {
        System.out.println(num);
      }
    }
  }

}


