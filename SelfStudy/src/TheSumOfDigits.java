import java.util.Scanner;

/**
 * Created by Admin on 2017/4/18.
 */
public class TheSumOfDigits {
    public static void main(String[] args) {
        double i;
        int j,k,l,sum = 0;
        System.out.print("Please Enter a num between 0 an 1000: ");
        Scanner input= new Scanner(System.in);
        i = input.nextDouble();
        j = (int)i /100;
        k = (int)i /10 % 10;
        l = (int)i % 10;
        sum = j + k + l;
        System.out.print("The sum of digits is " + sum);
    }
}
