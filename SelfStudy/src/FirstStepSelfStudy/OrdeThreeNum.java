package FirstStepSelfStudy;

import java.util.Scanner;

/**
 * Created by Admin on 2017/5/27.
 */
public class OrdeThreeNum {
    public static void main(String[] args) {
        int i,j,k;
        Scanner input0 = new Scanner(System.in);
        Scanner input1 = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);

        System.out.println("Please Enter Three Numbers: ");

        i = input0.nextInt();
        j = input1.nextInt();
        k = input2.nextInt();

        if (i > j && j > k){
            System.out.println(i + " " + j + " " + k);
        }else if(i>k && k>j){
            System.out.println(i + " " + k + " " + j);
        }else if (j>i&&i>k){
            System.out.println(j + " " + i + " " + k);
        }else if(j>k&&k>i){
            System.out.println(j + " " + k + " " + i);
        }else if(k>i&&i>j){
            System.out.println(k + " " + i + " " + j);
        }else {
            System.out.println(k + " " + j +  " " + i);
        }



    }
}
