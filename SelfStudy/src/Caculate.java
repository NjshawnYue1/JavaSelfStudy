import java.util.Scanner;

/**
 * Created by Admin on 2017/4/16.
 */
public class Caculate {
    public static void main(String[] args) {
        int m,r;
        double k;
        System.out.print("enter two num :");
        Scanner input = new Scanner(System.in);
        m = input.nextInt();
        r = input.nextInt();
        k =  (double) m * Math.pow(r,2);
        System.out.println(k);
    }
}
