package FirstStepSelfStudy;

import java.util.Scanner;

/**
 * @author ShawnYue
 * @date 2018-10-12 15:07
 */
public class GuessSumDemo {

  private static int count = 0;

  public static void main(String[] args) {
    System.out.println("Enter Two Num And Guess Their Sum");
    Scanner scanner = new Scanner(System.in);
    double a = scanner.nextDouble();
    double b = scanner.nextDouble();
    double c = addNum(a, b);
    System.out.println("You Guess The Result is:");
    while (true) {
      double d = scanner.nextDouble();
      if (c == d) {
        System.out.println("Congratulations!");
        break;
      } else {
        System.out.println("You Are Wrong,Guess Again");
        count++;
      }

    }
  }

  private static double addNum(double i, double j) {
    return i + j;
  }

}
