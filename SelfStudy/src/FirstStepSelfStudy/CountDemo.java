package FirstStepSelfStudy;

import java.util.Scanner;

public class CountDemo {

  public static void main(String[] args) {
    Count Tom = new Count();
    Count John = new Count();
//    Scanner scanner = new Scanner(System.in);
//    int k = scanner.nextInt();
    Scanner scanner = new Scanner(System.in);
    //String name;
    int grade;
    //name = Scanner.next();
    grade = scanner.nextInt();
    System.out.println("plz enter your grade");
    if(grade >= 90){
      System.out.println("优秀");
    }else if(grade >= 70){
      System.out.println("良好");
    }else if(grade >= 60){
      System.out.println("及格");
    }else{
      System.out.println("不及格");
    }

    System.out.println(Tom.serialNumber);
    System.out.println(John.serialNumber);
    System.out.println(Count.getCounter());
  }

}

class Count{
  int serialNumber;
  private static int counter=0;

  public Count(){
    counter++;
    serialNumber = counter;
  }

  public static int getCounter() {
    return counter;
  }
}
