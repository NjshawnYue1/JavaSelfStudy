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
      String c;
      c = a + "";
//      String[] b = new String[1];
//      b[0] = c;
      for (int i = 0; i < c.length(); i++) {
        if (c.charAt(i) == '.') {
          for (int j = 0; j < i; j++) {
            System.out.println(c.charAt(j));
          }
          System.out.print("0.");
          for (int k = i + 1; k < c.length(); k++) {
            System.out.print(c.charAt(k));
          }
        }
      }

    } else if (a < 0) {
      double c = a - (int) a;
      System.out.println((int) a + "   " + c);
    }
  }

}

