package Lesson;

import java.util.Random;
import java.util.Scanner;

/**
 * @author ShawnYue
 * @date 2018-11-23 14:32
 */
public class ArrayOptionsDemo {

  public static void main(String[] args) {
    char[][] arr = new char[13][6];
    int[][] arr2 = new int[4][4];
//    initArray(arr 2);
//    traverse(arr2);
//    flip(arr2);
    initArray(arr);
    buyTickets(arr);
  }

  @SuppressWarnings("unused")
  private static void flip(int[][] array) {
    initArray(array);
    System.out.println("原数组是： ");
    traverse(array);
    int temp;
    for (int i = 0; i < array.length / 2; i++) {
      temp = array[i][i];
      array[i][i] = array[array.length - 1 - i][array.length - 1 - i];
      array[array.length - 1 - i][array.length - 1 - i] = temp;
    }
    for (int i = 0; i < array.length / 2; i++) {
      temp = array[i][array.length - 1 - i];
      array[i][array.length - 1 - i] = array[array.length - 1 - i][i];
      array[array.length - 1 - i][i] = temp;
    }
    System.out.println("反转之后的数组是:  ");
    traverse(array);
  }

  private static void initArray(int[][] array) {
    Random random = new Random();
    for (int i = 0; i < array.length; i++) {
      for (int j = 0; j < array.length; j++) {
        array[i][j] = random.nextInt(10);
      }
    }

  }

  private static void traverse(int[][] array) {
    for (int i = 0; i < array.length; i++) {
      for (int j = 0; j < 6; j++) {
        System.out.print(array[i][j] + " ");
        if (j == array.length - 1) {
          System.out.println();
        }
      }
    }

  }

  private static void traverse(char[][] array) {
    for (int i = 0; i < array.length; i++) {
      for (int j = 0; j < 6; j++) {
        System.out.print(array[i][j]);
        if (j == 5) {
          System.out.println();
        }
      }

    }
  }

  @SuppressWarnings("unused")
  private static void initArray(char[][] array) {
    for (int i = 0; i < array.length; i++) {
      for (int j = 0; j < 6; j++) {
        array[i][j] = '*';

      }
    }
  }


  private static void buyTickets(char[][] array) {
    int line;
    int row;
    System.out.println("该次客机可以购买的座位范围共为13排每排6座，请选择你的座位,当前剩余的座位是： ");
    traverse(array);

    while (true) {
      Scanner scanner = new Scanner(System.in);
      System.out.println("您需要购买的机票类型是头等舱还是经济舱？");
      String s = scanner.next();
      if (s.equals("头等舱")) {
        System.out.println("前两排座位为头等舱，每排共6个座位，您要购买第几排第几列？");
        row = scanner.nextInt();
        line = scanner.nextInt();
        if (row > 3) {
          break;
        }
      } else {
        System.out.println("后十一排为经济舱，每排共6个座位，您要购买第几排第几列？");
        row = scanner.nextInt();
        line = scanner.nextInt();
        if (row < 3) {
          break;
        }
      }

      if (row > 12 || line > 5 || row < 1 || line < 1) {
        System.out.println("输入错误请重新输入！");
      }
      array[row - 1][line - 1] = '#';
      System.out.println("购买后的座位表为:  ");
      traverse(array);

      boolean flag1 = false;
      for (int i = 0; i < array.length; i++) {
        for (int j = 0; j < 6; j++) {
          if (array[row - 1][line - 1] == '#' && array[i][j] == '*') {
            flag1 = true;
          }
        }
      }
      if (flag1) {
        System.out.println("购买成功！");
      } else {
        System.out.println("已全部售出");
        System.exit(0);
      }
      System.out.println("是否继续购买，继续购买请输入c,如需退出请按q");
      String s1 = scanner.next();
      if (s1.equals("q")) {
        break;
      }else if (s1.equals("c")) {
        buyTickets(array);
      }
    }
  }
}