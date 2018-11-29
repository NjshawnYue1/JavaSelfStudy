package FirstStepSelfStudy;

import java.util.Scanner;

/**
 * @author ShawnYue
 * @date 2018-10-13 16:44
 */
public class TestFunDemo2 {

  public static void main(String[] args) {
    String a;
    Scanner scanner = new Scanner(System.in);
    double c = scanner.nextDouble();
    String[] b = new String[1];
    a = c+"";
    b[0] = a;
    for(int i=0;i<b[0].length();i++) {
      if(b[0].charAt(i)=='.')
      System.out.println(b[0].charAt(i));
    }
  }

}
