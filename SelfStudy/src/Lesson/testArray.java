package Lesson;

import java.util.Scanner;

/**
 * @author ShawnYue
 * @date 2018-11-09 11:20
 */
public class testArray {

  public static void main(String[] args) {
    int sum = 0;
    int j = 1;
    int[] grade = new int[10];
    Scanner scanner = new Scanner(System.in);


    for (int i = 0; i < grade.length; i++) {
      System.out.println("请输入第"+j+"个同学的成绩：");
      j++;
      grade[i] = scanner.nextInt();
    }

    for (int aGrade : grade) {
      System.out.println(aGrade);
      sum += aGrade;
    }

    System.out.println("总分为： "+sum);

    System.out.println("平均分为： "+sum / grade.length);

  }

}
