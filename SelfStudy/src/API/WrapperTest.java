package API;

import java.util.Arrays;

/**
 * @author ShawnYue
 * @date 2018-10-26 10:53
 *
 * 对一个字符串中的数值进行从小到大的排序
 *
 * "20 78 9 -7 88 36 29"
 */
public class WrapperTest {

  public static void main(String[] args) {
    String[] strings = sortNum("20 78 9 -7 88 36 29");
    sortNumString(strings);
  }

  private static void sortNumString(String[] strings) {
    int[] ints = toIntArray(strings);
    sortArray(ints);
    String temp = arrayToString(ints);
    System.out.println(temp);
  }

  private static String arrayToString(int[] ints) {
    StringBuilder stringBuilder = new StringBuilder();
    for (int i = 0; i < ints.length; i++) {
      if (i != ints.length - 1) {
        stringBuilder.append(ints[i] + " ");
      } else {
        stringBuilder.append(ints[i]);
      }
    }
    return stringBuilder.toString();
  }

  private static void sortArray(int[] ints) {
    Arrays.sort(ints);
  }

  private static int[] toIntArray(String[] strings) {
    int[] ints = new int[strings.length];
    for (int i = 0; i < strings.length; i++) {
      ints[i] = Integer.parseInt(strings[i]);
    }
    return ints;
  }

  private static String[] sortNum(String strb) {
    return strb.split(" ");
  }
}