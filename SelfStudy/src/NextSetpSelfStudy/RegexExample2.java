package NextSetpSelfStudy;

/**
 * @author ShawnYue
 * @date 2018-10-17 10:40
 */
public class RegexExample2 {

  public static void main(String[] args) {
    String string = "112233445566abc";
    String regex = "\\w{10,}";//��ĸ�����֣��»��߳���10�λ�����

    System.out.println(string.matches(regex));

//    String regex = "\\d*";

//    System.out.println(string.matches(regex));
    /**
     * ��֪���ַ����Ƿ�ƥ�������������ʽ��
     * ���ô˷����� str.matches(regex) ��ʽ�����±��ʽ�����Ľ����ȫ��ͬ��
     * Pattern.matches(regex, str)
     *
     *
     * */
  }

}
