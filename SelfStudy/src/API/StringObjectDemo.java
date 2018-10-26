package API;

/**
 * @author ShawnYue
 * @date 2018-10-25 11:04
 */
public class StringObjectDemo {

  public static void main(String[] args) {
//    String s1 ="abc";
//    String s2 = "abc";

    //intern();对字符串池进行操作

    String s1 = new String("abc");
    String s2 = s1.intern();

    System.out.println(s1 == s2);//false
  }

}
