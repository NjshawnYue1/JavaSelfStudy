package FirstStepSelfStudy;

import java.util.Scanner;

/**
 * Created by Admin on 2017/9/20.
 * 输入年月日，请问这天是该年的第几天
 */
public class GetTotalDays {

    public static void main(String[] args) {
        System.out.print("Please enter the year and month and day : ");
        Scanner input = new Scanner(System.in);
        double year = input.nextInt();
        int month = input.nextInt();
        int day = input.nextInt();
        int total = 0;
        int[] arr01 = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int[] arr02 = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        CurrentDemo cu =new  CurrentDemo();
        cu.show(year,month,day,arr01,arr02);
        System.out.println(total);
    }
}
class CurrentDemo {
    private int s, k;
    private int sum = 0;
    public int show(double y, int m, int d, int arr01[], int arr02[]) {

        if (m == 1) {
            return d;
        } else if (y % 4 == 0 && y % 100 != 0 || y % 400 == 0) {
            for (int i = 0; i < m - 1; i++) {
                sum += arr01[i];
                k = sum;
            }
            return k + d;

        } else {
            for (int i = 0; i < m - 1; i++) {
                sum += arr02[i];
                s = sum;
            }
            return s + d;
        }
    }
}
