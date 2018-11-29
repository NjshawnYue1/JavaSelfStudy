package FirstStepSelfStudy;

import java.util.Scanner;

/**
 * Created by Admin on 2017/4/18.
 */
public class CurrentTime {
    public static void main(String[] args) {
        long currentTime,currentSeconds,currentMinutes,currentHours;
        long totalHours,totalSeconds,totalMintues;
        int i;

        System.out.print("Enter the time zone offset to GMT: ");

        Scanner input = new Scanner(System.in);
        i = input.nextInt();

        currentTime = System.currentTimeMillis();
        totalSeconds = currentTime / 1000;
        currentSeconds = totalSeconds % 60;
        totalMintues = totalSeconds / 60;
        currentMinutes = totalMintues % 60;
        totalHours = totalMintues / 60;
        currentHours = totalHours % 24 + i;
        System.out.println("The current time is: " + currentHours+ " : " + currentMinutes + " : " + currentSeconds);
    }
}
