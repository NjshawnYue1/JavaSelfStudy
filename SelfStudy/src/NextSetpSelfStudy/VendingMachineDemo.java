package NextSetpSelfStudy;

import java.util.Scanner;

/**
 * @author ShawnYue
 * @date 2018-10-13 13:47
 */
public class VendingMachineDemo {

  static int count1 = 0, count2 = 0, count3 = 0, count4 = 0;

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("��ѡ��Ҫ�������Ʒ��");
    System.out.println("[1] ������ " + "[2] �ɿ��� " + "[3] ���׻� " + "[4] ��֭ " + "[5] ��ʾ�������� " + "[6] �˳�");

    int i;

    while (true) {
      i = scanner.nextInt();
      if (i > 6 || i < 1) {
        System.out.println("��������ȷ��ѡ�");
      }
      if (i == 6) {
        break;
      }
      getSth(i);//ѭ�����÷���
    }

//    System.out.println("�Ƿ�����������������ѡ��");
//    i = scanner.nextInt();
//    getSth(i);
  }

  public static void getSth(int i) {

    switch (i) {
      case 1:
        System.out.println("������һ��������");
        System.out.println("����������˳����ٴ������ţ�");
        count1++;
        break;
      case 2:
        System.out.println("������һ���ɿ���");
        System.out.println("����������˳����ٴ������ţ�");
        count2++;
        break;
      case 3:
        System.out.println("������һ�����׻�");
        System.out.println("����������˳����ٴ������ţ�");

        count3++;
        break;
      case 4:
        System.out.println("������һ����֭");
        System.out.println("����������˳����ٴ������ţ�");
        count4++;
        break;
      case 5:
        System.out.println("������ " + count1 + " ��������");
        System.out.println("������ " + count2 + " ���ɿ���");
        System.out.println("������ " + count3 + " �����׻�");
        System.out.println("������ " + count4 + " ����֭");
        System.out.println("����������˳����ٴ������ţ�");
      case 6:
        break;
    }


  }
}



