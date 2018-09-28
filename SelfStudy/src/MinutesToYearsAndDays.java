import java.util.Scanner;

/**
 * Created by Admin on 2017/4/18.
 */
public class MinutesToYearsAndDays {
    public static void main(String[] args) {
        int years, days, i;
        System.out.print("Please enter the number of minutes: ");
        Scanner input = new Scanner(System.in);
        i = input.nextInt();
        // 365days 24h 24*60m 24*60*365
        years = i / (24 * 60 * 365);
        days = i % (24 * 60 * 365) / (24 * 60);
        System.out.println(i + "minutes is approximately " + years+ " years " + " and " + days + " days ");
    }
}
