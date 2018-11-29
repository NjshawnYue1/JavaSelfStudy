package FirstStepSelfStudy;

import java.util.Scanner;

/**
 * @outhor ShawnYue
 * @create 2018-10-03 11:08
 */
public class GetNumDemo {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Please Enter A Number");
    double a = scanner.nextDouble();
    if (a > (int) a + 0.5) {
      int b = (int) a + 1;
      System.out.println(b);
    } else {
      System.out.println((int)a);
    }
  }

}
