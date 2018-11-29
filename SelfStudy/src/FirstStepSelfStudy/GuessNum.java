package FirstStepSelfStudy;

import java.util.Scanner;

/**
 * @author ShawnYue
 * @date 2018-10-13 14:51
 */
public class GuessNum {

  static int k = (int)((Math.random())*100);

  private static int count = 0;

  public static void main(String[] args) {
    System.out.println(" 请输入你猜的数字： ");
    Scanner scanner = new Scanner(System.in);
    while (true) {
      int i = scanner.nextInt();

      if (i > k) {
        System.out.println(" 你猜的值大于结果，请重新猜测 ");
        count++;
      } else if (i < k) {
        System.out.println(" 你猜的值小于结果，请重新猜测 ");
        count++;
      } else {
        System.out.println("结果正确,你一共猜错了 " + count + " 次 ");
        break;
      }

    }
  }
}