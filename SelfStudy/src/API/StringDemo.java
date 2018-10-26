package API;

/**
 * @author ShawnYue
 * @date 2018-10-24 20:31
 *
 * String类的特点：字符串对象一旦被初始化就不会被改变
 */
public class StringDemo {

  public static void main(String[] args) {
    stringDemo1();
    stringDemo2();
  }

  private static void stringDemo2() {
    String s = "abc";//在字符串缓冲区创建了一个对象
    String s1 = new String(s);//在堆中创建了两个对象一个new一个字符串
    System.out.println(s);
    System.out.println(s1);
    System.out.println(s1.equals(s));//True 字符串的equals方法覆写了父类中的方法 此时比较的是内容是否相同
    System.out.println(s == s1);//False 比较的是地址
  }

  private static void stringDemo1() {
    /**
     * //字符串在创建时就成为了一个对象，
     * 他被存放在字符串缓冲区，
     * 如果有其他String的变量被赋值为"abc"那么他们指向同一个地址
     * 如果缓冲区没有就建立字符串对象 有就直接使用
     *
     * */
    String str = "abc";
    String str1 = "abc";
    System.out.println(str == str1);
  }
}
