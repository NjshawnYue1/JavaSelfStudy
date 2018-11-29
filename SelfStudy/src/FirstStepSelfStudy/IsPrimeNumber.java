package FirstStepSelfStudy;

public class IsPrimeNumber {

  public static void main(String[] args) {
    isPrimeNormal(50);
  }


  public static void isPrimeNormal(int numArea) {

    for (int num = 2; num <= numArea; num++) {
      boolean bl = true; //循环结束标志
      int i = 2;
      while (bl) {
        if (num % i == 0 && num != i) {
          bl = false;
          break;
        }
        i++;
        if (num <= i) {
          break;
        }
      }

      if (bl) {
        System.out.println(num);
      }
    }

  }

}