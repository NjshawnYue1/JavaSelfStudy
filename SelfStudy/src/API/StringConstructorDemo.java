package API;

/**
 * @author ShawnYue
 * @date 2018-10-24 20:59
 */
public class StringConstructorDemo {

  public static void main(String[] args) {
    stringConstructorDemo1();
    stringConstructorDemo2();
  }

  private static void stringConstructorDemo2() {
  char[] c = {'a','p','w','q','x'};
    String s = new String(c,1,3);
    String s1 = new String(c);
    System.out.println(s);
    System.out.println(s1);
  }

  public static void stringConstructorDemo1() {
    String s = new String();//String s = "";����Ч��String s = null;
    byte[] arr = {65, 66, 67, 68};

    String s1 = new String(arr);
    System.out.println(s1);//�����˶�Ӧ����ĸֵ���ֽ����鵽�ַ����б������ĸ

  }

}
