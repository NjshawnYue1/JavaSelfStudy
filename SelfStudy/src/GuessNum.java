import java.util.Scanner;

/**
 * @author ShawnYue
 * @date 2018-10-13 14:51
 */
public class GuessNum {

  static int k = 9;


  public static void main(String[] args) {
    System.out.println(" ��������µ����֣� ");
    Scanner scanner = new Scanner(System.in);
    while (true) {
      int i = scanner.nextInt();

      if (i > k) {
        System.out.println(" ��µ�ֵ���ڽ���������²²� ");
      }
      else if (i < k) {
        System.out.println(" ��µ�ֵС�ڽ���������²²� ");
      }
      else {
        System.out.println("�����ȷ");
        break;
      }

    }
  }
}