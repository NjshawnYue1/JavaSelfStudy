import org.junit.Test;

import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @author ShawnYue
 * @date 2018-10-13 16:44
 */
public class TestFunDemo2 {

    public static void main(String[] args) throws ClassNotFoundException {
//    String a;
//    Scanner scanner = new Scanner(System.in);
//    double c = scanner.nextDouble();
//    String[] b = new String[1];
//    a = c+"";
//    b[0] = a;
//    for(int i=0;i<b[0].length();i++) {
//      if(b[0].charAt(i)=='.')
//      System.out.println(b[0].charAt(i));
        test2();
    }

    public static void test() throws ClassNotFoundException {
        Class<?> claz = Class.forName("java.lang.String");
        Method[] methods = claz.getDeclaredMethods();

        StringBuilder s = new StringBuilder("aaabbb");
        s.reverse();
        System.out.println(s);
//      for(Method m :methods){
//        System.out.println(m);
//
//      }
    }

    public static void test2() {
        int sum = 0;
        for (int i = 0; i < 100; i = i + 2) {
            sum += i;
        }
        System.out.println(sum);
    }


    private int test3(int[] ints) {
        int index = 0;
        int min = ints[0];

        for (int i = 0; i < ints.length; i++) {
            if (ints[i] < min) {
                min = ints[index];
                index = i;
            }
        }
        return index;
    }

    @Test
    public void quickSort() {
        int[] i = new int[]{1, 4, 9, 3, 2};
        int length = i.length;
        int[] ta = new int[i.length];
        while (length > 0) {
            int target = test3(i);
            for (int k = 0; k < i.length; k++) {
                ta[k] = target;
            }

            length--;
        }
        System.out.println(Arrays.toString(ta));
    }
}
