package NextSetpSelfStudy;

import java.util.Scanner;

/**
 * @author ShawnYue
 * @date 2018-10-19 13:36 ������������ԭ�����һ����Ϸ��Ŀ��������ʯͷ�����������Խ����ˣ������ġ��ˣ��˶��ġ� [��Ʋο�]
 * ��1�������ĳ�������ƣ�˼����Ϸ�����˶��������У�����Щ��ɫ��������?�Ӷ���������е�����ࡢ��������뷽������UMLͼ����֮�� ��2������������0��1��2�ִ��������ʯͷ������
 * ��3���ˣ��������м�����Ķ����������������������0��1��2ģ�⡣ ��4����ʤ���жϿ��������������������жϣ������б����������ʽ�ķ����� ��	��	�ף���	ʤ��
 */
public class GuessingGameDemo {

  public static void main(String[] args) {
    MachineTest machineTest = new MachineTest("siri");
    machineTest.guessingGame();
    System.out.println();
    System.out.println("-------------------------------------------------");
    System.out.println();
    System.out.println("��Ϸ��ʼ���������ѡ��");
//    machineTest.show();
    PersonTest personTest1 = new PersonTest("xm", "xf");
    personTest1.guessingGame();
  }

}

interface GameDemo {

  void guessingGame();
}

class MachineTest implements GameDemo {

  private String name;

  MachineTest(String name) {
    this.name = name;
  }

  private int[] intStr = {0, 1, 2};
  private int i = (int) (Math.random() * intStr.length);


  //  public void show(){
//    System.out.println(intStr[i]);
//  }
  public void guessingGame() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("������0,1,2");
    int j = scanner.nextInt();
    if (intStr[i] - j == 0) {
      System.out.println("ƽ��");
    } else if (intStr[i] - j == 1 || intStr[i] - j == -2) {
      System.out.println(name + " win ");
    } else {
      System.out.println(name + " lose ");
    }
  }
}

class PersonTest extends RuntimeException implements GameDemo {


  private Scanner scanner = new Scanner(System.in);
  private int i = scanner.nextInt();
  private int j = scanner.nextInt();
  private String name1;
  private String name2;

  PersonTest(String name1, String name2) {
    this.name1 = name1;
    this.name2 = name2;
  }


  public void guessingGame() {
    while (true) {
      if (i > 2 || i < 0 || j > 2 || j < 0) {
        throw new NumberFormatException();
      }
      if (i - j == 0) {
        System.out.println("ƽ��");
        break;
      } else if (i - j == 1 || i - j == -2) {
        System.out.println(name1 + " win ");
        break;
      } else {
        System.out.println(name2 + " win ");
        break;
      }

    }
  }
}
