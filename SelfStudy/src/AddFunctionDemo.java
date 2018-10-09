import java.util.Scanner;

public class AddFunctionDemo {

  public static void main(String[] args) {
    int c;
    c = add(3, 4);
    System.out.println("The Result is " + c);
    myPrint();
    draw(5, 6);
    boolean bl = equalFunction(4.6, 4.6);
    System.out.println(bl);
    print99(9, 9);

  }// 调用的函数也是静态函数 返回值类型和参数类型没有关系

  private static int add(int a, int b) {
    return a + b;
  }

  //没有返回值类型的时候就是void
  public static void myPrint() {
    System.out.println("Hello World");
  }

  public static void draw(double a, double b) {
    for (int x = 1; x <= a; x++) {
      for (int y = 1; y <= b; y++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }

  public static boolean equalFunction(double a, double b) {
    return a == b;
  }

  public static void print99(int x, int y) {
    for (x = 1; x <= 9; x++) {
      for (y = 1; y <= 9; y++) {
        System.out.println(y + "*" + x + "=" + y * x + "\t");
      }
      System.out.println();
    }
  }
}

