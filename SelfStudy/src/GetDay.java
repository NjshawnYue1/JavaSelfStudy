import java.util.Calendar;
import java.util.Scanner;

/**
 * Created by Admin on 2017/4/26.
 */
public class GetDay {
    public static void main(String[] args) {
        System.out.print("Enter the month and year: ");
        Scanner input = new Scanner(System.in);

        int year = input.nextInt();
        int month = input.nextInt();
        int k =  getMaxDayByYearMonth(year,month-1);


        System.out.println(year +" 的 "+ month + " 月 " + " 有 " + k +" 天 ");
    }
    public static int getMaxDayByYearMonth(int year, int month) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR, year);
        calendar.set(Calendar.MONTH, month);
        return calendar.getActualMaximum(Calendar.DATE);
    }
}
