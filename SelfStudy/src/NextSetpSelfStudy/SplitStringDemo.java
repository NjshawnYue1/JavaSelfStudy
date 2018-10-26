package NextSetpSelfStudy;


/**
 * @author ShawnYue
 * @date 2018-10-18 10:44
 */
public class SplitStringDemo {

  public static void main(String[] args) {
    String str1 = "\\|";
    String str2 = "abc|123|aaa|888";

    String[] str3 = str2.split(str1);
    for (int i = 0; i < str3.length; i++) {
      System.out.println(str3[i]);
    }
  }

}
