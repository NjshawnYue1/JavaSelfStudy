/**
 * @author ShawnYue
 * @date 2018-10-19 11:28
 */
public class PrintTriangleDemo {

  public static void main(String[] args) {
//    printTriangle1();
    printTriangle2();
  }

//  private static void printTriangle1() {
//    for (int i = 1; i < 6; i++) {
//      for (int j = 0; j < i; j++) {
//        System.out.print("*");
//      }
//      System.out.println();
//    }
//  }

  private static void printTriangle2() {
    for (int i = 0; i < 6; i++) {
      for (int k = i; k < 6; k++) {
        System.out.print(" ");
      }
      for (int j = 0; j < i; j++) {
        System.out.print("*" + " ");
      }
      System.out.println();

    }
  }
}
