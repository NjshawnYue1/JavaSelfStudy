package FirstStepSelfStudy;

import java.util.Scanner;

/**
 * @author ShawnYue
 * @date 2018-10-07 14:52
 */
public class GetSunFunc {


  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int num = scanner.nextInt();
    int s = getSumFunc(num);
    System.out.println(s);
  }

  public static int getSumFunc(int num) {
    if (num == 1) {
      return 1;
    } else {
      return num+getSumFunc(--num);
    }
  }
}

// 100 + get(99)
//       99 + get(98)
// =====================
//         2+get(1)

//             1