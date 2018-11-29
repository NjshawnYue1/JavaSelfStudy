package FirstStepSelfStudy;

import java.util.Scanner;

/**
 * @author ShawnYue
 * @date 2018-10-07 13:35
 */
interface Shape {

  public abstract double getArea();

  public abstract double getCircumference();

}

class Circle implements Shape {

  double r;

  Circle() {

  }

  Circle(double r) {
    this.r = r;
  }

  public double getArea() {
    double s = 3.14 * r * r;
    return s;
  }

  public double getCircumference() {
    double c = 2 * 3.14 * r;
    return c;

  }
}

class Trangle implements Shape {

  double a, b, c;

  Trangle() {

  }

  Trangle(double a, double b, double c) {
    this.a = a;
    this.b = b;
    this.c = c;
  }

  public double getArea() {
    double d = (a+b+c)/2;
    return Math.sqrt((d*(d-a)*(d-b)*(d-c)));
  }

  public double getCircumference() {
    double k = a + b + c;
    return k;
  }
}

class Rectangle implements Shape {

  double a, b;

  Rectangle() {

  }

  Rectangle(double a, double b) {
    this.a = a;
    this.b = b;

  }

  public double getArea() {
    double s = a * b;
    return s;
  }

  public double getCircumference() {
    double c = (a + b) * 2;
    return c;
  }

}

public class TestShape {

  public static void main(String[] args) {
    double a, b, c, r;
    Scanner scanner = new Scanner(System.in);
    System.out.println("请输入三角形的三条边");
    do {
      a = scanner.nextDouble();
      b = scanner.nextDouble();
      c = scanner.nextDouble();
    } while (a < 0 || b < 0 || c < 0 || (a + b) < c || (a + c) < b || (b + c) < a);
    Trangle trangle = new Trangle(a, b, c);
    System.out.println("三角形的面积是：" + trangle.getArea());
    System.out.println("三角形的周长是：" + trangle.getCircumference());
    System.out.println("*********这是三角形*********");
    System.out.println("请输入圆的半径");
    do {
      r = scanner.nextDouble();
    } while (r < 0);
    Circle circle = new Circle(r);
    System.out.println("圆的面积是：" + circle.getArea());
    System.out.println("圆的周长是：" + circle.getCircumference());
    System.out.println("*********这是圆*********");
    System.out.println("请输入矩形的两条边");
    do {
      a = scanner.nextDouble();
      b = scanner.nextDouble();
    } while (a < 0 || b < 0);
    Rectangle rectangle = new Rectangle(a, b);
    System.out.println("矩形的面积是：" + rectangle.getArea());
    System.out.println("矩形的周长是：" + rectangle.getCircumference());
    System.out.println("*********这是矩形*********");

  }

}