import java.util.Scanner;

/**
 * @author ShawnYue
 * @date 2018-10-10 10:13
 */
public class TemperatureCastDemo {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("请输入需要转换成华氏度的温度：");
    double celDeg = scanner.nextDouble();
    if (celDeg < -273.15) {
      System.out.println("温度不能低于绝对零度！");
      celDeg = scanner.nextDouble();
    }
    System.out.println("请输入需要转化成摄氏度的温度：");
    double fahre = scanner.nextDouble();
    if (fahre < -459.67) {
      System.out.println("温度不能低于绝对零度");
      fahre = scanner.nextDouble();
    }
    CelDegree celDegree = new CelDegree(celDeg);
    Fahrenheit fahrenheit = new Fahrenheit(fahre);

    celDegree.castDegree(celDeg);
    fahrenheit.castDegree(fahre);
  }


}

class CelDegree {

  private double celdegree;

  CelDegree() {

  }

  CelDegree(double celdegree) {
    this.celdegree = celdegree;
  }


  void castDegree(double celDegree) {
    celDegree = 9.0 * celdegree / 5 + 32;
    System.out.println(" 该摄氏度的华氏度为：" + (int) celDegree + " ℉ ");


  }

}

class Fahrenheit extends CelDegree {

  double fahrenheit;

  Fahrenheit(double fahrenheit) {
    this.fahrenheit = fahrenheit;
  }

  void castDegree(double fahrenheit) {

    fahrenheit = 5.0 * (fahrenheit - 32) / 9;
    System.out.println(" 该华氏度的摄氏度为：" + fahrenheit + " ℃ ");

  }
}