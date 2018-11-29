package FirstStepSelfStudy;

import java.util.Scanner;

/**
 * Created by Admin on 2017/4/18.
 */
public class AccountValue {

  public static void main(String[] args) {
    double savingAmount, yearRate = 0.05, sum = 0, total = 0;
    int month;

    System.out.print("Enter the monthly saving amount and month: ");

    Scanner input = new Scanner(System.in);
    savingAmount = input.nextDouble();
    month = input.nextInt();

    //  100 * (1+ 0 .05/12);
    //第五章再见，小婊砸
    if (month == 1) {
      sum = savingAmount * (1 + yearRate / 12);
      System.out.println("After the " + month + " month, the account value is " + sum);
    } else {
      System.out.println("After the " + month + " month, the account value is " + total);
    }
  }
}

