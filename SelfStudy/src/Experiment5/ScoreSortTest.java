package Experiment5;

/**
 * @author ShawnYue
 * @date 2018-11-16 21:16
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * 集合类框架的应用：设计小程序，可对运动会中的100米比赛成绩进行管理： （1）成绩录入 （2）修改 （3）排序并输出
 *
 * 成绩可以添加且成绩可能相同
 */
public class ScoreSortTest {

  private static List<Athletes> athletesList;

  public ScoreSortTest() {
    if (athletesList == null) {
      athletesList = new ArrayList<>();
    }
  }

  //录入成绩

  public static void putsAthletes() {
    Scanner sc = new Scanner(System.in);
    System.out.println("请输入运动员的姓名：");
    String name = sc.nextLine();
    System.out.println("请输入运动员的成绩：");
    double time = sc.nextDouble();
    athletesList.add(new Athletes(name, time));
  }

  /**
   * 输出
   */
  public static void sortPrint() {
    sorts();
    for (Athletes athletes : athletesList) {
      System.out.println(athletes);
    }
  }

  /**
   * 排序
   */
  public static void sorts() {
    int count = 0;

    // 使用匿名内部类重写比较器
    Collections.sort(athletesList);

    for (Athletes athletes : athletesList) {
      athletes.setIndex(++count);
    }
  }

  /**
   * 修改信息
   */
  public static void changeAthletes() {
    Scanner sc = new Scanner(System.in);
    // 根据索引找到运动员然后对其信息进行修改
    System.out.println("输入需要修改的名次序号");
    int index = sc.nextInt();
    // 目标选手
    Athletes targetAth = athletesList.get(index - 1);
    System.out.println("您需要修改该选手的姓名还是成绩：(填写：\"姓名\" 或 \"成绩\")");
    String changeTarget = null;
    changeTarget = sc.next();
    if (changeTarget.equals("姓名")) {
      System.out.println("请输入新的姓名：");
      String newName = sc.next();
      targetAth.setName(newName);
    } else if (changeTarget.equals("成绩")) {
      System.out.println("请输入新的成绩：");
      double newTime = sc.nextDouble();
      targetAth.setTime(newTime);
    } else {
      System.out.println("您的输入有误");
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    ScoreSortTest scoreSortTest = new ScoreSortTest();
    boolean flag = true;
    System.out.println("   输入要进行的操作   ");
    System.out.println("  1.   录入运动员以及成绩");
    System.out.println("  2.   修改运动员信息");
    System.out.println("  3.   排序并输出");
    System.out.println("  4.   退出 ");
    System.out.println();
    while (flag) {
      System.out.println("请输入操作数：");
      int num = sc.nextInt();
      switch (num) {
        case 1: {
          ScoreSortTest.putsAthletes();
          break;
        }
        case 2: {
          ScoreSortTest.changeAthletes();
          break;
        }
        case 3: {
          ScoreSortTest.sortPrint();
          break;
        }
        case 4: {
          flag = false;
          break;
        }
        default: {
          System.out.println(" 输入错误 ");
        }
      }
    }
  }

}
