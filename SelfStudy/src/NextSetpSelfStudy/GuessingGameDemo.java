package NextSetpSelfStudy;

import java.util.Scanner;

/**
 * @author ShawnYue
 * @date 2018-10-19 13:36 运用面向抽象的原则，设计一个游戏项目“剪刀－石头－布”，可以进行人－机对弈、人－人对弈。 [设计参考]
 * （1）相关类的抽象与设计：思考游戏（或运动）过程中，有那些角色参与其中?从而抽象出其中的相关类、类的属性与方法。用UML图描述之。 （2）可以用数字0、1、2分代表剪刀、石头、布；
 * （3）人－机对弈中计算机的动作用随机数发生器产生的0、1、2模拟。 （4）获胜的判断可以用算术运算结果进行判断，可以列表进行如下形式的分析： 甲	乙	甲－乙	胜负
 */
public class GuessingGameDemo {

  public static void main(String[] args) {
    MachineTest machineTest = new MachineTest("siri");
    machineTest.guessingGame();
    System.out.println();
    System.out.println("-------------------------------------------------");
    System.out.println();
    System.out.println("游戏开始请输入你的选择");
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
    System.out.println("请输入0,1,2");
    int j = scanner.nextInt();
    if (intStr[i] - j == 0) {
      System.out.println("平局");
    } else if (intStr[i] - j == 1 || intStr[i] - j == -2) {
      System.out.println(name + " win ");
    } else {
      System.out.println(name + " lose ");
    }
  }
}

class PersonTest implements GameDemo {


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
        System.out.println("输入有误");
      }
      if (i - j == 0) {
        System.out.println("平局");
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
