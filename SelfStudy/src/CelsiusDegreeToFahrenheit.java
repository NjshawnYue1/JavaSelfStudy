import java.util.Scanner;

/**
 * Created by Admin on 2017/4/18.
 */
public class CelsiusDegreeToFahrenheit {
    public static void main(String[] args) {
        double f,c;
        System.out.print("Please enter a CelsiusDegree :");
        Scanner input = new Scanner(System.in);
        c = input.nextDouble();
        f = (9.0 / 5) * c + 32;
        System.out.println("Fahrenheit is :" + f);
    }
}
