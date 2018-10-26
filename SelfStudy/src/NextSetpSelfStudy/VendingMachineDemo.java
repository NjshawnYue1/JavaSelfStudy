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
    System.out.println("请选择要购买的商品：");
    System.out.println("[1] 口香糖 " + "[2] 巧克力 " + "[3] 爆米花 " + "[4] 果汁 " + "[5] 显示购买总数 " + "[6] 退出");

    int i;

    while (true) {
      i = scanner.nextInt();
      if (i > 6 || i < 1) {
        System.out.println("请输入正确的选项：");
      }
      if (i == 6) {
        break;
      }
      getSth(i);//循环调用方法
    }

//    System.out.println("是否继续购买？请输入你的选择：");
//    i = scanner.nextInt();
//    getSth(i);
  }

  public static void getSth(int i) {

    switch (i) {
      case 1:
        System.out.println("购买了一个口香糖");
        System.out.println("继续购买或退出请再次输入编号：");
        count1++;
        break;
      case 2:
        System.out.println("购买了一个巧克力");
        System.out.println("继续购买或退出请再次输入编号：");
        count2++;
        break;
      case 3:
        System.out.println("购买了一个爆米花");
        System.out.println("继续购买或退出请再次输入编号：");

        count3++;
        break;
      case 4:
        System.out.println("购买了一个果汁");
        System.out.println("继续购买或退出请再次输入编号：");
        count4++;
        break;
      case 5:
        System.out.println("购买了 " + count1 + " 个口香糖");
        System.out.println("购买了 " + count2 + " 个巧克力");
        System.out.println("购买了 " + count3 + " 个爆米花");
        System.out.println("购买了 " + count4 + " 个果汁");
        System.out.println("继续购买或退出请再次输入编号：");
      case 6:
        break;
    }


  }
}



