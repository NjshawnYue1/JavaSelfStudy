package API;

/**
 * @author ShawnYue
 * @date 2018-10-24 20:31
 *
 * String����ص㣺�ַ�������һ������ʼ���Ͳ��ᱻ�ı�
 */
public class StringDemo {

  public static void main(String[] args) {
    stringDemo1();
    stringDemo2();
  }

  private static void stringDemo2() {
    String s = "abc";//���ַ���������������һ������
    String s1 = new String(s);//�ڶ��д�������������һ��newһ���ַ���
    System.out.println(s);
    System.out.println(s1);
    System.out.println(s1.equals(s));//True �ַ�����equals������д�˸����еķ��� ��ʱ�Ƚϵ��������Ƿ���ͬ
    System.out.println(s == s1);//False �Ƚϵ��ǵ�ַ
  }

  private static void stringDemo1() {
    /**
     * //�ַ����ڴ���ʱ�ͳ�Ϊ��һ������
     * ����������ַ�����������
     * ���������String�ı�������ֵΪ"abc"��ô����ָ��ͬһ����ַ
     * ���������û�оͽ����ַ������� �о�ֱ��ʹ��
     *
     * */
    String str = "abc";
    String str1 = "abc";
    System.out.println(str == str1);
  }
}
