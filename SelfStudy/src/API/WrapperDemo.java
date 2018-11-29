package API;

/**
 * @author ShawnYue
 * @date 2018-10-26 10:03
 */
public class WrapperDemo {

  public static void main(String[] args) {
    /*
     * 基本数据类型对象包装类
     * 为了方便操作基本数据类型值将其封装成了对象，在对象中定义了属性和行为
     * 用于描述该对象的类就成为 基本数据类型 包装类
     *
     * 8个基本数据类型
     * Byte
     * Short
     * Integer int类型和String类型的之间的互相转换
     * 基本数据类型转换成字符串可以和""连接，也可以使用String类中的valueOf()方法
     *
     * 字符串装换成基本数据类型
     * 使用包装类中的parseInt() parseDouble()等各个包装类中的转换方法
     * 只有Character中没有parse方法
     * 如果字符串被Integer进行了对象封装
     * 可以使用非静态方法intValue();
     * 将一个Integer对象转成基本数据类型值
     *
     * 不同进制的体现
     * toBinaryString();  2
     * toOctalString();   8
     * toHexString();  16
     * toString(int,radix); 转换成任意进制的数
     *
     *
     * 其他进制装换可将要转换的数用字符串传入，然后把这个数转换成对应进制的数
     * parseInt(string,radix);
     * parseInt("110",10);
     *
     * 对象1.compareTo(对象2); 在数值上的比较 -1 1返回比较结果来代表正负
     *
     * Long
     * Float
     * Double
     * Character
     * Boolean
     *
     * */
    int num = Integer.parseInt("123");//字符串转成整数，静态方法不操作对象 并且可以接受字符串对象
    Integer i = new Integer("123");//如果是Integer对象就可以使用对象的intValue();方法
    Integer integer = new Integer("3");
    Integer integer1 = new Integer(3);
    System.out.println(integer == integer1);//地址
    System.out.println(integer.equals(integer1));//数值
    System.out.println(i.intValue());
    System.out.println(num);
    System.out.println(Integer.MAX_VALUE);//2^31 -1
    System.out.println(Integer.toBinaryString(6));

  }

}
