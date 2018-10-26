/**
 * @author ShawnYue
 * @date 2018-10-19 11:14
 */
public class PrintNumDemo {

  public static void main(String[] args) {
    printNum();
  }

  public static void printNum() {
    for (int i = 0; i < 4; i++) {
      for (int j = 1; j < 6; j++) {
        System.out.print(i * 5 + j + " ");
      }
      System.out.println();
    }
  }

}
