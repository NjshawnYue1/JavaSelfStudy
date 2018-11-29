package FirstStepSelfStudy;

/**
 * Created by Admin on 2017/9/24.
 */
public class ForDemo {

  public static void main(String[] args) {
    for (int x = 1; x <= 5; x++) {
      for (int y = 1; y <= x; y++) {
        System.out.print(y);
      }
      System.out.println();
    }
    line();
    for (int x = 1; x <= 5; x++) {
      for (int y = 5; y >= x; y--) {
        System.out.print(y);
      }
      System.out.println();
    }
  }

  static void line() {
    System.out.println("-------------------------");
  }
}

