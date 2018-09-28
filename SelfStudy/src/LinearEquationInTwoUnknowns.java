import java.util.Scanner;

/**
 * Created by Admin on 2017/4/18.
 */
public class LinearEquationInTwoUnknowns {
    public static void main(String[] args) {
        double a,b,c,d,e,f,x,y;

        System.out.print("Enter a,b,c,d,e,f: ");

        Scanner input = new Scanner(System.in);
        a = input.nextDouble();
        b = input.nextDouble();
        c = input.nextDouble();
        d = input.nextDouble();
        e = input.nextDouble();
        f = input.nextDouble();

        if (a * d - b * c != 0){
            x = ( e * d - b * f) / (a * d - b* c);
            y = ( a * f - e * c) / (a * d - b* c);
            System.out.println("X is " + x + " and y is " + y);

        }else {
            System.out.println("The equation has no solution");
        }
    }
}
