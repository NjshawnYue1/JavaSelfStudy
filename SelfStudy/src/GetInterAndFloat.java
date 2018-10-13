import java.util.Scanner;

/**
 * @author ShawnYue
 * @date 2018-10-12 14:57
 */
public class GetInterAndFloat {

  public static void main(String[] args) {
    System.out.println("Plz Enter a Num");
    Scanner scanner = new Scanner(System.in);
    double a = scanner.nextDouble();
    if (a > 0 && a < 1) {
      System.out.println(a);
    } else if (a > 1) {
      double b = a - (int) a;

      System.out.println((int) a + "  " + b);
    } else if (a < 0) {
      double c = a - (int) a;
      System.out.println((int) a + "   " + c);
    }
  }

}
