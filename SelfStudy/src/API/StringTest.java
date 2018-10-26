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
   * ȥ���ַ������˵��ַ� ��������trim();
   *
   * */
  private static String test4(String string) {
    int start = 0, end = string.length() - 1;
    while (start <= end && string.charAt(start) == ' ') {
      start++;
    }
    while (start <= end && string.charAt(end) == ' ') {
      end--;
    }
    return string.substring(start, end + 1);
  }


  /*
   * �����ַ������� �����ֵ�˳����д�С���������
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
   * һ���Ӵ��������г��ֵĴ���
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
     * �ж�����Ӵ������ȿ��̵��ַ����Ƿ��ڳ����ַ�������
     * ������ڣ���ö̵��ַ�����������Ӵ�
     * ������ǣ���Ӧ��ѭ���ж϶ε��ַ������ճ��ȵݼ��ķ�ʽȡ�Ӵ�ȥ�������ж��Ƿ����
     *
     * */

    for (int i = 0; i < min.length(); i++) {
      for (int j = 0, k = min.length() - i; k != min.length() + 1; j++, k++) {
        String s = min.substring(j, k);//�Զ̵��Ӵ����в���
//        System.out.println(s);
        if (max.contains(s)) {
          return s;
        }
      }
    }
    return null;
  }
}

