package API;

/**
 * @author ShawnYue
 * @date 2018-10-24 21:53
 */
public class StringMethodDemo {

  public static void main(String[] args) {
    /*
     * ����������߸���˼����ַ����Ĺ��ܾ��з���
     * "abcd"
     * ��ȡ�ַ����ĳ��� int length();
     * ����λ�û�ȡ�ַ� char charAt(int index);
     * �����ַ���ȡ���ַ����е�λ�� int indexOf(int ch);�����ַ����߶�Ӧ��ASCII�붼�ܷ��ص�һ�γ��ֵ��±꣬Ҳ���Դ�ָ���±�λ�ÿ�ʼ����int indexOf(int ch��int fromIndex);
     * int indexOf(String str);
     * int lastIndexOf();�����б���ͬ���ַ����Ӻ���ǰ���� �±귵��-1��˵���ַ������ַ���������
     * ��ȡ�Ӵ� String subString(int beginIndex,int endIndex);����begin��������end
     *
     * ת�������ַ�������ַ������飨�ַ����и String[] (String regx) ������ʽ������ͨ����
     * �ַ��������ַ��������� char[] toCharArray();
     * ���ַ���ת���ֽ����� ����byte[] getBytes();
     * �ַ�������ĸ�Ĵ�Сдת�� String toUpperCase(); String toLowerCase();
     * ���ַ����е����ݽ����滻 String replace(char oldch,char newch); û�ж�Ӧ�ַ��ͷ���ԭ�����ַ���
     * String replace(String s1,String s2);
     * String trim();ȥ���ַ������˵Ŀո�
     * String concat(string);
     * String.valueOf() ��������������Ϳ���ת�����ַ���
     *
     * �ж������ַ����Ƿ���ͬ boolean equals(Object object);
     * equalsIgnoreCase(String string);�Ƚ������ַ�������
     * �ַ������Ƿ����ĳһ���ַ��� boolean contains(String string);
     * �ַ����Ƿ���ָ���ַ�����ͷ���β boolean startsWith(); boolean endsWith();
     *
     * �Ƚ� compareTo(String string);���������ַ���֮���ASCII֮��Ĳ�ֵ
     */
    stringMethodDemo_1();
    stringMethodDemo_2();
    stringMethodDemo_3();
    stringMethodDemo_4();
  }

  private static void stringMethodDemo_4() {

    System.out.println("abc".compareTo("aqz"));
  }

  private static void stringMethodDemo_3() {
    String s = "abc";
    String str = "ArrayDemo.java";
    System.out.println(str.startsWith("Array"));
    System.out.println(str.endsWith(".java"));
    System.out.println(str.contains("Demo"));
    System.out.println(s.equalsIgnoreCase("ABC"));
  }

  private static void stringMethodDemo_2() {
    String s = "����,����,����";
    String[] arr = s.split(",");
    for (int i = 0; i < arr.length; i++) {
      System.out.println(arr[i]);
    }
    char[] chs = s.toCharArray();
    for (int i = 0; i < chs.length; i++) {
      System.out.println(chs[i]);
    }
    s = "ab��";
    byte[] bytes = s.getBytes();
    for (int i = 0; i < bytes.length; i++) {
      System.out.println(bytes[i]);//����˶�Ӧ��ASCII��
    }
    System.out.println("abc".toUpperCase());
    System.out.println("java".replace('a', 'o'));
    String s1 = "java";
    String s2 = s1.replace('a', 'o');//������ص�������ͬ�����ָ���ַ�����������ͬһ����ַ
    System.out.println(s1.equals(s2));
    System.out.println("-"+"    a b c   ".trim()+"-");

  }

  private static void stringMethodDemo_1() {
    String s = "abcdefg";

    System.out.println(s.length());
    System.out.println(s.charAt(2));
    System.out.println(s.indexOf('d'));
    System.out.println(s.lastIndexOf('e'));
    System.out.println(s.substring(2, 4));

  }

}
