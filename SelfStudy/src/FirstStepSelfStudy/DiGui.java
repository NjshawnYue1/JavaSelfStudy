package FirstStepSelfStudy;

/**
 * @author ShawnYue
 * @date 2018-11-01 18:19
 */
public class DiGui {

  public static void main(String[] args) {
//    int k = digui(5);
//    System.out.println(k);
    for (int i = 1; i < 20; i++) {
      int m = digui2(i);
      System.out.print(m + " ");
    }
//    int m =digui2(6);
//    System.out.println(m);
  }

//  private static int digui(int i) {
//    if (i == 1) {
//      return 1;
//    } else {
//      return digui(i - 1) * i;
//    }
//  }

  private static int digui2(int i) {
    if (i == 1 || i == 2) {
      return 1;
    } else {
      return (digui2(i - 1) + digui2(i - 2));
    }
  }

}
