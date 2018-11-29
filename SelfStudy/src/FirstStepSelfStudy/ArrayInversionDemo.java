package FirstStepSelfStudy;

import java.util.Scanner;

public class ArrayInversionDemo {

  public static void main(String[] args) {
    int[] array = new int[6];
    System.out.println("Enter six numbers");
    for(int j =0;j<array.length;j++){
      Scanner scanner = new Scanner(System.in);
      array[j] = scanner.nextInt();
    }
    arrayInversion(array);
    for (int j=0;j<array.length;j++){
      System.out.println(array[j]+"");

    }
    return;

  }
  public static int[] arrayInversion(int[] array){
    int i;
    for(i=0;i<array.length/2;i++){
      int temp = array[array.length-1-i];
      array[array.length-1-i] = array[i];
      array[i] = temp;
    }
    return array;
  }

}
