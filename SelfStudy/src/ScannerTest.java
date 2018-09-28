import java.util.Scanner;

/**
 * Created by Admin on 2017/4/16.
 */
public class ScannerTest {
    public static void main(String[] args) {
        double area;
        final double PI = 3.14159;
        System.out.print("Please enter a r : ");
        Scanner input = new Scanner(System.in);
        double r = input.nextDouble();
        area = r * r * PI;
        System.out.println(" The area of circle is "+ area );
    }
}