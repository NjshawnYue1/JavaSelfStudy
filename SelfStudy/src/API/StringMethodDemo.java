package API;

/**
 * @author ShawnYue
 * @date 2018-10-24 21:53
 */
public class StringMethodDemo {

  public static void main(String[] args) {
    /*
     * 按照面向对线给的思想对字符串的功能就行分类
     * "abcd"
     * 获取字符串的长度 int length();
     * 根据位置获取字符 char charAt(int index);
     * 根据字符获取在字符串中的位置 int indexOf(int ch);传入字符或者对应的ASCII码都能返回第一次出现的下标，也可以从指定下标位置开始索引int indexOf(int ch，int fromIndex);
     * int indexOf(String str);
     * int lastIndexOf();参数列表相同，字符串从后往前查找 下标返回-1则说明字符或者字符串不存在
     * 获取子串 String subString(int beginIndex,int endIndex);包括begin但不包括end
     *
     * 转换：把字符串变成字符串数组（字符串切割） String[] (String regx) 正则表达式或者普通规则
     * 字符串返回字符类型数组 char[] toCharArray();
     * 将字符串转成字节数组 返回byte[] getBytes();
     * 字符串中字母的大小写转换 String toUpperCase(); String toLowerCase();
     * 对字符串中的内容进行替换 String replace(char oldch,char newch); 没有对应字符就返回原来的字符串
     * String replace(String s1,String s2);
     * String trim();去除字符串两端的空格
     * String concat(string);
     * String.valueOf() 传入基本数据类型可以转换成字符串
     *
     * 判断两个字符串是否相同 boolean equals(Object object);
     * equalsIgnoreCase(String string);比较两个字符串对象
     * 字符串中是否包含某一个字符串 boolean contains(String string);
     * 字符串是否以指定字符串开头或结尾 boolean startsWith(); boolean endsWith();
     *
     * 比较 compareTo(String string);返回两个字符串之间的ASCII之间的差值
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
    String s = "张三,李四,王五";
    String[] arr = s.split(",");
    for (int i = 0; i < arr.length; i++) {
      System.out.println(arr[i]);
    }
    char[] chs = s.toCharArray();
    for (int i = 0; i < chs.length; i++) {
      System.out.println(chs[i]);
    }
    s = "ab你";
    byte[] bytes = s.getBytes();
    for (int i = 0; i < bytes.length; i++) {
      System.out.println(bytes[i]);//输出了对应的ASCII码
    }
    System.out.println("abc".toUpperCase());
    System.out.println("java".replace('a', 'o'));
    String s1 = "java";
    String s2 = s1.replace('a', 'o');//如果返回的内容相同则对象指向字符串缓冲区的同一个地址
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
