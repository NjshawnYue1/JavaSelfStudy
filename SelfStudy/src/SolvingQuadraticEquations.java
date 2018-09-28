import java.util.Scanner;

/**
 * Created by Admin on 2017/4/18.
 */
public class SolvingQuadraticEquations {
    public static void main(String[] args) {
        double a,b,c,r1,r2;

        System.out.print("Enter a,b,c: ");
        Scanner input = new Scanner(System.in);

        a = input.nextDouble();
        b = input.nextDouble();
        c = input.nextDouble();

        if (Math.pow(b,2)-4 * a * c > 0){
            r1 = (-b + Math.pow((Math.pow(b,2)-4 * a * c),0.5)) / (2 * a);
            r2 = (-b - Math.pow((Math.pow(b,2)-4 * a * c),0.5)) / (2 * a);
            System.out.println("The equation has two roots " + r1 + " and " + r2);
        }else if (Math.pow(b,2)-4 * a * c == 0){
            r1 = r2 = (-b + Math.pow((Math.pow(b,2)-4 * a * c),0.5)) / (2 * a);
            System.out.println("The equation has one root " + r1);
        }else {
            System.out.println("The equation has no real roots");
        }

    }
}
