package FirstStepSelfStudy;

public class GetSum {

  public static void main(String[] args) {
    int x, sum = 0;
    int a = 0;
//    for (x = 0; x <= 500; x++) {
//      sum = x + sum;
//    }
//    System.out.println(sum);
//    while (a<=500){
//      a++;
//      sum += a;
//      System.out.println(sum);

    while (a <= 100) {
      a = a + 2;
      sum += a;
    }
    System.out.println(sum);
  }
}

