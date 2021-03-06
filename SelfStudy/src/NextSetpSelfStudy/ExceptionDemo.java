package NextSetpSelfStudy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author ShawnYue
 * @date 2018-10-10 20:31
 *
 * 异常是在 运行 时期发生的不正常情况
 *
 * 在java中用类的心事对不正常的情况进行了描述
 *
 * 描述不正常情况的类成为 异常类  其实就是把问题封装成对象 用异常类对其进行描述 不同的问题用不同的类进行描述
 *
 * 问题分成了两类： Throwable的子类才可以抛出 throws throw 操作的是类和对象具备可抛性
 *
 * 1.不可处理的 error 2.可处理的 ArithmeticException NullPointerException NegativeArraySizeException
 *
 *
 * 错误的特点：是由jvm抛出的严重性的问题 这种问题一般不处理 直接修改程序 子类的名称都是用父类的名字作为后缀 阅读性强
 */
public class ExceptionDemo extends RuntimeException {

  public static void main(String[] args) throws IOException {
//    int[] array = new int[3];
//    array = null;
//    System.out.println(array[2]);//java.lang.NullPointerException

//    sleep(-5);
    String[] week = {"Sun", "Mon", "Tue", "Wed", "Thu", "Fir", "Sat"};
    System.out.println("plz enter index number 0~6 ");
    BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
    String str = buf.readLine();

    try {
      int index = Integer.parseInt(str);
      System.out.println(index + " is " + week[index]);
    } catch (NumberFormatException e) {
      System.out.println("index should be an integer.");

    } catch (IndexOutOfBoundsException e) {
      System.out.println("index must between 0~6. ");
    } catch (Exception e){
      System.out.println(e);
    }finally {
      System.out.println("end");
    }

  }

//  private static void sleep(int time) {
//    if (time < 0) {
//      throw new NumberFormatException();
//    }
//    if (time > 10000) {
//      System.out.println("时间为" + time);
//    }

}