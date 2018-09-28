import java.util.Scanner;

/**
 * Created by Admin on 2017/4/18.
 */
public class TeseBMI {
    public static void main(String[] args) {
        double height,weight,BMI;
        final double INCHES_TO_METERS = 0.0254;
        final double POUNDS_TO_KILOGRAM = 0.45359237;

        System.out.print("Enter weight in pounds: ");

        Scanner input = new Scanner(System.in);
        weight = input.nextDouble() * POUNDS_TO_KILOGRAM;

        System.out.print("Enter height in inches: ");
        height = input.nextDouble() * INCHES_TO_METERS;

        BMI = weight / (Math.pow(height,2));
        System.out.println("BMI is " + BMI);
    }
}
