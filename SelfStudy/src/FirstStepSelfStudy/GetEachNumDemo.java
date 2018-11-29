package FirstStepSelfStudy;

import java.util.Scanner;

/**
 * @author  ShawnYue
 * @create 2018-10-03 11:13
 */
public class GetEachNumDemo {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Please Enter A Integer");
    int num = scanner.nextInt();
    backEachNum(num);
  }

  public static void backEachNum(int a) {

    int b = a / 1000;
    a = a % 1000;
    int c = a / 100;
    a = a % 100;
    int d = a / 10;
    a = a % 10;
    System.out.println(b);
    System.out.println(c);
    System.out.println(d);
    System.out.println(a);
  }
}
