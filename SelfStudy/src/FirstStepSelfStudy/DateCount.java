package FirstStepSelfStudy;

import java.util.Scanner;

/**
 * Created by Admin on 2017/4/18.
 */
public class DateCount {
    public static void main(String[] args) {
        int today, futureDay, afterHowManyDays;

        System.out.print("Enter today's day: ");
        Scanner input = new Scanner(System.in);
        today = input.nextInt();

        System.out.print("Enter the number of days elapsed since today: ");
        afterHowManyDays = input.nextInt();

        switch (today) {
            case 0:
                System.out.print("Today is Sunday");break;
            case 1:
                System.out.print("Today is Monday");break;
            case 2:
                System.out.print("Today is Tuesday");break;
            case 3:
                System.out.print("Today is Wednesday");break;
            case 4:
                System.out.print("Today is Thursday");break;
            case 5:
                System.out.print("Today is Friday");break;
            case 6:
                System.out.print("Today is Saturday");break;
        }

        futureDay = (today + afterHowManyDays) % 7;
        switch (futureDay) {
            case 0:
                System.out.print(" and the future day is Sunday");break;
            case 1:
                System.out.print(" and the future day day is Monday");break;
            case 2:
                System.out.print(" and the future day day is Tuesday");break;
            case 3:
                System.out.print(" and the future day day is Wednesday");break;
            case 4:
                System.out.print(" and the future day day is Thursday");break;
            case 5:
                System.out.print(" and the future day day is Friday");break;
            case 6:
                System.out.print(" and the future day day is Saturday");break;

        }
    }
}
