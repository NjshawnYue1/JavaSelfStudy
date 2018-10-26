package NextSetpSelfStudy;

import java.util.regex.Pattern;

/**
 * @author ShawnYue
 * @date 2018-10-17 10:11
 */
public class RegexExample {

  public static void main(String[] args) {
    String content = " I am noob "+ "from runoob.com";
    String pattern = ".*runoob.*";
    String string = "123abc";
    String pattern1 = "^[0-9]+abc$";

    boolean isMatch = Pattern.matches(pattern,content);
    System.out.println(string.matches(pattern1));
    System.out.println("×Ö·û´®ÊÇ·ñ°üº¬ÁË 'runoob' "+isMatch);
  }

}
