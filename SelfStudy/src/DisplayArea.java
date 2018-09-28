import java.util.Scanner;

/**
 * Created by Admin on 2017/9/20.
 * 使用方法的重载，编写分别用于计算三角形，圆形和正方形面积的方法。在main方法中分别调用方法，并打印返回结果。
 */
public class DisplayArea {

    public static void main(String[] args) {
        AreaDemo areaDemo = new AreaDemo();

        double area1 = areaDemo.Area(1.0);
        double area2 = areaDemo.Area(1.0, 2.0);
        double area3 = areaDemo.Area(1.0, 2.0, 3.0);
        System.out.println(area1);
        System.out.println(area2);
        System.out.println(area3);


    }
}
class AreaDemo {
    public  double Area(double a, double b, double c) {
        double s = ((a + b) * c) / 2.0;
        return s;
    }

    public double Area(double r) {
        double s = Math.PI * r * r;
        return s;
    }

    public double Area(double a, double b) {
        double s = a * b;
        return s;
    }
}
