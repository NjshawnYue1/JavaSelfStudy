package FirstStepSelfStudy;

import java.util.Scanner;

public class StringComp {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String str1,str2;
    int comparison;
    System.out.println("Enter first string");
    str1 = scanner.next();
    System.out.println("Enter second string");
    str2 = scanner.next();
    comparison = str1.compareTo(str2);
    if (comparison<0){
      System.out.println(str1+" comes befor "+str2);
    }
    else if (comparison > 0) {
      System.out.println(str2 + " comes befor " + str1);
    } else {
      System.out.println("They are idemtical");
    }
  }

}
