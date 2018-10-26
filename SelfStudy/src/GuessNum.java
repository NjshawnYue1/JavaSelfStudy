import java.util.Scanner;

/**
 * @author ShawnYue
 * @date 2018-10-13 14:51
 */
public class GuessNum {

  static int k = 9;


  public static void main(String[] args) {
    System.out.println(" 请输入你猜的数字： ");
    Scanner scanner = new Scanner(System.in);
    while (true) {
      int i = scanner.nextInt();

      if (i > k) {
        System.out.println(" 你猜的值大于结果，请重新猜测 ");
      }
      else if (i < k) {
        System.out.println(" 你猜的值小于结果，请重新猜测 ");
      }
      else {
        System.out.println("结果正确");
        break;
      }

    }
  }
}