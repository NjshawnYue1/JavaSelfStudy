package NextSetpSelfStudy;

/**
 * @author ShawnYue
 * @date 2018-10-17 10:40
 */
public class RegexExample2 {

  public static void main(String[] args) {
    String string = "112233445566abc";
    String regex = "\\w{10,}";//字母，数字，下划线出现10次或以上

    System.out.println(string.matches(regex));

//    String regex = "\\d*";

//    System.out.println(string.matches(regex));
    /**
     * 告知此字符串是否匹配给定的正则表达式。
     * 调用此方法的 str.matches(regex) 形式与以下表达式产生的结果完全相同：
     * Pattern.matches(regex, str)
     *
     *
     * */
  }

}
