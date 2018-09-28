import java.util.Scanner;

/**
 * Created by Admin on 2017/4/17.
 */
public class RadomNumAddTest {
    public static void main(String[] args) {
        double num0,num1,sum;
        num0 = System.currentTimeMillis() % 10;
        num1 = System.currentTimeMillis() * 4 % 10;
        System.out.print("What is " + num0 +" + " + num1 + " ? ");
        sum = num0 + num1;
        Scanner input = new Scanner(System.in);
        double d = input.nextDouble();
        if (sum == d)
            System.out.println("Your answer is correct");
        else
            System.out.println("Your answer is false");
    }
}
