import java.util.Scanner;

/**
 * Created by Admin on 2017/4/18.
 */
public class GratuityAndTotal {
    public static void main(String[] args) {
        double subtotal,gratuity,total,rate;

        System.out.print("Please enter the subtotal and rate :");

        Scanner input = new Scanner(System.in);
        subtotal = input.nextDouble();
        rate = input.nextDouble() / 100;
        gratuity = subtotal * rate;
        total = subtotal + gratuity;

        System.out.println("The gratuity is " + gratuity + " and total is " + total);
    }
}
