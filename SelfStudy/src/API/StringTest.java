package API;

/**
 * @author ShawnYue
 * @date 2018-10-25 11:13
 */


public class StringTest {

  public static void main(String[] args) {
    test1();
    int count = test2("nbasdsanbaqwnbajjlnba", "nba");
    System.out.println(count);
    String string = test3("nsuabcdiwq", "sydiowqabcdnnk");
    System.out.println(string);
    String string1 = test4("    -ab   c-  ");
    System.out.println(string1);
  }

  /*
   * 去除字符串两端的字符 功能类似trim();
   *
   * */
  private static String test4(String string) {
    int start = 0, end = string.length() - 1;
    while (start <= end && string.charAt(start) == ' ') {
      start++;
    }
    while (start <= end && string.charAt(end) == ' ') {
      end--;
    }//首位想中间缩进
    return string.substring(start, end + 1);
  }


  /*
   * 给定字符串数组 按照字典顺序进行从小到大的排序
   *
   * {"nba","abc","cbd","zz","qq","haha"}
   *
   */
  private static void test1() {
    String[] strings = {"nba", "abc", "cbd", "zz", "qq", "haha"};
    for (int i = 0; i < strings.length; i++) {
      for (int j = i + 1; j < strings.length; j++) {
        if (strings[i].compareTo(strings[j]) > 0) {
          String temp;
          temp = strings[i];
          strings[i] = strings[i + 1];
          strings[i + 1] = temp;
        }
      }
      System.out.println(strings[i]);
    }
  }

  /*
   * 一个子串在整串中出现的次数
   * "nbasdsanbaqwnbajjlnba"
   *
   * */
  private static int test2(String string, String key) {
    int count = 0;
    int index = 0;
    while ((index = string.indexOf(key, index)) != -1) {
      index = index + key.length();
      count++;
    }
    return count;
  }

  private static String test3(String str1, String str2) {
    String max, min;
    max = (str1.length() > str2.length()) ? str1 : str2;
    min = max.equals(str1) ? str2 : str1;
    /*
     * 判断最大子串则首先看短的字符串是否在长的字符串汇中
     * 如果存在，则该短的字符串就是最大子串
     * 如果不是，则应该循环判断段的字符串依照长度递减的方式取子串去长串中判断是否存在
     *
     * */

    for (int i = 0; i < min.length(); i++) {
      for (int j = 0, k = min.length() - i; k != min.length() + 1; j++, k++) {
        String s = min.substring(j, k);//对短的子串进行操作
//        System.out.println(s);
        if (max.contains(s)) {
          return s;
        }
      }
    }
    return null;
  }
}
