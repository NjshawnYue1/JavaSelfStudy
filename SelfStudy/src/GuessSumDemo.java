import java.util.Scanner;

/**
 * @author ShawnYue
 * @date 2018-10-12 15:07
 */
public class GuessSumDemo {

  public static void main(String[] args) {
    System.out.println("Enter Two Num And Guess Their Sum");
    Scanner scanner = new Scanner(System.in);
    double a = scanner.nextDouble();
    double b = scanner.nextDouble();
    double c = addNum(a,b);
    System.out.println("You Guess The Result is:");
    double d = scanner.nextDouble();
    if(c==d){
      System.out.println("Congratulations!");
    }else {
      System.out.println("You Are Wrong,The Answer is :"+c);
    }

  }
  public static double addNum(double i,double j){
    double sum = i+j;
    return sum;
  }

}
